package com.examplehotel.roomwebapp.models;

public class Staff {
    private String guid;
    private String firstname;
    private String lastname;
    private String position;

    public Staff() {

    }

    public Staff(String guid, String firstname, String lastname, String position) {
        this.guid = guid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
    }

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
    
    public String getFirstname() {
        return this.firstname;
    };
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return this.lastname;
    };
    
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
    
    public String getPosition() {
        return this.position;
    };
    
    public void setPosition(String position) {
        this.position = position;
    }
}
