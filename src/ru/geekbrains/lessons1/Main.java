package ru.geekbrains.lessons1;

import javax.imageio.ImageIO;
import javax.swing.text.html.parser.Parser;

public class Main {

    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 345612;
        long d = 546145454L;
        float e = 1.12121f;
        double f = 212.4545;
        char ch = '*';
        boolean val = true;
        String name = "Pavel";
        System.out.println(equation(a, b, c, d));
        System.out.println(compare(18, 3));
        comparison(0);
        System.out.println(negativeNumber(-1));
        helloName(name);
        year(2020);
    }

    public static long equation(byte a, short b, int c, long d) {
        long x = (a * (b + (c / d)));
        return x;
    }

    public static boolean compare(int a, int b) {
        boolean answer = false;
        int sum = a + b;
        if (sum >= 10 && sum <= 20)
            answer = true;

        return answer;

    }

    public static void comparison(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean negativeNumber(int a) {
        boolean negativeNumber = false;
        if (a < 0)
            negativeNumber = true;
        return negativeNumber;
    }
    public static void helloName (String a){
        System.out.println("Привет, " +a + ".");
    }
    public static void year (int year){
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " високосный год.!!");}
        else System.out.println( year + "не високосный год.!!");
    }

}