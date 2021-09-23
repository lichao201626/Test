public class QuickSort {
    public void quickSort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        if (low >= high) {
            return;
        }

        int temp = arr[low];
        while (i<j) {
            while (arr[j]<=temp && i<j) {
                j--;
            }
            while (arr[i]>=temp && i<j) {
                i++;
            }
            if (i<j) {
                int x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
        // print(arr);
    }

    public void print(int[] arr) {
        for (int o: arr) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{15, 3, 12, 6, 9, 4, 5, 5, 10};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length-1);
        quickSort.print(arr);
    }
}
