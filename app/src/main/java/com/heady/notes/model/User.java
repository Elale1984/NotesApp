package com.heady.notes.model;

import java.util.Date;

public class User {

    int user_id;
    String user_email;
    String user_password;
    String user_first_name;
    String user_last_name;
    Date user_start_date;

    public User() {
    }

    public User(int user_id, String user_email, String user_password, String user_first_name, String user_last_name, Date user_start_date) {
        this.user_id = user_id;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_first_name = user_first_name;
        this.user_last_name = user_last_name;
        this.user_start_date = user_start_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_first_name() {
        return user_first_name;
    }

    public void setUser_first_name(String user_first_name) {
        this.user_first_name = user_first_name;
    }

    public String getUser_last_name() {
        return user_last_name;
    }

    public void setUser_last_name(String user_last_name) {
        this.user_last_name = user_last_name;
    }

    public Date getUser_start_date() {
        return user_start_date;
    }

    public void setUser_start_date(Date user_start_date) {
        this.user_start_date = user_start_date;
    }
}
