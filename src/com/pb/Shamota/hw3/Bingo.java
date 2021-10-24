package com.pb.Shamota.hw3;

//import javax.swing.*;

import java.util.Scanner;

public class Bingo {
   //import.java.random.nextInt{
    public static void main(String[] args) {
       System.out.println("Вгадайте задумане число від 0 до 100");
       System.out.println("Коли набридне вгадувати - наберіть exit");

       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       int y = 38;
       if (y < 0 | y > 100)
           System.out.println("Ви ввели число з невірного діапазону");
           //double x = 0 + Math.random()*100;

       while(true){
           if (y > x){System.out.println("Запропоноване число більше загаданого");
       }else if (y < x) System.out.println("Запропоноване число менше загаданого");

       final int max_Attempt= 101;
       int attempt = 0;
            Scanner in = new Scanner(System.in);
        while(max_Attempt>attempt) {
            attempt++;

            if (x == y) {
                System.out.println ("Ви вгадали загадане число з" + attempt + "спроби");}
                System.out.println("Кінець гри");}}}}