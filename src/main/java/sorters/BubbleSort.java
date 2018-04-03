package sorters;

@SorterClass
public class BubbleSort extends SorterBubble {

    @SorterMethod(str = 1)
    public int[] sort(int array[], int low, int high) {
        for(int i = low; i < high + 1; i++) {
            for(int j = low; j < high - i ; j++) {
                if(array[j] > array[j+1]) {
                    swap(array, j,j+1);
                }
            }
        }
        return array;
    }
}
