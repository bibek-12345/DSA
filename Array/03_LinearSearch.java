// Find the index of element from an given array
// [2,3,6,8,10,12,14,16]

class Solution {
     public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        
        int key = 10;
        // int key = 25;

        int index = linearSearch(numbers, key);
        
        if(index == -1) {
             System.out.println("Key not found");
        } else {
            System.out.println("Key is at index : " + index);
        }
    }
}


/*
Input Key=10;
Output:
Key is at index : 4

Input Key=25;
Output:
Key not found

*/

/* 
Time Complexity:
Worst Case: O(n) => Element at last index or not present
Best Case: O(1) => Element found at first index

Space Complexity:
O(1) => no extra space is used
*/