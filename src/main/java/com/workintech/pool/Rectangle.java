package com.workintech.pool;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = Math.max(width,0);
        this.length = Math.max(length,0);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea(){
        return this.width*this.length;
    }
}
