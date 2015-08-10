package search;

/**
 * Created by zmax.
 */
public class LinerSearch implements Search {

    /**
     * This method of searching for a value within an array is called linear search. This is a reasonable name, as this program has f( n ) = n
     * @param arr
     * @param req
     * @return
     */
    public boolean search(int[] arr, int req) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == req) {
                return true;
            }
        }
        return false;
    }


}
