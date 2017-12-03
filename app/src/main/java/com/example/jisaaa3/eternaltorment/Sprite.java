package com.example.jisaaa3.eternaltorment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ArrayList;

/**
 * Created by ama02 on 11/25/2017.
 */

public abstract class Sprite {
    private Vector2Point location;

    private String type;
    private String bitmapName;
    private String spriteDirection;

    public abstract boolean update(long fps, ArrayList<Sprite> spriteList);

    /*
        Setter and getters for the bitmap

     */

    public String getBitmapName() {
        return this.bitmapName;
    }

    public void setBitmapName(String bitmapName) {
        this.bitmapName = bitmapName;
    }


    /*
        Setter and getter for sprite location
     */

    public Vector2Point getLocation() {
        return this.location;
    }

    public void setLocation(float x, float y) {
        this.location = new Vector2Point();
        this.location.x = x;
        this.location.y = y;
    }

    public String getSpriteDirection() {
        return spriteDirection;
    }

    public void setSpriteDirection(String spriteDirection) {
        this.spriteDirection = spriteDirection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
