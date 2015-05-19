package com.hackingedu;

import java.io.Serializable;

/**
 * Created by SCS_USER on 5/18/2015.
 */
public class UserData implements Serializable{
    private String Username;
    private String Age;
    private String City;

    public String getUsername(){
        return Username;
    }

    public String getAge(){
        return Age;
    }

    public String getCity(){
        return City;
    }

    public void setUsername(String name){
        Username = name;
    }
    public void setAge(String age){
        Age = age;
    }
    public void setCity(String city){
        City = city;
    }



}
