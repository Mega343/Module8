package com.goit.gojavaonline.module8;

public class Astra extends Flower implements Comparable<Flower>{

  private   String color;
  private   int price;
  private   int lenght;



    public Astra(String color, int lenght, int price) {
        this.color = color;
        this.lenght = lenght;
        this.price = price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getLenght() {
        return lenght;
    }

    @Override
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Astra " +
                "color='" + color + '\'' +
                ", price=" + price +
                ", lenght=" + lenght;
    }

    @Override
    public int compareTo(Flower o) {
        return this.getPrice() - o.getPrice();
    }
}