// find the pairs in an array and also print totalpairs
// [2, 4, 6, 8, 10]

class Solution {
    public static void printPairs(int num[]) {
        int totalpairs = 0;
        for(int i=0; i<num.length; i++) {
            int curr = num[i];
            for(int j=i+1; j<num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + totalpairs);
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        System.out.println(num.length);
        System.out.println(num.length-1);
        printPairs(num);
    }
}

/*
Output:
(2,4)(2,6)(2,8)(2,10)
(4,6)(4,8)(4,10)
(6,8)(6,10)
(8,10)

Total pairs = 10

*/
/*
Time Complexity: O(n^2) => used nested loops
Space Complexity: O(1) => used only few varibales

*/