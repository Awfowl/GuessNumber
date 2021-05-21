package guessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class guess {

    public static void main(String[] args) {


        Random rand = new Random();

        System.out.println("enter number less than 10");

        int chanceNumber = rand.nextInt(10);


        guessIsTrueOrNot(chanceNumber); }

     public static void guessIsTrueOrNot( int random){

          Scanner input = new Scanner(System.in);

            int user = 0 ;

            for (int i = 0 ; i < 3; i++ ) {
                user = input.nextInt();
                if (user == random) {
                    System.out.println("win !!! ");break;}
                   if (user > random) {
                        System.out.println("bigs than of number-"); }
                         if (user < random) {
                            System.out.println("less than of number-"); }

                } if(user != random){
                         System.out.println("lose"); }

            }
        }


