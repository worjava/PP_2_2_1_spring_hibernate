package hiber.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;


   @OneToOne(mappedBy ="car" )
   @Cascade(org.hibernate.annotations.CascadeType.ALL)
    public User user;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
               "id=" + id +
               ", model='" + model + '\'' +
               ", series=" + series +
               '}';
    }

    public Car() {


    }
    public Car(String model, int series, User user) {
        this.model = model;
        this.series = series;
        this.user = user;
    }

}