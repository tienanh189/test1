package com.example.newapp;

public class Student {
    private int Id;
    private String Name,Phone,Address;

    public Student(int id, String name, String phone, String add, int id1)
    {
        this.Id=id;
        this.Name=name;
        this.Phone=phone;
        this.Address=add;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
