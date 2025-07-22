//
import java.util.Scanner;

public class ArrayOperations {
    
    public static int[] createArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Array after Bubble Sort: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create Array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = createArray(n);
        
        // Sort Array
        bubbleSort(arr);
        
        // Linear Search
        System.out.print("Enter the element to search (Linear Search): ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        if(index != -1) {
            System.out.println("Element " + key + " found at index " + index + " (Linear Search)");
        } else {
            System.out.println("Element " + key + " not found (Linear Search)");
        }
        
        // Binary Search
        System.out.print("Enter the element to search (Binary Search): ");
        key = sc.nextInt();
        index = binarySearch(arr, key);
        if(index != -1) {
            System.out.println("Element " + key + " found at index " + index + " (Binary Search)");
        } else {
            System.out.println("Element " + key + " not found (Binary Search)");
        }
        
        sc.close();
    }
}

