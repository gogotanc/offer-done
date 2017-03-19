package org.offer.case5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 5
 * Created by tanc on 2017/3/19.
 */
public class NodeTest {

    @Test
    public void test() {
        Node<String> head = new Node<>();

        addNode(head, "hello");
        addNode(head, "world");
        addNode(head, "my");
        addNode(head, "name");
        addNode(head, "is");
        addNode(head, "tanc");

        Node<String> temp = head.next;
        while (temp != null) {
            System.out.println(temp.data);
        }
    }

    private void addNode(Node<String> node, String data) {
        Node<String> newNode = new Node<>(data);
        newNode.next = node.next;
        node.next = newNode;
    }
}