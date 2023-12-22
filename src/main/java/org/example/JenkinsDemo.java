package org.example;

public class JenkinsDemo {
    public int sum(int a, int b) {
        return a+b;
    }

    public int multiplication(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Simple Java code");
        JenkinsDemo obj = new JenkinsDemo();
        System.out.println("Sum is "+obj.sum(10, 20));
        System.out.println("Product is "+obj.multiplication(10, 20));
    }
}
