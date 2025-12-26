//Reverse an array
// [2, 4, 6, 8, 10]

class Solution {
    public static void reverse(int num[]) {
        int first = 0;
        int last = num.length-1;

        while(first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
       
        reverse(num);
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}


/*
Output:
10 8 6 4 2

*/

/*
Time complexity: O(n) 
Space Complexity: O(1)

*/