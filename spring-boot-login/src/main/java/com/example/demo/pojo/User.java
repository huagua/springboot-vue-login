package com.example.demo.pojo;

public class User {
    private int id;
    private String username;
    private String password;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }


    public void setUsername(String name){
        this.username = name;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
