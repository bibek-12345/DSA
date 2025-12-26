import java.util.*;

class InOut {
    public static void main(String args[]) {
        int marks[] = new int[50];
        System.out.println("length of array : " + marks.length);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter physics marks: ");
        marks[0] = sc.nextInt();

        System.out.print("Enter chemistry marks: ");
        marks[1] = sc.nextInt();
        
        System.out.print("Enter math marks: ");
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        //updation of marks
        // marks[2] = 99;
        marks[2] = marks[2] + 1;
        System.out.println("Your updated marks of math is : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage : " + percentage + "%");

        sc.close();
    }
}

/*
Output:
length of array : 50
Enter physics marks: 55
Enter chemistry marks: 76
Enter math marks: 98
phy : 55
chem : 76
math : 98
Your updated marks of math is : 99
percentage : 76%

*/