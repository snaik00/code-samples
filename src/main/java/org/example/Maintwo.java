package org.example;

public class Maintwo {

    static void methodOne()

    {
        System.out.println("check");
    }

  static void methodTwo(int val)

    {
     System.out.println("value is " + val);
    }

    public static void main(String[] args) {
        Maintwo obj1= new Maintwo();

       methodOne();
       obj1.methodTwo(200);

    }
}