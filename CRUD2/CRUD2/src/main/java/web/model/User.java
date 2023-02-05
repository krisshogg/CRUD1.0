package web.model;

/*
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
*/

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @NotEmpty(message = "Name should not be empty!")
    //@Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters!")
    private String name;

    private String question;

    // @NotEmpty(message = "Email should not be empty!")
    //@Email(message = "Email should be valid!")
    private String email;

    public User() {

    }

    public User(int id, String name, String question, String email) {
        this.id = id;
        this.name = name;
        this.question = question;
        this.email = email;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", question=" + question +
                ", email='" + email + '\'' +
                '}';
    }
}
