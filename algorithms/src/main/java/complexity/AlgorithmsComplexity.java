package complexity;

/**
 * Created by zmax.
 */
public class AlgorithmsComplexity {

    /**
     * # Counting instructions
     * So, if we ignore the loop body, the number of instructions this algorithm needs is 2+n. We can now define a mathematical function f( n ) = n
     * <p/>
     * # Worst-case analysis
     * Now, looking at the for body, we have an array lookup operation and a comparison that happen always: 'if (z[i] > i)'
     * But the if body may run or may not run, depending on what the array values actually are if it happens we'll run one additional instruction.
     * Now we can't define an f( n ) as easily, because our number of instructions doesn't depend solely on n but also on our input.
     * Besides, the number of actual CPU instructions needed for each programming language statement depends on the compiler of our programming language
     * and on the available CPU instruction set (i.e. whether it's an AMD or an Intel Pentium on your PC, or a MIPS processor on your Playstation 2) and we said we'd be ignoring that
     * calculate only -> f(n) and ignoring additional instructions.
     * For example, Java needs some time to initialize its virtual machine. Since we're ignoring programming language differences, it only makes sense to ignore this value.
     * <p/>
     * <p/>
     * #Complexity examples:
     * 1. As here we have two nested loops within each other, we'll have an asymptotic behavior described by f( n ) = n2.
     * 2. A loop within a loop within a loop yields f( n ) = n3.
     */
    public void countingInstruction(int n, int... z) {
        for (int i = 0; i < n; ++i) {
            if (z[i] > i) {
                //"gotcha!"
            }
        }
    }

    /**
     * It's sometimes true that it will be hard to figure out exactly the behavior of an algorithm
     * However, we will be able to say that the behavior of our algorithm will never exceed a certain bound
     * All we'll have to do is find a certain bound
     *
     */


    /**
     * Asymptotic comparison operator	Numeric comparison operator
     * Our algorithm is -> 'small' o( something ) A number is < something
     * Our algorithm is -> 'big' O( something )	  A number is ≤ something
     * Our algorithm is -> 'teta' Θ( something )  A number is == something
     * Our algorithm is -> 'big omega' Ω( something )	A number is ≥ something
     * Our algorithm is -> 'small omega' ω( something )	A number is > something
     *
     * Example
     * Any program that is Θ( a ) is O( b ) when b is worse than a
     */

    /**
     * Asymptotic analysis of algorithms
     *
     * f(n) = O(1) - constant
     * f(n) = O(log(n)) - logarithm
     * f(n) = O(n) - linear
     * f(n) = O(n*log(n)) - quasi-linear growth
     * f(n) = O(n^m) - polynomial
     * f(n) = O(2^n) - exponential growth
     *
     * N(2^n)    T(Θ(1)) T(O(n)) T(O(n^2))
     *  10          1       1       1
     *  20          1       2       4
     *  40          1       4       16
     *
     * Algorithms complexity examples:
     */

    /**
     * O(N)
     * The i, j, and k loops each iterate ~ N^(1/3) times.
     *
     * @param N
     * @return
     */
    private int summ1(int N) {
        int sum = 0;
        for (int i = 0; i * i * i < N; i++)
            for (int j = 0; j * j * j < N; j++)
                for (int k = 0; k * k * k < N; k++)
                    sum++;
        return sum;
    }


    /**
     * O(N^5)
     * For a given value of i, the body of the innermost loop is executed 1 + 2 + 3 + ... + i^2  ~ 1/2 i^4 times. Summing this for each i yields 1/10 N^5.
     *
     * @param N
     * @return
     */
    private int summ2(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++)
            for (int j = 1; j <= i * i; j++)
                for (int k = 1; k <= j; k++)
                    sum++;
        return sum;
    }


    /**
     * Recursive complexity
     * A recursive function is a function that calls itself.
     * This function doesn't have any loops in it, but its complexity isn't constant either
     * Clearly, if we pass some n to this function, it will execute itself n times
     * Linear - (recall that linear means Θ( n )).
     */
    public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    /**
     * Logarithms
     * Base 2 logarithms are much more common than any other types of logarithms
     * 2x = 1024 - 10 is the logarithm of 1024 and we write this as log( 1024 )
     * <p/>
     * 2x = 64 -> x = 6, log( 64 ) = 6
     * 2x = 1 -> log( 1 ) = 0
     * <p/>
     * For example, take n = 32, an array of 32 elements. How many times do we have to cut this in half to get only 1 element? We get: 32 → 16 → 8 → 4 → 2 → 1. We did this 5 times, which is the logarithm of 32.
     */
    public int binarySearch(int a[], int num) {
        if (num > a[a.length - 1] || num < a[0]) return -1;
        int start = 0;
        int end = a.length - 1;
        int mid = (start + end) / 2;
        while (a[mid] != num) {
            if (num < mid) {
                end = mid;
            } else {
                start = mid;
            }
            mid = (start + end) / 2;
        }
        return mid;
    }

}
