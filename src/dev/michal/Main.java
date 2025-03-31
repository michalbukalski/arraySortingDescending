package dev.michal;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] firstRandomArrayGenerate = getRandomValues(10);
        System.out.println("This is my array generated. It's before sorting: ");
        System.out.println(Arrays.toString(firstRandomArrayGenerate));
        System.out.println("This is my array after sorting: ");
        Arrays.sort(firstRandomArrayGenerate);

        for (int i = 0; i < firstRandomArrayGenerate.length / 2; i++) {
            int temp = firstRandomArrayGenerate[i];
            firstRandomArrayGenerate[i] = firstRandomArrayGenerate[firstRandomArrayGenerate.length - 1 - i];
            firstRandomArrayGenerate[firstRandomArrayGenerate.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(firstRandomArrayGenerate));


    }

    private static int[] getRandomValues(int randomArrayNumber) {
        Random random = new Random();
        int[] newRandomValue = new int[randomArrayNumber];
        for (int i = 0; i < randomArrayNumber; i++) {
            newRandomValue[i] = random.nextInt(100);
        }
        return newRandomValue;
    }
}
