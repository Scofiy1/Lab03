public class Sorter {
    public static void main(String[] args) {}
       
public static void insertionSort(int n) {
    int[] array = new int[n];
    for (int i = 1; i < array.length; i++) {
        int key = array[i];
        int j = i - 1;
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = key;
    }
}

    public static void sort ( int array){
        insertionSort(array);
    }
    public static void selectionSort ( int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void sort ( int[] array){
        selectionSort(array);
    }

}