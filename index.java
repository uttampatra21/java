import javax.xml.transform.Source;

// public class index {
// public static void main(String[] args){
//     int a = 5;
//     for(int i = 1; i <= a; i++){
//         for(int j = 1; j <= i; j++){        
//     int sum = i+j;
//         if(sum % 2 == 0){
//             System.out.print("1"+" ");
//         }else{
//             System.out.print("0"+" ");
//         }
//         }
//         System.out.println();
//     }
//     }
// }

//  public class index {
//  public static void main(String[] args){
//      int n = 4;
//      for(int i = 1; i <= n; i++){
//         for(int j = 1; j <= i; j++){
//             System.out.print("*");
//         }
//         int space = 2*(n-i);
//         for(int j = 1; j <= space; j++){
//             System.out.print(" ");
//         }
//         for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
        
//      }
//      }
//  }

// public class index {
// public static void main(String[] args){
//     int n = 5;
//     for(int i = 1; i <= n; i++){
//         for(int j = 1; j <= i; j++){
//             System.out.print("*");
//         }
//         int space = 2 * (n-i);
//         for(int j = 1; j <= space; j++){
//             System.out.print(" ");
//         }
//         for(int j = 1; j <= i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//         // LOWER HALF
//         for(int b = n; b >= 1; b--){
//             for(int j = 1; j <= ; j++){
//                 System.out.print("*");
//             }
//             // int space = 2*(n-i);

//             for(int j = 1; j <= space; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     }
// }

public class index {
public static void main(String[] args){
    int n = 5;
    // outer loop
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        int space = 2 *(n-i);
        for(int j = 1; j <= space; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    // outer loop
    for(int i = n; i >= 1; i--){
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        int space = 2 *(n-i);
        for(int j = 1; j <= space; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
}