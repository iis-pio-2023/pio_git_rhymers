package edu.kis.vh.nursery.list;

import junit.framework.TestCase;

public class IntLinkedListTest extends TestCase {

    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        for (int i = 0; i < 10; i++) {
            list.push(i);
            assertEquals(i, list.top());
        }
    }

    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        assertTrue(list.isEmpty());
        list.push(10);
        assertFalse(list.isEmpty());
        list.pop();

        for (int i = 0; i < 10; i++) {
            list.push(i);
        }
        for (int i = 0; i < 10; i++) {
            list.pop();
        }
        assertTrue(list.isEmpty());
    }

    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        assertFalse(list.isFull());
        for (int i = 0; i < 12; i++) {
            list.push(i);
            assertFalse(list.isFull());
        }
        assertFalse(list.isFull());
    }

    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        assertEquals(-1, list.top());

        for (int i = 0; i < 5; i++) {
            list.push(i);
            assertEquals(i, list.top());
        }

        for (int i = 4; i >= 0; i--) {
            assertEquals(i, list.top());
            list.pop();
        }
        assertEquals(-1, list.top());
    }

    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        assertEquals(-1, list.pop());

        for (int i = 0; i < 10; i++) {
            list.push(i);
            assertEquals(i, list.pop());
        }
        assertEquals(-1, list.pop());
    }
}
