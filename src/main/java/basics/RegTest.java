package basics;

import java.util.regex.Pattern;

/**
 *
 * @author Youdmeng
 * @date 2018-11-14
 */
public class RegTest {

    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9\\_\\-\\.]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
        System.out.println("zhang.san@qq.com".matches(regex));
    }

}
