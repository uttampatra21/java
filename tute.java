// ! challenge 1
// public class tute {
//     public static void main(String[] args){
//      System.out.println("*");
//      System.out.println("**");
//      System.out.println("***");
//      System.out.println("****");
//      System.out.println("*****");
//     }
// }

//! VARIBLES IN JAVA :-
//! jAVA IS A TYPED LANGUAGE WHERE YOU HAVE TO DEFINE ITS TYPE BEFORE INITIALIZATION BUT IN JAVASCRIPT WE DONT FOLLOW THIS ARGUMENT;

// public class tute {
// public static void main(String[] args){
//     // String name = "Tonty Stark";
//     // int a = 23;
//     // int b = 32;
//     // int age = 34;
//     // double price = 23.44;
//     // System.out.print(a+b);

//     // int a = 10;
//     // int b = 12;
//     // int sum = a+b;
//     // int mul = a*b;
//     // System.out.println(mul);
//     // System.out.println(a+b);
//     // System.out.println(sum);
//     }
// }

// public class tute {
// public static void main(String[] args){
//     int a = 10;
//     int b = 10;
//     int sum = a+b;
//     System.out.println(sum);
//     }
// }


import java.util.*;

// public class tute {
// public static void main(String[] args){
//     Scanner sc = new Scanner (System.in);
//     String name = sc.nextLine();
//     System.out.println(name);
//     }
// }

//! print a+b

// public class tute {
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int i = sc.nextInt();
//     int b = sc.nextInt();
//     int sum = i+b;
//     System.out.println(sum);
//     }
// }

// public class tute {
// public static void main(String[] args){
//     int a = 10;
//     int b = 20;
//     int sum = a+b;
//     System.out.println(sum);
//     }
// }

// public class tute {
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sum = a+b;
//     System.out.println(sum);
//     }
// }

//! Conconditional 
// ! 01 if else:

// public class tute {
// public static void main(String[] args){
//     int a = 10;
//     if(a == 20){
//         System.out.println("YOu are eligible for vote");
//     }else{
//         System.out.println("you are not eligible for vote");
//     }
//     }
// }

// public class tute {
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt(); 
//     if(a >= 10){
//         System.out.println("you are eligible for vote");
//     }else{
//         System.out.println("you are not eligible for vote");
//     }
//     }
// }

// ! odd or even

// public class tute {
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();

//     if(a % 2 == 0){
//         System.out.println("Input is even");
//     }else{
//         System.out.println("Input is odd");
//     }
// }
// }

// public class tute {
// public static void main(String[] args){
    
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();

//     if(a % 2 == 0){
//         System.out.println("Input is even");
//     }else{
//         System.out.println("Input is odd");
//     }
// }
// }

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if( a == b){
        System.out.println("Input is Equal");
    }else if(a > b){
        System.out.println("A is greater than b");
    }else if(a < b){
        System.out.println("B is greater than a");
    }else{
        System.out.println("Input is invalid");
    }
    }
}