package ar.com.alehenestroza;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[1000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        System.out.println("Before:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    public static void insertionSort(int[] array) {
        // Element 0 is already sorted with itself, so it makes sense to start at the second element of the array
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            // Start from the element to the left of the current element, backwards
            int j = i - 1;
            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentElement;
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
