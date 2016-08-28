package com.seminnova.mvpar.pruebalistasdesc;

public class ItemObjectMonAbs {

    private String name;
    private String address;
    private String address2;

    public ItemObjectMonAbs(String name, String address, String address2) {
        this.name = name;
        this.address = address;
        this.address2 = address2;
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

    public String getAddress2() {
        return address2;
    }

}
