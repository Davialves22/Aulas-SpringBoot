package br.com.erudio.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String firstName;
    private String lastName;
    private String adress;
    private String gender;

    public Person() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (id != null ? id.hashCode() : 0);
        result = prime * result + (firstName != null ? firstName.hashCode() : 0);
        result = prime * result + (lastName != null ? lastName.hashCode() : 0);
        result = prime * result + (adress != null ? adress.hashCode() : 0);
        result = prime * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        } else {
            Person person = (Person) obj;

            if (!Objects.equals(id, person.id)) {
                return false;
            } else if (!Objects.equals(firstName, person.firstName)) {
                return false;
            } else if (!Objects.equals(lastName, person.lastName)) {
                return false;
            } else if (!Objects.equals(adress, person.adress)) {
                return false;
            } else if (!Objects.equals(gender, person.gender)) {
                return false;
            }

            return true;
        }
    }
}
