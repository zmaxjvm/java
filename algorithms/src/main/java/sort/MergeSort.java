package sort;

/**
 * Created by zmax.
 *
 * Merge sort is a fast, stable sorting routine with guaranteed O(n*log(n)) efficiency
 * <p/>
 * 1. Divide the unsorted array into n partitions, each partition contains 1 element.
 * Here the one element is considered as sorted.
 * 2. Repeatedly merge partitioned units to produce new sublists until there is only 1 sublist remaining.
 * This will be the sorted list at the end.
 */
public class MergeSort implements Sort {

    private int c=0;

    private int arrSize;

    @Override
    public int[] sort(int... arr) {

        arrSize = arr.length;
        mergesort(arr, 0, arrSize);
        return arr;
    }

    private void mergesort(int[] arr, int first, int last) {
        if (last - first < 2)
            return;
//separate left part of array
        mergesort(arr, first, first + (last - first) / 2);
//separate right part of array
        mergesort(arr, first + (last - first) / 2, last);
        merge(arr, first, first + (last - first) / 2, last);
    }

    private void merge(int[] lst, int a, int m, int b) {
        int[] tmp = new int[arrSize];
        int ai = a, bi = m, ti = a;

        while (ai < m || bi < b) {
            if (ai == m) tmp[ti++] = lst[bi++];
            else if (bi == b) tmp[ti++] = lst[ai++];
            else if (lst[ai] < lst[bi]) tmp[ti++] = lst[ai++];
            else tmp[ti++] = lst[bi++];
        }

        for (ti = a; ti < b; ti++)
            lst[ti] = tmp[ti];

        c++;
    }

}


