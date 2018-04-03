package fillers;

import sorters.*;
import java.util.Arrays;

public class FillArrays {

    @Filler
    public static int[] createArray(int max) {
        int[] array1 = new int[max];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 5 + (int) (Math.random()*30);
        }
        Arrays.sort(array1, 0, max);
        return array1;
    }

    @Filler
    public static int[] createArrayReverse(int max) {
        int[] array1 = new int[max];
        for (int i = 0; i < max; i++) {
            array1[i] = 5 + (int) (Math.random()*30);
        }
        Arrays.sort(array1, 0, max);
        int[] finalArray = new int[max];
        for (int i = 0, j = max - 1; i < max; i++, j--) {
            finalArray[j] = array1[i];
        }
        return finalArray;
    }

    @Filler
    public static int[] createArrayWithElem(int max) {
        int[] array1 = new int[max];
        for (int i = 0; i < max; i++) {
            array1[i] = 5 + (int) (Math.random()*30);
        }
        Arrays.sort(array1, 0, max);
        int[] finalArray = new int[max + 1];
        for (int i = 0; i < max; i++) {
            finalArray[i] = array1[i];
        }
        finalArray[max] = 5 + (int) (Math.random()*30);
        return finalArray;
    }

    @Filler
    public static int[] createArrayRandom(int max) {
        int[] array1 = new int[max];
        for (int i = 0; i < max; i++) {
            array1[i] = 5 + (int) (Math.random()*30);
        }
        return array1;
    }
}
