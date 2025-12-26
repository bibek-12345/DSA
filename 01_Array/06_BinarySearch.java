// Binary Search
// key = 10
// [2, 4, 6, 8, 10, 12]

class Solution {
    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length-1;

        while(start <= end) {
                int mid = (start + end)/2;

                if(num[mid] == key) { 
                    return mid;
                } else if(num[mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12};
        int key = 10;
        
        int index = binarySearch(num, key);
        
        if(index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index : " + index);
        }

    }
}

/*
output:
Key found at index : 4
 */

/*
Time Complexity: 
W.C: O(logn) => divide array in 2 half
B.C: O(1) =>  key found at middle

Space Complexity:
O(1) => no extra space is used.
*/
