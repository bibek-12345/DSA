// print the subarrays from an given array and also print total number of pairs
// [2, 4, 6, 8, 10]

class Solution {
    public static void subArrays(int num[]) {
        int totalpairs = 0;
        for(int i=0; i<num.length; i++) {
            int start = i;
            for(int j=i; j<num.length; j++) {
                int end = j;
                System.out.print("(");
                for(int k=start; k<=end; k++) {
                    System.out.print(num[k]);
                }
                System.out.print(")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + totalpairs);
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        subArrays(num);
    }
}

/*
output:
(2)(24)(246)(2468)(246810)
(4)(46)(468)(46810)
(6)(68)(6810)
(8)(810)
(10)
Total pairs = 15 = n(n+1)/2

*/

/*
Time complexity = O(n^3) => we have used 3 loop
Space complexity = O(1) => no extra space is used
*/