package priv.bruce.demoproject.hibernatedemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by jiezhou on 2017/6/15.
 */
@Entity()
//@Table(name="users")
public class Users {

    public Users(){

    }

    @Id
    @GeneratedValue
    public Long id ;

    public String name;
    public String email;
    public String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
