package sorters;

@SorterClass
public class QuickSort extends Sorter {

    @SorterMethod(str = 4)
    public int[] sort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
        return array;
    }

    public int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }
}
