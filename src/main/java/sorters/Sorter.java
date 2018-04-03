package sorters;


public abstract class Sorter {
    /**
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */

    @SorterMethod(str = 0)
    public abstract int[] sort(int arr[], int low, int high);

    protected final void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
