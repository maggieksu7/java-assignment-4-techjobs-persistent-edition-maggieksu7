package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Error: Required field.")
    @Size(max = 75, message = "Error: Cannot be longer than 75 characters.")
    private String location;

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
