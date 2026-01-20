package org.example;

public class Objectcreation {

    static void methodOne()

    {
        System.out.println("check");
    }

  static void methodTwo(int val)

    {
     System.out.println("value is " + val);
    }

    public static void main(String[] args) {
        Objectcreation obj1= new Objectcreation();

       methodOne();
       obj1.methodTwo(200);

    }
}