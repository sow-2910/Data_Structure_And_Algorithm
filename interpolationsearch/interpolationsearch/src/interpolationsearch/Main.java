package interpolationsearch;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int index = interpolationSearch(array, 1);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Index not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        int steps = 0;
        while (value >= array[low] && value <= array[high] && low <= high) {
            steps++;
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("Probe:" + probe + ", Steps: " + steps);
            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;

            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
