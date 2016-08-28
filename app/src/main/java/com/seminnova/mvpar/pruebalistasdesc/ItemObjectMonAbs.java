package com.seminnova.mvpar.pruebalistasdesc;

public class ItemObjectMonAbs {

    private String name;
    private String address;

    public ItemObjectMonAbs(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

}
