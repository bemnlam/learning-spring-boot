package com.examplehotel.roomwebapp.models;

import java.lang.reflect.Constructor;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

public class Room {
    private long id;
    private String number;
    private String name;
    private String info;

    public Room() {

    }

    public Room(long id, String number, String name, String info) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.info = info;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getNumber() {
        return this.number;
    };
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getName() {
        return this.name;
    };
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getInfo() {
        return this.info;
    };
    
    public void setInfo(String info) {
        this.info = info;
    }
}
