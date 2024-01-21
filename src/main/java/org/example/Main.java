package org.example;

/*
 * https://medium.com/@erdgn.ilys/java-lambda-expressions-c088c80fd4c7
 *
 *
 * */
public class Main {
    public static void main(String[] args) {
        MyContext myContext;

        myContext = () -> 14.53;
        System.out.println("Value: " + myContext.getVal());

        myContext = () -> Math.random() * 60;
        System.out.println("Random Value: " + myContext.getVal());

//        myContext = () -> "14.53";  // Hata, Compile edilmez !
    }
}