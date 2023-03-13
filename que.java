import javax.xml.transform.Source;
import javax.xml.transform.Templates;

import org.xml.sax.SAXNotSupportedException;

// import java.util.Scanner;

// import javax.xml.transform.Source;

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

// public class que {
// public static void main(String[] args){
//     for(int i=5; i>=1; i--){
//         for(int j=1; j<=i; j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }
// }

// public class que {
// public static void main(String[] args){
//     for(int i=4; i>=1; i--){
//         for(int j=1; j<=4-i; j++){
//             System.out.print(' ');
//         }
//         for(int j=1; j<=i; j++){
//             System.out.print("*"+"  ");
//         }
//         System.out.println();
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     for(int i=1; i<=5; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     for(int i =1; i<=5; i++){
//         for(int j= 1; j<=5-i; j++){
//             System.out.print(" ");
//         }
//         for(int j= 1; j<=i; j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//     }
//     for(int i=4; i>=1; i--){
//         for(int j = 1; j<=4-i; j++){
//             System.out.print(" ");
//         }
//         for(int j = 1; j<=i; j++){
//             System.out.print(j+"");
//         }
//         System.out.println();
//     }
//     }
// }

// public class que  {  
// public static void main(String[] args)   {  

//     int ct=0,n=0,i=1,j=1;  
//     while(n<25){  
//         j=1;  
//         ct=0;  
//     while(j<=i){  
//     if(i%j==0)  
//         ct++;  
//         j++;   
//     }  
//     if(ct==2){  
//     System.out.printf("%d ",i);  
//     n++;  
//     }  
// i++;  
// }    
// }  
// }  

// public class que {
// public static void main(String[] args){
//         int isPrime;
//         for (int i = 2; i <= 10; i++) {
//             isPrime = 0;
//             for (int j = 2; j <= i / 2; j++) {
//                 // if (i % j == 0) {
//                 //     isPrime = 1;
//                 //     break;
//                 // }
//                 System.out.print(j);
//             }
//             System.out.println();
//             if (isPrime == 0){
//                 // System.out.print(i + " ");
//             }
//         }
//     }
// }

// public class que {
// public static void main(String[] args){
//     for(int i=1; i<=5; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//     }
//     for(int i=4; i>=1; i--){
//         for(int j=1; j<=i; j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     for(int i=1; i<=5; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print("*"+" ");
//         }
//         System.out.println();
//     }
//     for(int i=1; i<=5; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print(" ");
//         }
//         for(int j = 1; j<=i; j++){
//             System.out.print("*"+" ");
//         }
//         System.out.println();
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     int  count =0;
//     for(int i=1; i<=3; i++){
//         for(int j=1; j<=3; j++){
//             count++;
//             System.out.print(count);
//         }
//         System.out.println();
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     int count = 0;
//     for(int i = 1; i<=4; i++){
//         for(int j= 1; j<=4; j++){
//             count++;
//             System.out.print(count+" ");
//         }
//         System.out.println();
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     for(int i=1; i<=3; i++){
//         for(int j=1; j<=3; j++){
//             if(i==1|| j==1|| i==3){
//                 System.out.print("*"+ " ");
//             }
//         }
//         System.out.println();
//     }
//     }
// }


// public class que {
// public static void main(String[] args){
//     for(int i=1; i<=3; i++){
//         for(int j=1; j<=3; j++){
//             if(i==1||j==1||i==3){
//                 System.out.print("*"+" ");
//             }
//         }
//         System.out.println();
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     int number = 321;
//     int rev;
//     while(number>0){
//         rev = number%10;
//         number = number/10;
//         System.out.print(rev);
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     for(int i=0; i<=4; i++){
//         for(int j=0; j<=4; j++){
           
//         }
//     }
//     }
// }


// public class que {
//     public static void main(String[] args){
//         int count = 0;
//         for(int i=0; i<4; i++){
//             for(int j=1; j<=4; j++){
//                 count++;
//                 System.out.print(count+" ");
//             }
//             System.out.println();
//           }
//         }
//     }

// public class que {
// public static void main(String[] args){
//     int [] arr = new int[] {1,2,62,4,15,6,7,8};
//     int min = arr[0];
//     int count = 0;
//     for(int i=0; i<arr.length; i++){
//         if(arr[i]>min){
//             count = arr[i];
//         }
//     }
//     System.out.println(count);
//     }
// }

// public class que {
// public static void main(String[] args){
//     int [] arr = new int[] {10,20,30,40,50,60};
//     for(int i=0; i<arr.length; i++){
//         arr[2] = 60;
//         System.out.println(arr[i]);
//     }
// }
// }

// sum of all even number
// public class que {
// public static void main(String[] args){
//     int sum = 0;
//     for(int i =1; i<=4; i++){
//         for(int j=1; j<=i; j++){
//             if(j%2==0){
//                sum = sum +j;
//                 System.out.println(sum);
//             }
//         }
//     }
//     }
// }



// public class que {
// public static void main(String[] args){
//     int number = 321;
//     int rev;
//     for(int i =1; i<=number;){
//         rev = number%10;
//         number = number/10;
//         System.out.print(rev);
//     }
//     }
// }

//  n = 4 - 10 

// 4 8

// public class que {
// public static void main(String[] args){
//     int count = 0;
//     for(int i=4; i<=40; i++){
//         for(j=4; j<=i; j++){
//             if(i)
//         }
//     }
//     }
// }
// 1 23 4 

// i = 0  i%j==0  0%0 == 0   0
//  1 % 1 == 0 ? 

// j = 0

// 2 4 

// 0 
// 2
// 2
// 6


// public class que {
// public static void main(String[] args){
//     String name = "ankush";
//     for(int i=6-1; i>=0; i--){
//         System.out.println(name.charAt(i));
//     }
// }
// }

// public class que {
// public static void main(String[] args){
//     String sentence = "uttam patra and ankita";
//     String name = sentence.substring(6, sentence.length());
//     System.out.println(name);
//     }
// }

// public class que {
// public static void main(String[] args){
//     String name = "madam";
//     int i=0; 
//     int j= name.length()-1;
//     int flag = 0;
//     while(i<j && flag==0){
//         if(name.charAt(i) != name.charAt(j)){
//             flag = 1;
//             i= i+1;
//             j= j-1;
//         }
//     }
//     if(flag==0){
//         System.out.println("Palindrome");
//     }else{
//         System.out.println("Not Palindrome");
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     String name = "uttam";
//     int vol = 0;
//     int con = 0;
//     name = name.toUpperCase();

//     for(int i=0; i<name.length(); i++){
//         char chara = name.charAt(i);
//         if(chara != ' '){
//             if(chara=='A'||chara=='E'||chara=='I'||chara=='O'||chara=='U'){
//                 vol = vol+ 1;
//             }else{
//                 con = con+ 1;
//             }
//         }
//     }
//     System.out.println(vol +" "+ con);
//     }
//     }

    // https://replit.com/@Abhinandan-Kain/Masai-28-Feb#Main.java
    // https://replit.com/@Abhinandan-Kain/Masai-2-Mar#Main.java
    // https://replit.com/@Abhinandan-Kain/Masai-1-Mar#Main.java

    // class Main {
    //     public static void main(String[] args) {
    //       int n=4;
    //       int m=(n*2)+1;
    //       for (int i=1;i<=n;i++){
    //         for(int j=1;j<=n*2;j++){
    //           if(i==j  ){
    //             System.out.print("\\");
    //           }
    //             else if ( i==m-j){
    //             System.out.print("/");
    //             }
    //           else{
    //             System.out.print(" ");
    //           }
              
    //         }
    //         System.out.println();
    //       }
          
    //     }
    //   }

    // public class que {
    // public static void main(String[] args){
    //     int number = 126;
    //     int digit;
    //     digit = number%10;
    //     if( digit % 3 ==0){
    //         System.out.println("divisble");
    //     }else{
    //         System.out.println("not");
    //     }
    //     }
    // }

    // public class que {
    // public static void main(String[] args){
    //     String name = "uttam";
    //     int i = 0;
    //     int j = name.length()-1;
    //     int flag = 0;
    //     while(i<j && flag==0){
    //         if(name.charAt(i) != name.charAt(j)){
    //             flag = 1;
    //         }
    //         i = i+1;
    //             j = j-1;
    //     }
    //         if(flag==0){
    //             System.out.println("palindrome");
    //         }else{
    //             System.out.println("not palindrome");
    //         }
    //     }
    // }

    // public class que {
    // public static void main(String[] args){
    //     String name = "ankush";
    //     int vol = 0;
    //     int con = 0;
    //     for(int i=0; i<name.length(); i++){
    //         char c = name.charAt(i);
    //         if(c == 'a'||c == 'e'||c == 'o'||c == 'i'||c == 'u'){
    //             vol = vol +1;
    //         }else{
    //             con = con +1;
    //         }
    //     }
    //     System.out.println(vol +" "+ con);
    //     }
    // }

    // public class que {
    // public static void main(String[] args){
    // int a =6;
    //     int num1 = 0;
    //     int num2 = 0;
    //     for(int i=1; i<=a; i++){
    //         if(a%i==0){
    //             num1 = num1+1;
    //         }
    //     }
    //     if(num1==2){
    //         System.out.print("Prime");
    //     }else{
    //         System.out.print("Not");
    //     }
    //     }
    // }

//  public class que {
//  public static void main(String[] args){
//     int n=4;
//     int m=(n*2)+1;
//     for (int i=1;i<=n;i++){
//       for(int j=1;j<=n*2;j++){
//         if(i==j  ){
//           System.out.print("\\");
//         }
//           else if ( i==m-j){
//           System.out.print("/");
//           }
//         else{
//           System.out.print(" ");
//         }
        
//       }
//       System.out.println();
//     }
//      }
//  }

// public class que {
// public static void main(String[] args){
//     int n =4;
//     int m = (n*2)+1;
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=n*2; j++){
//             if(i==j){
//                 System.out.print("\\");
//             }else if(i==m-j){
//                 System.out.print("/");
//             }else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
//     }
// }

// import java.util.*;
// public class que {
// public static void main(String[] args){
//     StringBuilder sb = new StringBuilder ("");
    
//     sb.append("rohit");
//     sb.append("virat");
//     sb.append("rahul");
//     sb.append("raina");
//     }
// }

// import java.util.*;
// public class que {
// public static void main(String[] args){
//     Scanner in = new Scanner(System.in);
//     String s=in.nextLine();
//     System.out.println(s);
//     in.close();
//     }
// }

// public class que {
// public static void main(String[] args){
//     for (int i = 1; i <=5; i++) {
//         for(int j= 1; j<=5; j++) {
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
//     }
//     }

// public class que {
// public static void main(String[] args){
//     int num = 1398993489;
//     String name = Integer.toString(num);
//     if(name.contains("89934")){
//         System.out.println("Number is exist");
//     }else{
//         System.out.println("Number is not exist");
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     int arr[] = {1, 2, 3, 4, 2, 1, 6, 5};
//     int n = arr.length;
//     int count = 0;
//     if(arr[0]>arr[1]){
//         count ++;
//     }
//     if(arr[n-1]>arr[n-2]){
//         count ++;
//     }

//     for(int i=1;i<n-1; i++){
//         if(arr[i]>arr[i-1] && arr[i]> arr[i+1]){
//             count++;
//         }
//     }
//         System.out.println(count);
//     }
// }

// public class que {
// public static void main(String[] args){
//     String name  = "utam Patra";
//     name = name.toUpperCase();
//     int vol = 0;
//     int con = 0;
//     for(int i=0; i<name.length(); i++){
//         char c  = name.charAt(i);
//         if(c != ' '){
//             if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
//                 vol++;
//             }else{
//                 con++;
//             }
//         }
//     }
//     System.out.println(vol);
//     System.out.println(con);
//     }
// }

// public class que {
// public static void main(String[] args){
//     String s = "232";
//     int num = Integer.parseInt(s);

//     int n = num;
//     int rev = 0;
//     while(n<0){
//         rev = (rev*10) + n %10;
//         n = n/10;
//     }
//     System.out.println(n);
//     }
// }

// public class que {
// public static void main(String[] args){
//     String name  = "uttam kumar patra";
//     System.out.println(name);
//     String str[] = name.split(" ");

//     for(int i=str.length-1; i>=0; i--){
//         System.out.print(str[i]+" ");
//     }
// }
// }

// public class que {
// public static void main(String[] args){
//     String str = "aman is a good boy";
//     String []arr  = str.split(" ");
//     int [] num = Integer.toString(arr)
//     int count = 0;
//     for(int i=1; i<=arr.length; i++){
//         if(arr[i]%2==0){
//             count++;
//         }
//     }
//     }
// }\

// public class que {
// public static void main(String[] args){
//     String name = "abcd";
//     for(int i =0; i<name.length(); i++){
//         for(int j=i+1; j<=name.length(); j++){
//             System.out.println(name.substring(i, j));
//         }
//     }
//     }
// }   

// public class que {
// public static void main(String[] args){
//     int num = 34942069;
//     int flag =0;
//     while(num>0){
//         int num1 = num%1000;
//         if(num1==420){
//             flag =1;
//             break;
//         }
//        num = num/10;
//     }
//     if(flag==1){
//         System.out.println("yes");
//     }else{
//         System.out.println("No");
//     }
//     }
// }

// public class que {
// public static void main(String[] args){
//     String name = "abcdefghi";
//     for(int i=0; i<name.length(); i=i+3){
//         String rev = "";
//         for(int j=i+2; j>=i; j++){
//             rev += name.charAt(j);
//         }
//     }
//     System.out.println(rev);
//     }
// }

// public class que {
// public static void main(String[] args){
//     int count  =0;
//     int arr[] = {1,2,3};
//     int arr2[] = {2,5,6};

//     for(int i=0; i<arr.length; i++){
//         for(int j=0; j<arr2.length; j++){
//             if(arr[i]==arr2[j]){
//                 count  = arr2[j];;
//             }
//         }
//     }
//         System.out.println(count);
//     }
// }

public class que {
public static void main(String[] args){
    String name = "aman";
    int max = 0;
    String temp;
    for(int i=0; i<name.length(); i++){
        for(int j=i+1; j<=name.length(); j++){
            temp = name.substring(i, j);
        }
    }
    }
}
