package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point newPoint = new Point(20,30);
        System.out.println(newPoint);
        Point point = new Point(5,6);
        System.out.println(point.getX());
    }
}