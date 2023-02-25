import java.util.Scanner;

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

public class que {
public static void main(String[] args){
    int even = 0;
    int odd = 0;

    // even numbers
    // for(int i = 1; i <= 10; i++){
    //     if(i%2==0){
    //         even = even+i;
    //         // System.out.println(i);
    //     }
    // }
    // System.out.println(even);

    // odd number
    for(int j = 1; j<= 10; j++){
        if(j%2 != 0){
            System.out.println(j);
            odd = odd+j;
        }
    }
    // System.out.println(odd);

    }
}