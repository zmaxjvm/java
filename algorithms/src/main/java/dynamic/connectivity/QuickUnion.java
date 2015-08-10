package dynamic.connectivity;

/**
 * Created by zmax.
 */
public class QuickUnion {
    int arr[];

    public QuickUnion(int n) {
        arr = new int[n];
        for (int x = 0; x < n; x++) {
            arr[x] = x;
        }
    }

    private int root(int p) {
//This function is used to return the root of the element in a tree
        while (arr[p] != p) {
            p = arr[p];
        }
        return p;
    }

    public boolean connected(int x, int y) {
        return (root(x) == root(y));
    }

    public void union(int x, int y) {
//Unlike in the QuickFind here we just assign the root of the element to a different root to connect
        if (root(x) == root(y))
            return;
        int rootx = root(x);
        arr[rootx] = root(y);
    }

    public void status() {
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x]);
        }
    }
}
