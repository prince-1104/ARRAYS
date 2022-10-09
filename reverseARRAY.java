// import java.util.*;
// public class reverseARRAY{
//     public static void reverse(int numbers[]){
//         int first=0, last=numbers.length-1;
//         while(first<last){
//             //swap
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;
//             first++;
//             last--;
//         }}
//         //call
//         public static void main(String args[]){
//             int numbers[] = {2, 4, 6, 8, 10};
//             reverse(numbers);
//             //print
//             for(int i=0; i<numbers.length; i++){
//                 System.out.print(numbers[i]+ " ");

//             }
//             System.out.println();
//         }

//         }
        



public class reverseARRAY{
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        int first=0;
        int last=numbers.length-1;
        for(int i=0; i<numbers.length; i++){
            //swap
            while(first<last){
                int temp = numbers[last];
                numbers[last] = numbers[first];
                numbers[first] = temp;
                first++;
                last--;
            }
            System.out.print(numbers[i] +" ");

        }
        // System.out.println();
    }
}






