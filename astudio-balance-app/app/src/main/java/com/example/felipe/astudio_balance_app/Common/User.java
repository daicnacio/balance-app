package com.example.felipe.astudio_balance_app.Common;

import java.util.List;

/**
 * Created by felipe on 08-08-17.
 */

public class User {
    private int id;
    private String name;
    private String shrtname;
    private List<Transaction> transx = null;

    public User(int id, String name, String shrtname) {
        this.id = id;
        this.name = name;
        this.shrtname = shrtname;
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

    public String getShrtname() {
        return shrtname;
    }

    public void setShrtname(String shrtname) {
        this.shrtname = shrtname;
    }

    public void addTransx(Transaction tx){
        this.transx.add(tx);
    }
}
