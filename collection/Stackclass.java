import java.util.Stack;
public class Stackclass {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push("sanjay");
        s.add("verma");
        s.push(100);
        s.push("good");
        s.push(70);

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.search(100));
    }
}
