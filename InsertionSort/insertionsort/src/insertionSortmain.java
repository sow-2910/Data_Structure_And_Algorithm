public class insertionSortmain {
    public static void main(String[] args) {
        int arr[] = { 1, 11, 12, 14, 15, 17, 10, 9, 8, 6, 5, 7, 4, 2, 1 };

        System.out.println("Array before sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Array after sorting");
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
