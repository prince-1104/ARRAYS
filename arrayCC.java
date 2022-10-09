import java.util.*;
public class arrayCC{
    public static void update(int marrks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String args[]){
        int marks[]={45, 56, 68};
        update(marks);
        //to print marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}