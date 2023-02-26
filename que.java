import java.util.Scanner;

import javax.xml.transform.Source;

// public class que {
// public static void main(String[] args){
//     for(int i = 1; i <= 10; i++){
//         System.out.println(i);
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     int sum = 0;
//     for(int i = 1; i <= 4; i++){
//         sum =  sum +i;
//     }
//     System.out.println(sum);
//     }
// }

// public class que {
// public static void main(String[] args){
//     Scanner sc = new Scanner (System.in);
//     int input = sc.nextInt();
//     for(int i = 1; i <= 10; i++){
//         System.out.println(input + "X = " + i + "= " + (input*i));
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     int even = 0;
//     int odd = 0;

//     // even numbers
//     // for(int i = 1; i <= 10; i++){
//     //     if(i%2==0){
//     //         even = even+i;
//     //         // System.out.println(i);
//     //     }
//     // }
//     // System.out.println(even);

//     // odd number
//     for(int j = 1; j<= 10; j++){
//         if(j%2 != 0){
//             System.out.println(j);
//             odd = odd+j;
//         }
//     }
//     System.out.println(odd);

//     }
// }

// public class que {
// public static void main(String[] args){
//     int count = 0;
//     int num = 7;
//     for(int i = 1; i<= num; i++){
//         if(num%i==0){
//             count = count + 1;
//         }
//     }
//     if(count ==2){
//         System.out.println("prime");
//     }else{
//         System.out.println("not prime");
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     Scanner sc = new Scanner (System.in);
//     int count = 0;
//     int n = sc.nextInt();
//     for(int i = 1; i<=n; i++){
//         if(i%n==0){
//             count = count + 1;
//         }
//         if(count==2){
//             System.out.println(n + "is prime number");       
//         }else{
//             System.out.println(n + "is not prime number");
//         }
//     }
//     }
// }


// 1
// 2
// 3
// 4
// 5

// public class que {
// public static void main(String[] args){
// // arr =1,2,3,4,5
//     int [] arr = new int [] {1,2,3,4,5}; //1 2 3 4 5
//     for(int i = 0; i<=arr.length; i++){
//         System.out.println(arr[i]);
//     }

//     }
// }


// public class que {
// public static void main(String[] args){
//     int [] arr = new int [] {1,2,3,4,5};
//     for(int i = 5-1; i>= 0; i--){
//         System.out.println(arr[i]);
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     int max = arr[0];
//     for(int i = 1; i < arr.length; i++){
//         if(arr[i] > max){
//             max = arr[i];   
//         }
//     }
//     System.out.print(max);
//     }
// }

// public class que {
// public static void main(String[] args){
//     int palindrome = 524;
//     int rev = 0;
//     int compare = palindrome;

//     for(int i = palindrome; i>0; i++){
//         rev = (rev*10) + palindrome%10;

//         System.out.println(rev);
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     String name = "strra";
//     name = name.toUpperCase();
//     int vol = 0;
//     int con = 0;
//     for(int i = 0; i<name.length(); i++){
//         char c = name.charAt(i);
//         if(c != ' '){
//             if(c=='A' || c=='E' || c=='I' || c == 'O' || c == 'U'){
//                 vol ++;
//             }else{
//                 con++;
//             }
//         }
//     }
//     if(vol>0){
//         System.out.println(true);
//     }else{
//         System.out.println("false");
//     }
//     }   
// }


// public class que {
// public static void main(String[] args){
//     int count = 0;
//     for(int i=0; i<4; i++){
//         for(int j=1; j<=4; j++){
//             count++;
//             System.out.print(count+" ");
//         }
//         System.out.println();
//       }
//     }
// }

// public class que {
// public static void main(String[] args){
//     int count = 0;
//     for(int i= 1; i<=6; i++){
//         for(int j = 1; j<=i; j++){

//         }
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     for(int i = 1; i<=4; i++){
//         for(int j = 1; j<=5; j++){
//             if(i==1|| j==1|| j==5 || i==5){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     for(int i=1; i<=4; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//     }
//     }
// }

public class que {
public static void main(String[] args){
    for(int i=5; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    for(int i=1; i<=4; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
    }
}