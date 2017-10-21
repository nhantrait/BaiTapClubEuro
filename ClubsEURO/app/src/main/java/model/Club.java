package model;

import android.content.Intent;

import java.io.Serializable;

/**
 * Created by nhan on 10/16/2017.
 */

public class Club implements Serializable {
    private int Image;
    private String Name;
    private String National;
    private int Number;



    public Club (){}
    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNational() {
        return National;
    }

    public void setNational(String national) {
        National = national;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public Club(int image , String name, String national, int number) {
        this.Image = image;
        this.Name = name;
        this.National = national;
        this.Number = number;

    }
}
