import java.util.*;

public class HashtableMain {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10); // set capacity // the number beside ten is floating
                                                                // number, it means the hash can extends 50%
        table.put(100, "PhatTran");
        table.put(123, "PhatNguyen");
        table.put(133, "BaoLe");
        table.put(321, "HuyLuu");
        table.put(777, "LocNgo");
        // table.remove(777);
        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

    }

}
