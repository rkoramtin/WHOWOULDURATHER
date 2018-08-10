package com.rkoramtin.whowouldurather;

/**
 * Created by Asus on 8/1/2018.
 */

public class Crushes {
    private String name;
    private int ID;
    public Crushes(String _name,int _ID)
    {
        setName(_name);
        setID(_ID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
