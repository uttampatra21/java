import javax.xml.transform.Source;

// import java.util.Scanner;

// import javax.xml.transform.Source;

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

public class tute {
public static void main(String[] args){
    int a = 10;
    int b = 10;
    int sum = a+b;
    System.out.println(sum);
    }
}


import java.util.*;

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String name = sc.nextLine();
    System.out.println(name);
    }
}

//! print a+b

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int b = sc.nextInt();
    int sum = i+b;
    System.out.println(sum);
    }
}

public class tute {
public static void main(String[] args){
    int a = 10;
    int b = 20;
    int sum = a+b;
    System.out.println(sum);
    }
}

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println(sum);
    }
}

//! Conconditional 
// ! 01 if else:

public class tute {
public static void main(String[] args){
    int a = 10;
    if(a == 20){
        System.out.println("YOu are eligible for vote");
    }else{
        System.out.println("you are not eligible for vote");
    }
    }
}

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); 
    if(a >= 10){
        System.out.println("you are eligible for vote");
    }else{
        System.out.println("you are not eligible for vote");
    }
    }
}

// ! odd or even

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if(a % 2 == 0){
        System.out.println("Input is even");
    }else{
        System.out.println("Input is odd");
    }
}
}

public class tute {
public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if(a % 2 == 0){
        System.out.println("Input is even");
    }else{
        System.out.println("Input is odd");
    }
}
}

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

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a >= b && a > b){
        System.out.println("Input is greater than and equal to B");
    }else{
        System.out.println("Input is smaller than");
    }
}
}

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a == 1){
        System.out.println("Hello");
    }else if(a == 2){
        System.out.println("Namaste");
    }else if(a == 3){
        System.out.println("Bonjour");
    }
    }
}

// ! switch case ::

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    switch(a){
        case 1: System.out.println("Hello"); break;
        case 2: System.out.println("Namaste"); break;
        case 3: System.out.println("Bonjour"); break;
        default: System.out.println("loda");
    }
    }
}

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    switch(a){
        case 1 : System.out.println("Hello");
        break;
        case 2 : System.out.println("Namaste");
        break;
        case 3 : System.out.println("Bonjour");;
        break;
        default : System.out.println("loda");
    }
    }
} 


// ! Loops
// ! for loop

public class tute {
public static void main(String[] args){
        for(int i = 0; i<=10; i++){
            System.out.println(i + "Hello world");
        }
    }
}

// ! While loop

// public class tute {
public static void main(String[] args){
    int i = 0;
    while(i<10){
        System.out.println("hello world");
        i++;
    }
    }
}


// ! do while loop

public class tute {
public static void main(String[] args){
    int i = 0;
    do{
        System.out.println("hello world");
        i++;
    }while(i<10);
    }

}

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    do {
        System.out.println("hello world");
        i++;
    }while(i<100);
    }
}

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int a = 1;
    do{
        System.out.println(i + "*" + a + "=" + (i*a));
        a++;
    }while(a<=10);
    }
}

// ! patterns :: Lecture 5:::

public class tute {
public static void main(String[] args){
    for (int i = 0; i < 4; i++){
        for(int j = 0; j < 10; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    for (int i = 0; i <= a; i++) {
        System.out.println(i);
    }
    }
}

// ! neted loops 

public class tute {
public static void main(String[] args){
    int a = 5;
    int c = 10;
    for(int i = 0; i<c; i++){
        for(int b = 0; b<a; b++){
            System.out.print("*****");
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int a = 4;
    int b = 5;
    for (int i = 1; i <= a; i++){
        for(int j =1; j <= b; j++){
            if (i == 1 || j == 1 || j == a || j == b){
                System.out.println("*");
            }else{
                System.out.println(" ");
            }
        }
    }
    }
}

public class tute {
public static void main(String[] args){
    int a = 4;
    int b = 5;
    for(int i = 1; i <= a; i++){
        for(int j = 1; j <= b; j++){
            if(i == 1 || j == 1 || i == a || j == a){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
    }
    }
}

// ! challenge 2

public class tute {
public static void main(String[] args){
    int n = 4;
    for(int i = 1; i <= n; i++){
        for (int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

// ! revert the pyramid

public class tute {
public static void main(String[] args){
    int n = 5;
    for(int i = n; i > 1; i--){
        for(int j = 1; j < i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int n = 5;
    for(int i = n; i >= 1; i--){
        for(int j = 0; j < i; j++) {
            System.out.print("X");
        }
        System.out.println();
    }
    }
}

// !challlenge 3

public class tute {
public static void main(String[] args){
    int n = 4;
    for(int i = 1; i <= n; i++){
        for(int j = i; j >= 1; j--) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int a = 10;
    for(int i = 0; i <5; i++){
        for(int j = 0; j <i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

public class loop {
public static void main(String[] args){
    int a = 5;
    for(int i = 0; i <= a; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("*" + " ");
        }
        System.out.println();
    }
    }
}

// ! PATTERN FOUR

public class tute {
public static void main(String[] args){
    int a = 4;
    for(int i = 0; i <= a; i++){
        for(int j = 0; j <= a-i; j++){
            System.out.print(" ");
        }
        for(int j = 0; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int n = 5;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int n = 4;
    for(int i = 0; i <= n; i++){
        for(int j = 0; j <= n-i; j++){
            System.out.print(" ");
        }
        for(int j = 0; j <=i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

// !problem 5

public class tute {
public static void main(String[] args){
    int a = 5;
    for (int i = 0; i <= a; i++){
        for(int j = 0; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int a = 5;
    for(int i = 1; i <=a; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for (int i = 1; i <= a; i++){
        for (int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}

// ! pattern threee

public class tute {
public static void main(String[] args){
    int n = 5;
    for (int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int a = 5;
    for (int i = 1; i <= a; i++){
        for(int j = 1; j <= a-i+1; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int a = 5;
    for(int i = 0; i <= a; i++){
        for(int j = 0; j <= a-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int a = 5;
    for(int i = 1; i <= a; i++){
        for(int j = 1; j < a-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int n = 5;
    int number = 1;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= i; j++){
            int sum = i+j;
            if(sum % 2 == 0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
    }
}

public class tute {
public static void main(String[] args){
    int a = 5;
    for(int i = 1; i <= a; i++){
        for(int j = 1; j <= i; j++){
            int sum = j+i;
            if (sum % 2 ==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
    }
}