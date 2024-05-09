package com.example.polymorphism;

public class Shape {

//    public void draw() {
//        System.out.println("Draw Shape");
//    }
//    public void draw(String color) {
//        System.out.println("Draw Shape with color: " + color);
//    }
//    public void draw(String color , String shape) {
//        System.out.println("Draw Shape with color: " + color + " and shape: " + shape);
//
//    }

    public int draw(int x){
       return x ;
    }
    public int draw(int x, int y){
          return x+y+2;
    }
    public int draw(int x, int y, int z){
      return x+y+z*3;
    }


    public void draw(String... v){
        System.out.println("ub ");

    }
}
