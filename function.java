// import java.util.*;

// public class function{
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     String name = sc.next();

//     printMyName(name);
//     }
// }

// public class function{
//     public static int calculateMe(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sum  = calculateMe(a,b);
//     System.out.println("The sum of two number is " + sum);
//     }
// }

// public class function {
//     public static int calculateMe(int a, int b){
//         int mul = a * b;
//         return mul;
//     }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int mul = calculateMe(a,b);
//     System.out.println(mul);
//     }
// }

// public class function {
//     public static int calculateMe(int a, int b){
//         return a*b;
//     }
// public static void main(String[] args){
//     int a = 2;
//     int b = 2;
//     int mul = calculateMe(a, b);
//     System.out.println("Product ot two number is : " + mul );
//     // System.out.println(calculateMe(a, b));
// }
// }

// // Factorial Number

// public class function {
//     public static void factorialNumber(int n){
//         int factorialNumber = 1;
//         for(int i = n; i >= 1; i){
//             factorial = factorialNumber *i;
//             return ;
//         }
//         System.out.println(factorial);
//     }
//     public static void main(String[] args){
//         int n = 5;
//         factorialNumber(n);
//     }
// }


// public class function {
// public static void main(String[] args){
//     int a = 1;
//     int b = 2;
//     loda(a,b);
//     }
//     public static void loda(int a, int b){
//         return a+b;
//     }
// }

// public class function {
//     static String swap(String name){
//         String empty = "";
//         for(int i =0; i<name.length(); i++){
//             char v = name.charAt(i);
//             if(Character.isUpperCase(v)){
//                 empty += Character.toLowerCase(v);
//             }else{
//                 empty += Character.toUpperCase(v);
//             }
//         }
//         return empty;
//     }
// public static void main(String[] args){
//     String name = "uttAm";
//     System.out.println(swap(name));
//     }
// }

public class function {
public static void main(String[] args){
    String str="ABcd";
    String result="";
    for(int i=0; i<str.length();i++){
      char ch=str.charAt(i);
      if('A'<= ch && ch<='Z'){
        ch +=32;
      }
      else{
        ch -=32;
      }
      result += ch;
    }
    System.out.println(result);
}
}