package basics;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import org.apache.commons.lang3.StringUtils;

/**
 * 定容栈
 *
 * @author Youdmeng
 * @date 2018-11-21
 */
public class FixefCapacityStack {

    public static void main(String[] args) {
        FixefCapacityStackOfStrings<String> s = new FixefCapacityStackOfStrings<String>(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!StringUtils.equals(item, "-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + ")" + "留在栈中");

    }


}

/**
 * 定容栈
 * @param <Item>
 */
class FixefCapacityStackOfStrings<Item> {
    private Item[] a;
    private int n;

    public FixefCapacityStackOfStrings(int cap) {
        a =(Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    //p102 1.3.7 peek
    public Item peek() {
        return a[n];
    }

    // p101 习题1.3.1
    public boolean idFull() {
        return a.length == n;
    }
    public void push(Item item) {
        a[n++] = item;
    }

    public int size() {
        return n;
    }
    public Item pop() {
        return a[--n];
    }

}