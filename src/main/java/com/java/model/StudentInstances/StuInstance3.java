package com.java.model.StudentInstances;

public class StuInstance3 {
    public String username;
    public String number;
    public String state;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "StuInstance3{" +
                "username='" + username + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
