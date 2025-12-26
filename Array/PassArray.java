//call by reference
import java.util.*;

public class PassArray {
    public static void update(int marks[], int nonChangebale) {
        nonChangebale = 10;
        for(int i=0; i<marks.length; i++) {
            marks[i] =  marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        int nonChangeable = 5;
        update(marks, nonChangeable); //pass the reference, not the whole array.
        System.out.println(nonChangeable);

        for(int i=0; i<marks.length; i++) {
            System.out.println("print: " + marks[i]+" ");
        }
        System.out.println();

    }

}
/*
output:

5 => nonchangeable value
print: 98
print: 99
print: 100

*/

