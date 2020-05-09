package basics;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 简单实现二分查找
 *
 * @author Youdmeng
 * @date 2018-11-01
 */
public class BinarySearch05 {

    public static void main(String[] args) {

        int[] whiteList = { 1, 6, 9, 16, 19, 329, 23, 1234, 1232, 12345, 33, 2, 565, 34, 46, 2345, 345, 544, 34, 3495, 4564, 64, 564, 53, 345, 345, 4,
                645,
                645, 645 };

        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()) {
            StdOut.print("请输入数字: ");
            int key = StdIn.readInt();
            if (rank(key, whiteList) < 0) {
                StdOut.println(key);
            }
        }

    }

    private static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

class BinarySearch {

    public static void main(String[] args) {
        System.out.println(2.0e-6 * 100000000.1);
    }
}
