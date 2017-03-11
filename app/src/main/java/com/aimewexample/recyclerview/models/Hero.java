package com.aimewexample.recyclerview.models;

/**
 * Created by aimew on 10/03/2017.
 */

public class Hero {
    String name;
    String superPower;
    String gender;
    int avatar;

    public Hero(String name, String superPower, String gender, int avatar) {
        this.name = name;
        this.superPower = superPower;
        this.gender = gender;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
