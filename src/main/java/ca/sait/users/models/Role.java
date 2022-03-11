package ca.sait.users.models;

import java.io.Serializable;

/**
 * Represents a role
 *
 * @author Vidhy Patel
 */
public class Role implements Serializable {

    private String name;
    private int id;

    public Role() {
    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
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

}
