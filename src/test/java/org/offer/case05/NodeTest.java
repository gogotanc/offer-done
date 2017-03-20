package org.offer.case05;

import org.junit.Test;

/**
 * 面试题 5
 * Created by tanc on 2017/3/19.
 */
public class NodeTest {

    @Test
    public void test() {
        Node<String> head = new Node<>();

        createList(head);

        System.out.println("正序打印：");
        PrintList.order(head);
        System.out.println();
        System.out.println("倒序打印（递归实现）：");
        PrintList.tailByRecursion(head);
        System.out.println();
        System.out.println("倒序打印（栈实现）：");
        PrintList.tailByStack(head);
    }

    private void createList(Node<String> head) {
        addNode(head, "tanc");
        addNode(head, "is");
        addNode(head, "name");
        addNode(head, "my");
        addNode(head, "hello");
        // head => hello my name is tanc
    }

    private void addNode(Node<String> head, String data) {
        head.next = new Node<>(data, head.next);
    }
}