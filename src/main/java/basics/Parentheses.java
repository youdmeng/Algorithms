package basics;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;

/**
 * p102 1.3.4 使用栈判断括号是否完整配对
 *
 * @author Youdmeng
 * @date 2018-12-03
 */
public class Parentheses {

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        boolean result = true;
        while (!StdIn.isEmpty()) {
            String str = StdIn.readString();
            if (ArrayUtils.contains(new String[] { "[", "{", "(" }, str)) {
                stack.push(str);
            } else if (ArrayUtils.contains(new String[] { "}", "]", ")" }, str)) {
                String poper = "";
                poper = stack.pop();
                if (StringUtils.equals(str, "}")) {
                    if (!StringUtils.equals(poper, "{")) {
                        result = false;
                    }
                }
                if (StringUtils.equals(str, "]")) {
                    if (!StringUtils.equals(poper, "[")) {
                        result = false;
                    }
                }
                if (StringUtils.equals(str, ")")) {
                    if (!StringUtils.equals(poper, "(")) {
                        result = false;
                    }
                }

            }else {
                result = false;
            }
//            StdOut.println(stack.toString());
        }
        if (stack.size() != 0) {
            result = false;
        }
        StdOut.println("" + result);

    }

}

class Stack<Item> {
    private Item[] items;

    private Integer length;

    public Stack() {
        items = (Item[]) new Object[10];
        length = 0;
    }

    public void push(Item item) {
        if (length == items.length) {
            reSize(items.length * 2);
        }
        items[length++] = item;
    }

    public Item pop() {
        if (length < items.length / 4) {
            reSize(items.length / 2);
        }
        return items[--length];
    }

    private void reSize(Integer size) {
        Item[] temp = (Item[]) new Object[size];
        int i = 0;
        for (Item item : items) {
            temp[i] = items[i];
        }
        items = temp;
    }

    public Integer size() {
        return length;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "items=" + Arrays.toString(items) +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        int i = 0;
        Stack<String> stringStack = new Stack<>();
        do {
            stringStack.push(i + "");
            StdOut.println("size: "+stringStack.size());
            i++;
            if (i == 20) {
                break;
            }
        } while (true);
    }
}
