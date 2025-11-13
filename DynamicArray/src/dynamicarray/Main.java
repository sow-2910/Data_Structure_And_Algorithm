package dynamicarray;

public class Main {
    public static void main(String[] args) {
        // ArrayList<String> arrayList = new ArrayList<>();

        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        // dynamicArray.insert(0, "X");
        // dynamicArray.delete("B");
        // System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray.toString()); // can remove toString()
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
    }
}
