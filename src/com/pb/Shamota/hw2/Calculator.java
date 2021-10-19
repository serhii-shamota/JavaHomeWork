package com.pb.Shamota.hw2;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // char num = 'A';
        int operand1;
        int operand2;

        System.out.println("Введіть перше число: ");
        operand1 = scan.nextInt();
        System.out.println("Введіть друге число: ");
        operand2 = scan.nextInt();
    //  {
    //
    //  }

    //  symbol = scan.next();
    //  {

        System.out.println("Введіть оператор: (+,-,*,/)");
    //}
        String sign = scan.next(); // + - * /

        switch(sign){
            case "+":
                System.out.println(operand1 + operand2);
                break;

            case "-":
                System.out.println(operand1 - operand2);
                break;

            case "*":
                System.out.println(operand1 * operand2);
                break;

            case "/":
                if (operand2 == 0)
                    System.out.println("Помилка"); else
                System.out.println(operand1 / operand2);
                break;

                        default: {
                        System.out.println("Заборонена дія");
                        }}}}