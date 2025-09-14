package com.x2space.lambda;


public class Card {
    private String size;
    private String color;
    private int sizeIndex;
    private int colorIndex;

    public Card(String size, String color, int sizeIndex, int colorIndex) {
        this.size = size;
        this.color = color;
        this.sizeIndex = sizeIndex;
        this.colorIndex = colorIndex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSizeIndex() {
        return sizeIndex;
    }

    public void setSizeIndex(int sizeIndex) {
        this.sizeIndex = sizeIndex;
    }

    public int getColorIndex() {
        return colorIndex;
    }

    public void setColorIndex(int colorIndex) {
        this.colorIndex = colorIndex;
    }

    @Override
    public String toString() {
        return size + color;
    }
}
