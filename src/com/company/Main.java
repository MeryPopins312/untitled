package com.company;

public class Main {

        public static void main(String[] args) {
            walk(101, 2);
            walk(33, 22);
            walk(27, 15);
            walk(19, 10);
            walk(13, 0);
        }

        public static void walk(int temp, int age) {
            if ((age >= 20 && age < 45) && (temp >= -20 && temp < 30)) {
                System.out.println("Можно идти гулять");
                return;
            }
            if (age<20  &&(temp >=0 && temp <28)){
                System.out.println("Можно идти гулять");
                return;
            }
            if (age>45 && (temp > -10 && temp <25)){
                System.out.println("Можно идти гулять");
                return;
            }
            else {
                System.out.println("Оставайтесь дома");
                return;
            }
        }
        public static void generateRandomAge(int a , int b){
            a = 0;
            b = 10;
            int x= a + (int)(Math.random() * ((b - a) + 1));
            System.out.println("Случайное число x: " + x);
        }

        
}
