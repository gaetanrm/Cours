package fr.romero.tp3.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity(name="locations")
@Access(AccessType.FIELD)
public class Location {

    @ManyToMany(mappedBy = "locations")
    @JsonIgnore // Pour ne pas produire des cycles
    private List<User> users;

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
