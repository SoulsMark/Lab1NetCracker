package sorters;

/**
 * {@link sorters.MergeSort }
 */

@SorterClass
public class SelectionSort extends Sorter {

    @SorterMethod(str = 5)
    public int[] sort(int[] array, int low, int high) {
        for (int i = low; i < high; i++) {
            int min_elem = i;
            for (int j = i + 1; j < high + 1; j++) {
                if (array[j] < array[min_elem]) {
                    min_elem = j;
                    swap(array, i, min_elem);
                }
            }
        }
        return array;
    }
}
