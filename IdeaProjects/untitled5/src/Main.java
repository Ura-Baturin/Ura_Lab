package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Твій Текст:");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        System.out.println("Твій Текст Великими літерами:" +"\n"+s.toUpperCase());

    }
}

