package org.example;

import java.util.List;

public class Student {
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
    @Override
    public String toString() {
        return "Name: "+name+", ID: "+id+", Address: ["+add+"], Phone Numbers: "+ph;
    }

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;
}
