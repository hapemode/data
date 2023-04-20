import com.ppx.algorithm.BinarySearch;
import org.junit.Test;

import java.util.Arrays;

public class BinarySearchTest {

    private static int[] arr = {1, 3, 5, 7, 9};

    @Test
    public void t1() {
        int i = BinarySearch.bs1(arr, 6);
        System.out.println("i = " + i);
        int i1 = BinarySearch.bs1(arr, 7);
        System.out.println("i1 = " + i1);
    }

    @Test
    public void t2() {
        int i = BinarySearch.bs2(arr, 6);
        System.out.println("i = " + i);
        int i1 = BinarySearch.bs2(arr, 7);
        System.out.println("i1 = " + i1);
    }

    @Test
    public void t3() {
        int i = BinarySearch.bs3(arr, 6);
        System.out.println("i = " + i);
        int i1 = BinarySearch.bs3(arr, 7);
        System.out.println("i1 = " + i1);
    }

    @Test
    public void t4() {
        int i = Arrays.binarySearch(arr, 6);
        System.out.println("i = " + i);
        int i1 = Arrays.binarySearch(arr, 7);
        System.out.println("i1 = " + i1);
    }

    private static int[] arr2 = {1, 3, 3, 5, 5, 5, 5, 5, 5, 7, 9, 9};

    @Test
    public void t5() {
        System.out.println("BinarySearch.bsLeft(arr2, 5) = " + BinarySearch.bsLeft(arr2, 5));
    }

    @Test
    public void t6() {
        System.out.println("BinarySearch.bsLeft(arr2, 5) = " + BinarySearch.bsRight(arr2, 5));
    }
}
