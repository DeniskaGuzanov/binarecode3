public class Kucha {

    public void sort (int [] array){
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);

        }
    }
    public void heapify(int [] array, int heapSize, int rootIndex){
        int larges = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[larges]) {
            larges = leftChild;



        }
        if (rightChild < heapSize && array[rightChild] > array[larges]){
            larges = rightChild;

        }
        if ( larges != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[larges];
            array[larges] = temp;
            heapify(array, heapSize, larges);

        }

    }


    public static void main (String[]args){
        int [] array = new int [] {
                2, 4, 6, 8, 1, 10, 5, 7, 4, 1, 3 ,2
        };
        int n = array.length;

        Kucha k = new Kucha();
        k.sort(array);
        for (int i = 0;i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
