package sort;

/**
 * Created by zmax.
 *
 * @see sort.InsertionSort
 * Shellsort is a generalization of insertion sort that allows the exchange of items that are far apart.
 * The idea is to arrange the list of elements so that, starting anywhere, considering every hth element gives a sorted list.
 */
public class ShellSort implements Sort {

    @Override
    public int[] sort(int... a) {
        //should be improve
        int step = 4;


        while (step > 1) {
            for (int i = 0; i < (a.length - step); i++) {
                if (a[i] > a[step + i]) {
                    swap(a, i, step + i);
                }
            }
            //step = step/2;

        }

        return a;
    }

    int c = 1;

    private void swap(int[] a, int x1, int x2) {
        int buf = a[x1];
        a[x1] = a[x2];
        a[x2] = buf;
        c++;
    }

}
