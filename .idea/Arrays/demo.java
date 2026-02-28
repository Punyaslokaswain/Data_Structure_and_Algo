import java.util.Arrays;

public class demo {

    // Method 1: Reverse array using two-pointer approach
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Method 2: Reverse array using recursion
    public static void reverseArrayRecursive(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively reverse the rest
        reverseArrayRecursive(arr, start + 1, end - 1);
    }

    // Method 3: Reverse array using Collections approach
    public static Integer[] reverseArrayUsingCollections(Integer[] arr) {
        Integer[] result = new Integer[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[index++] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // Test Case 1: Using two-pointer approach
        System.out.println("=== Method 1: Two-Pointer Approach ===");
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr1));
        reverseArray(arr1);
        System.out.println("Reversed array: " + Arrays.toString(arr1));

        // Test Case 2: Using recursion
        System.out.println("\n=== Method 2: Recursive Approach ===");
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(arr2));
        reverseArrayRecursive(arr2, 0, arr2.length - 1);
        System.out.println("Reversed array: " + Arrays.toString(arr2));

        // Test Case 3: Using collections approach
        System.out.println("\n=== Method 3: Collections Approach ===");
        Integer[] arr3 = {100, 200, 300, 400, 500};
        System.out.println("Original array: " + Arrays.toString(arr3));
        Integer[] reversedArr3 = reverseArrayUsingCollections(arr3);
        System.out.println("Reversed array: " + Arrays.toString(reversedArr3));

        // Test Case 4: Single element
        System.out.println("\n=== Test Case 4: Single Element ===");
        int[] arr4 = {42};
        System.out.println("Original array: " + Arrays.toString(arr4));
        reverseArray(arr4);
        System.out.println("Reversed array: " + Arrays.toString(arr4));


    }
}

