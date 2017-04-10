package org.offer.case22;

import org.offer.utils.Stack;

import java.util.Objects;

/**
 * 面试题 22：栈的压入、弹出序列
 * Created by tanc on 2017/4/6.
 */
public class StackPushPopOrder {

    public static boolean isPopOrder(Integer[] push, Integer[] pop) {

        if (null == push || null == pop || push.length != pop.length) {
            return false;
        }

        int pushIndex = 0;
        int popIndex = 0;
        Stack<Integer> stack = new Stack<>();

        while (popIndex < pop.length) {
            while (pushIndex < push.length) {
                stack.push(push[pushIndex]);
                if (Objects.equals(push[pushIndex++], pop[popIndex])) {
                    break;
                }
            }
            Integer temp = stack.pop();
            if (!Objects.equals(temp, pop[popIndex])) {
                return false;
            }
            popIndex++;
        }

        return stack.isEmpty();
    }
}
