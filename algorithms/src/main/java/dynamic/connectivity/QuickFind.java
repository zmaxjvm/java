package dynamic.connectivity;

/**
 * Created by zmax.
 * <p/>
 * Quick-Find is to slow for the huge problems, O(n^2)
 */
public class QuickFind {

    private int[] id;

    public QuickFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    /**
     * Check two vertexes
     *
     * @param p - vertex
     * @param q - vertex
     * @return
     */
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    /**
     * Union two vertexes
     *
     * @param firstN
     * @param secondN
     */
    public void union(int firstN, int secondN) {
        int pid = id[firstN];
        int piq = id[secondN];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = piq;
            }
        }
    }

    public void printConnections() {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
    }

}
