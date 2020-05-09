package basics;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * p102 习题1.3.9 从标准输入 补全表达式
 *
 * @author Youdmeng
 * @date 2018-12-03
 */
public class FullTheMath {
    public static void main(String[] args) {
        StdOut.println("请输入表达式: ");
        List<String> strLst = new ArrayList<>();
        while (!StdIn.isEmpty()) {
            strLst.add(StdIn.readString());
        }
        // LinkedBlockingDeque 是无上限容量queue
        Queue<String> queue = new LinkedBlockingDeque<>();
        for (String s : strLst) {
            if (StringUtils.equals(")", s)) {
                Queue<String> temp =  new LinkedBlockingDeque<>();
                temp.offer("(");
                while (!queue.isEmpty()) {
                    temp.offer(queue.poll());
                }
                queue = temp;
                queue.offer(")");
            } else {
                queue.offer(s);
            }
        }

        for (Object str :  queue.toArray()) {
            StdOut.print(str + " ");

        }


    }


}
