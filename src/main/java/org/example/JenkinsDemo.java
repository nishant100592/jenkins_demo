package org.example;

public class JenkinsDemo {
    public int sum(int a, int b) {
        return a+b;
    }

    public int division(int a, int b) {
        return b/a;
    }

    public int multiplication(int a, int b) {
        return a*b;
    }

    public int difference(int a, int b) {
        return b-a;
    }

    public static void main(String[] args) {
        System.out.println("Simple Java code");
        System.out.println("Changes with Docker for Github actions");
        JenkinsDemo obj = new JenkinsDemo();
        System.out.println("Sum is "+obj.sum(10, 20));
        System.out.println("Difference is "+obj.difference(20, 10));
        System.out.println("Product is "+obj.multiplication(10, 20));
        System.out.println("Quotient is "+obj.division(10, 20));
    }
}
