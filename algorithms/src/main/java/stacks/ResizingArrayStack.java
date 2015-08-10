package stacks;

/**
 * Created by zmax.
 */
public class ResizingArrayStack {

    private String[] s;
    private int n = 0;

    public ResizingArrayStack(int capacity) {
        this.s = new String[capacity];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public String pop() {
        return s[--n];
    }

    public void push(String item) {
        if (n == s.length) {
            resize(2 * s.length);
        }
        s[n++] = item;
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }


}
