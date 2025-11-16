public class bubblesortmain {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 9, 74, 5, 1, 6, 1, 21, 64, 65 };

        System.out.println("Array before sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Acsending order if want to decsending change the sign to <
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
