package com.example.firstfxme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rectangle {
    double h, l;
    String color;

    public double area() {
        try {
            return h * l;
        } catch (Exception e) {
            if (h < 0 || l < 0) ;
        }
        return 0;

    }

    public Rectangle(double h, double l, String color) {
        this.h = h;
        this.l = l;
        this.color=color;
    }

    private static ArrayList<Rectangle> readTriangles(String file) {
        try {
            Scanner scanner = new Scanner(new File(file));
            ArrayList<Rectangle> rectangles = new ArrayList<>();
            while(scanner.hasNext()) {
                String s = scanner.nextLine();
                String[] rec= s.split(" ");
                Map<Double, String> newRect= new HashMap<>();
                Rectangle r =new Rectangle();
                rectangles.add(r);
            }
            return rectangles;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }

    private static Rectangle makeRcFromStr(String s) {

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "h = " + h +
                ", l = " + l +color+ ", area = " +
                area();
    }
}
