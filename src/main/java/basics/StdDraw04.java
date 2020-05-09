package basics;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

/**
 * 标准绘图库
 *
 * @author Youdmeng
 * @date 2018-11-01
 */
public class StdDraw04 {
    public static void main(String[] args) {
        drawLine();
    }

    /**
     * 线性函数
     */
    private static void drawLine() {
        //函数
        int n = 1000;
        StdDraw.setXscale(0, n);

        StdDraw.setYscale(0, n * n);
        StdDraw.setPenRadius(0.01);
        for (int i = 1; i <= n; i ++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }

    /**
     * 随机数
     */
    private static void drawRandom() {
        int n = 50;
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.random();
        }
        for (int i = 0; i < n; i++) {
            double x = 1.0 * i / n;
            double y = a[i] / 2.0;
            double rw = 0.5 / n;
            double rh = a[i] /2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
