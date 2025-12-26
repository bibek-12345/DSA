//Find the index of element from an given array
// ["Apple", "Banana", "Mango", "Orange", "Grapes"]

class Solution {
    public static int linearSearchString(String fruits[], String key){
        for(int i=0; i<fruits.length; i++) {
            if(fruits[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

     public static void main(String[] args) {
        String fruits[] = {"Apple", "Banana", "Mango", "Orange", "Grapes"};

        String key = "Mango";
        // String key = "coconut";

        int index = linearSearchString(fruits, key);
        
        if(index == -1) {
             System.out.println("Key not found");
        } else {
            System.out.println("Key is at index : " + index);
        }
    }
}

/*
Input: Key = "Mango"

Output:
Key is at index : 2

Input: Key = "coconut";
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