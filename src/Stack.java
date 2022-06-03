import java.util.ArrayList;

public class Stack<Type> {
    private ArrayList<Type> curr;
    private int length;

    public Stack() {
        curr = new ArrayList<>();
        length = -1;
    }

    public Type pop() {
        if (length == -1) {
            return null;
        }
        return curr.remove(curr.size() - 1);
    }

    public void push(Type toAdd) {
        curr.add(toAdd);
        length++;
    }

    public Type peek() {
        if (length == -1) {
            return null;
        }
        return curr.get(length);
    }

    @Override
    public String toString() {
        int index = length;
        String res = "";
        while (index >= 0) {
            res += curr.get(index);
        }
        return res;
    }
}
