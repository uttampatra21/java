import java.util.Scanner;

import javax.xml.transform.Source;

//! 01::  Enter 3 numbers from the user & make a function to print their average.

// public class questions {
//     public static int average(int a, int b, int c) {
//         int avg = (a + b + c) / 3;
//         return avg;
//     }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int c = sc.nextInt();
//     int avg = (a+b+c)/3;
//     System.out.println("The avarage of three number id "+ avg);
//     average(a, b, c);
//     }
// }

//! 02 ::: Write a function to print the sum of all odd numbers from 1 to n.

// public class questions {
//     public static void oddNumber(int n){
//         for(int i = 1; i <= n; i++){
//             if(i % 2 != 0){
//                 System.out.println(i);
//             }
//         }
//         return;
//     }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     oddNumber(n);
//     }
// }

//! 03:: Write a function which takes in 2 numbers and returns the greater of those two.

// public class questions {
//     public static int numberGreater(int a, int b){
//         int greater = a > b;
//         return greater;
//     }
// public static void main(String[] args){
//     int a = 20;
//     int b = 10;
//     if(a > b){
//         System.out.println(a);
//     }else{
//         System.out.println(b);
//     }
//     numberGreater(a, b);
//     }
// }

//! Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
 
// public class questions{
//     public static int voteEligiblity(int age){
//         if (age > 18){
//             System.out.println("Your Eligiblity for vote");
//         }else{
//             System.out.println("You are not eligible to vote");
//         }
//         return age;
//     }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int age = sc.nextInt();
//     voteEligiblity(age);
//     }
// }

//! Write an infinite loop using do while condition.
// public class questions {
// public static void main(String[] args){
//     int i = 0;
//     do{
//         System.out.println(i);
//         i--;
//     }while(i<10);
//     }
// }

//! Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x2.
// 

// public class questions{
//     public static int powerNumber(int x, int y){
//         for(int i = 1; i<= y; i++){
//             int power = (x *i);
//             System.out.println(power);
//         }
//         return x;
//     }
// public static void main(String[] args){
//     int x = 5;
//     int y = 3;
//     powerNumber(x, y);
//     }
// }