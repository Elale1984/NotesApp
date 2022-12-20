package com.heady.notes.model;

import java.util.Date;

public class Note {
    int note_id;
    String note_title;
    String note_body;
    Date note_date;


    public Note(int note_id, String note_title, String note_body, Date note_date) {
        this.note_id = note_id;
        this.note_title = note_title;
        this.note_body = note_body;
        this.note_date = note_date;
    }

    public int getNote_id() {
        return note_id;
    }

    public void setNote_id(int note_id) {
        this.note_id = note_id;
    }

    public String getNote_title() {
        return note_title;
    }

    public void setNote_title(String note_title) {
        this.note_title = note_title;
    }

    public String getNote_body() {
        return note_body;
    }

    public void setNote_body(String note_body) {
        this.note_body = note_body;
    }

    public Date getNote_date() {
        return note_date;
    }

    public void setNote_date(Date note_date) {
        this.note_date = note_date;
    }
}
