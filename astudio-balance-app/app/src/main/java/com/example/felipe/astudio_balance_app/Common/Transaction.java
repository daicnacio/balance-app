package com.example.felipe.astudio_balance_app.Common;

/**
 * Created by felipe on 07-08-17.
 */

public class Transaction {
    private int id;
    private User from;
    private User to;
    private double quantity;
    private Event event;

    public Transaction(int id, User from, User to, double quantity, Event event) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
