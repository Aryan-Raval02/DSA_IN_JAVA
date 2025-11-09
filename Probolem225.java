import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Probolem225 {

    Deque<Integer> stack;

    public Probolem225() {
        stack = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.addFirst(x);
    }

    public int pop() {
        if(empty()) return -1;
        return stack.removeFirst();
    }

    public int top() {
        if(empty()) return -1;
        return stack.getFirst();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}
