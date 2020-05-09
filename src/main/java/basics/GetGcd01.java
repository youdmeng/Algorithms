package basics;

/**
 * 欧几里得求最大公约数
 *
 * @author Youdmeng
 * @date 2018-10-29
 */
public class GetGcd01 {

    public static void main(String[] args) {
        System.out.println(gcd(36, 8));
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

}
