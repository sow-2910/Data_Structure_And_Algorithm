public class linearsearchmain {
    public static void main(String[] args) {
        int[] array = { 9, 1, 8, 5, 6, 20, 11, 9 };

        int index = linearSeach(array, 1);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

    }

    private static int linearSeach(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
