package org.offer.utils.print;

import org.offer.utils.node.DuplexNode;

/**
 * 双向链表的打印
 * Created by tanc on 17-5-4.
 */
public class PrintDuplexList {

    /**
     * 从头打印双向链表
     */
    public static <T> void inOrder(DuplexNode<T> head) {
        DuplexNode<T> temp = head;
        StringBuilder builder = new StringBuilder();
        builder.append("双向链表结果为：[");
        while (null != temp) {
            builder.append(temp.data).append(",");
            temp = temp.next;
        }
        if (builder.charAt(builder.length() - 1) == ',') {
            builder.deleteCharAt(builder.length() - 1);
        }
        builder.append("]");
        System.out.println(builder.toString());
    }
}
