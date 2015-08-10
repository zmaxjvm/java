package sort;

/**
 * Created by zmax.
 *
 * @see InsertionSort
 * Shellsort is a generalization of insertion sort that allows the exchange of items that are far apart.
 * The idea is to arrange the list of elements so that, starting anywhere, considering every hth element gives a sorted list.
 */
public class QuickSort implements Sort {

    private int[] arr;

    @Override
    public int[] sort(int... a) {
        arr = a;
        qSort(0, a.length - 1);
        return arr;
    }

    private void qSort(int l, int r) {
        int pivot = arr[(l + r) / 2];
        int i = l, j = r;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        if (j < r) qSort(i, r);
        if (l < j) qSort(l, j);

    }

    int c = 0;

    private void swap(int[] a, int x1, int x2) {
        int buf = a[x1];
        a[x1] = a[x2];
        a[x2] = buf;
        c++;
    }

}
