package sort;

/**
 * Created by zmax.
 *
 * <p/>
 * <p/>
 * Selection sort - In computer science, selection sort is a sorting algorithm, specifically an in-place comparison sort.
 * It has O(n2) time complexity
 * <p/>
 * 1. set 'i' to the index '0' into array
 * 2. find smoler element into right side array
 * 3. swap by indexes 'i' and smaller one element in the right side array
 * 4. increment 'i', repeat 1,2,3 steps
 */
public class SelectionSort implements Sort {

    public int[] sort(int[] a) {

        int n = a.length;
        int minIndx;

        for (int i = 0; i < n - 1; i++) {
            minIndx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndx]) {
                    minIndx = j;
                }
            }
            swap(a, minIndx, i);
        }
        return a;
    }

    private void swap(int[] a, int x1, int x2) {
        int buf = a[x1];
        a[x1] = a[x2];
        a[x2] = buf;
    }
}
