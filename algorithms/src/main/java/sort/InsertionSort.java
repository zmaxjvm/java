package sort;

/**
 * Created by zmax.
 *
 * <p/>
 * Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
 * More efficient in practice than most other simple quadratic (i.e., O(n2))
 * <p/>
 * 1. set 'i' to the index '1' into array
 * 2. if current element by index 'i' < previous element, swap elements
 * 3. decrease 'previous key' and repeat step 2
 * 4. i++ and repeat steps 1,2,3.
 */
public class InsertionSort implements Sort {

    @Override
    public int[] sort(int... a) {

        int counter = 1;
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int curEl = a[i];
            int prevKey = i - 1;

            while (prevKey >= 0 && a[prevKey] > curEl) {
                a[prevKey + 1] = a[prevKey];
                a[prevKey] = curEl;
                prevKey--;
                counter++;
            }
        }
        return a;
    }
}
