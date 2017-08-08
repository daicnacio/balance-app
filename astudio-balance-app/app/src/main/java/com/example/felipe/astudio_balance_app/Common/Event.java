package com.example.felipe.astudio_balance_app.Common;

import java.util.Date;
import java.util.List;

/**
 * Created by felipe on 08-08-17.
 */

public class Event {
    private int id;
    private String name;
    private Date date;
    private double quantity;
    private User payer;
    private List<User> userList;

    public Event(int id, String name, Date date, double quantity, User payer, List<User> group) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.quantity = quantity;
        this.payer = payer;
        this.userList = group;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public User getPayer() {
        return payer;
    }

    public void setPayer(User payer) {
        this.payer = payer;
    }

    public List<User> getGroup() {
        return userList;
    }

    public void addUsers(User user){
        this.userList.add(user);
    }
}
