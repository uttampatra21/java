// public class two {
// public static void main(String[] args){
//     if(4>5){
//         System.out.println("true");
//     }else{
//         System.out.println("false");
//     }
//     }
// }

public class two {
public static void main(String[] args){
    int []Arr = {1,3,5};
    int []Arr2 = {1,33,35};
    int count =0;
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if(Arr[i]==Arr2[j]){
                count = Arr[i];
            }
        }
    }
    System.out.println(count);
    }
}