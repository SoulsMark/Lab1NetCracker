package sorters;

@SorterClass
public class BubbleSortDown extends SorterBubble {

    @SorterMethod(str = 2)
    public int[] sort(int array[], int low, int high) {
        for(int i = low; i < high + 1; i++) {
            for(int j = high; j > i; j--) {
                if(array[j] < array[j-1]) {
                    swap(array, j, j - 1);
                }
            }
        }
        return array;
    }
}
