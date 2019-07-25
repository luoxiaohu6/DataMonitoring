package com.shiyanshi.dashuju.Pojo;

public class User {

    private String Username;

    private String PassWord;

    private  String Position;

    public User(String username, String passWord) {
        Username = username;
        PassWord = passWord;
    }

    public User(String username, String passWord, String position) {
        Username = username;
        PassWord = passWord;
        Position = position;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

}
