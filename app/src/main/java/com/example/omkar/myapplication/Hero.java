package com.example.omkar.myapplication;

/**
 * Created by Belal on 9/14/2017.
 */

public class Hero {


    String name,post,mail,number,intercom;int i=0;


    public Hero(String name, String post, String mail, String number, String intercom) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.number = number;
        this.intercom = intercom;
    }


    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getMail() {
        return mail;
    }

    public String getNumber() {
        return number;
    }

    public String getIntercom() {
        return intercom;
    }
}
