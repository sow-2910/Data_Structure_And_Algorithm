public class selectionsortmain {
    public static void main(String[] args) {
        int arr[] = { 1, 798, 54, 58, 63, 41, 42, 2, 6, 8, 9, 7, 4, 9, 8, 1000, 999 };

        System.out.println("Array before sorting");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Array after sorting");

        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            System.out.print("Loop " + i + ": ");
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
