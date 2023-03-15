import java.util.Arrays;

// public class two {
// public static void main(String[] args){
//     if(4>5){
//         System.out.println("true");
//     }else{
//         System.out.println("false");
//     }
//     }
// }

// public class two {
// public static void main(String[] args){
//     int []Arr = {1,3,5};
//     int []Arr2 = {1,33,35};
//     int count =0;
//     for(int i=0; i<3; i++){
//         for(int j=0; j<3; j++){
//             if(Arr[i]==Arr2[j]){
//                 count = Arr[i];
//             }
//         }
//     }
//     System.out.println(count);
//     }
// }\

// public class two {
// public static void main(String[] args){
//     int [] A = {14, 7, 8, 2, 4};
//     int sum = 0;

//     for(int i =0; i<5; i++){
//         sum = sum + A[i];
//     }
    
//     for(int i =0; )

//     }
// } 

public class two {
public static void main(String[] args){
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] subArray = Arrays.copyOfRange(array, 0, 2);

        System.out.println("Array: ");

        for(int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
        }

        System.out.println("Sub array: ");

        for(int i = 0; i < subArray.length; i++) {
           System.out.print(subArray[i] + " ");
        }
     }
    }