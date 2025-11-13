
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        // System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("Standoff2");
        stack.push("Valorant");
        stack.push("Lol");
        stack.push("BlockBlast");

        // System.out.println(stack.empty());
        // Giá trị trả về là một chuỗi, có thể gán cho chuỗi
        // String myFavGame = stack.pop();
        // System.out.println(myFavGame);
        // System.out.println(stack);

        // Nếu muốn xem top của stack là giá trị gì thì dùng stack.peek()
        // System.out.println(stack.peek());

        // Method search
        // System.out.println(stack.search("Minecraft"));
        // System.out.println(stack.search("Valorant"));

    }
}
