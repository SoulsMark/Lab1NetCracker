package sorters;

/**
 * @see BubbleSort
 * @see BubbleSortDown
 */
@SorterClass
public class MergeSort extends Sorter {

    @SorterMethod(str = 3)
    public int[] sort(int[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            sort(array, low, middle);
            sort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
        return array;
    }

    private void merge(int[] array, int low, int middle, int high) {
        int tempSize1 = middle - low + 1;
        int tempSize2 = high - middle;
        int[] tempArray1 = new int[tempSize1];
        int[] tempArray2 = new int[tempSize2];

        for (int i = 0; i < tempSize1; i++) {
            tempArray1[i] = array[low + i];
        }

        for (int j = 0; j < tempSize2; j++) {
            tempArray2[j] = array[middle + j + 1];
        }

        int i = 0, j = 0;
        int k = low;

        while (i < tempSize1 && j < tempSize2) {
            if (tempArray1[i] <= tempArray2[j]) {
                array[k] = tempArray1[i];
                i++;
            }
            else {
                array[k] = tempArray2[j];
                j++;
            }
            k++;
        }

        while (i < tempSize1) {
            array[k] = tempArray1[i];
            i++;
            k++;
        }

        while (j < tempSize2) {
            array[k] = tempArray2[j];
            j++;
            k++;
        }
    }
}
