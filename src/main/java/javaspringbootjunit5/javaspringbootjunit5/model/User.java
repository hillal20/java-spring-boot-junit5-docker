package javaspringbootjunit5.javaspringbootjunit5.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    int id;
    String name;
    String job;

    public User(int id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
