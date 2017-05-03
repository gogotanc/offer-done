package org.offer.case26;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 26： 复杂链表的复制
 * Created by tanc on 17-5-3.
 */
public class ComplexList {


    /**
     * 方法一：使用两次遍历实现
     */
    public static ComplexListNode cloneMethodOne(ComplexListNode head) {
        if (null == head) {
            return null;
        }
        ComplexListNode cloneHead = new ComplexListNode(head.data);
        ComplexListNode cloneTemp = cloneHead;
        ComplexListNode temp = head;

        // clone next node
        while (null != temp.next) {
            temp = temp.next;
            cloneTemp.next = new ComplexListNode(temp.data);
            cloneTemp = cloneTemp.next;
        }

        // clone sibling node
        cloneSibling(head, cloneHead);

        return cloneHead;
    }

    /**
     * 克隆 sibling 节点
     */
    private static void cloneSibling(ComplexListNode head, ComplexListNode cloneHead) {

        ComplexListNode temp = head;
        ComplexListNode cloneTemp = cloneHead;

        while (null != temp) {
            ComplexListNode sibling = temp.sibling;
            if (null != sibling) {
                int data = sibling.data;
                ComplexListNode t = cloneHead;
                while (null != t) {
                    if (t.data == data) {
                        cloneTemp.sibling = t;
                        break;
                    }
                    t = t.next;
                }
            } else {
                cloneTemp.sibling = null;
            }
            temp = temp.next;
            cloneTemp = cloneTemp.next;
        }
    }

    /**
     * 方法二：使用一个 hash 保存节点和 sibling 的关系
     */
    public static ComplexListNode cloneMethodTwo(ComplexListNode head) {
        if (null == head) {
            return null;
        }
        Map<ComplexListNode, ComplexListNode> map = new HashMap<>();
        ComplexListNode cloneHead = new ComplexListNode(head.data);
        map.put(head, cloneHead);
        ComplexListNode cloneTemp = cloneHead;
        ComplexListNode temp = head;

        while (null != temp.next) {
            temp = temp.next;
            cloneTemp.next = new ComplexListNode(temp.data);
            cloneTemp = cloneTemp.next;
            map.put(temp, cloneTemp);
        }

        temp = head;
        cloneTemp = cloneHead;

        while (null != temp) {
            cloneTemp.sibling = map.get(temp.sibling);
            temp = temp.next;
            cloneTemp = cloneTemp.next;
        }

        return cloneHead;
    }

    /**
     * 方法三：书中建议的方法
     */
    public static ComplexListNode cloneMethodThree(ComplexListNode head) {

        if (null == head) {
            return null;
        }

        ComplexListNode temp = head;
        ComplexListNode nextNode;

        while (null != temp) {
            nextNode = temp.next;
            ComplexListNode t = new ComplexListNode(temp.data);
            t.next = temp.next;
            temp.next = t;
            temp = nextNode;
        }

        temp = head;
        while (null != temp) {
            ComplexListNode ct = temp.next;
            if (null == temp.sibling) {
                ct.sibling = null;
            } else {
                ct.sibling = temp.sibling.next;
            }
            temp = temp.next.next;
        }

        ComplexListNode cloneHead = head.next;
        temp = cloneHead;
        while (null != temp) {
            if (null == temp.next) {
                break;
            }
            temp.next = temp.next.next;
            temp = temp.next;
        }

        return cloneHead;
    }

    // public static ComplexListNode cloneMethodFour(ComplexListNode head) throws CloneNotSupportedException {
    //     return (ComplexListNode) head.clone();
    // }
}
