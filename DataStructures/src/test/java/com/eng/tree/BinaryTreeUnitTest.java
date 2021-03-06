package com.eng.tree;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeUnitTest {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeNotEmpty() {

        BinaryTree bt = createBinaryTree();

        Assert.assertTrue(!bt.isEmpty());
    }

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {

        BinaryTree bt = createBinaryTree();

        Assert.assertTrue(bt.containsNode(6));
        Assert.assertTrue(bt.containsNode(4));

        Assert.assertFalse(bt.containsNode(1));
    }

    @Test
    public void givenABinaryTree_WhenAddingExistingElement_ThenElementIsNotAdded() {

        BinaryTree bt = createBinaryTree();

        int initialSize = bt.getSize();

        Assert.assertTrue(bt.containsNode(3));
        bt.add(3);
        assertEquals(initialSize, bt.getSize());
    }

    @Test
    public void givenABinaryTree_WhenLookingForNonExistingElement_ThenReturnsFalse() {

        BinaryTree bt = createBinaryTree();

        Assert.assertFalse(bt.containsNode(99));
    }

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {

        BinaryTree bt = createBinaryTree();

        Assert.assertTrue(bt.containsNode(9));
        bt.delete(9);
        Assert.assertFalse(bt.containsNode(9));
    }

    @Test
    public void givenABinaryTree_WhenDeletingNonExistingElement_ThenTreeDoesNotDelete() {

        BinaryTree bt = createBinaryTree();

        int initialSize = bt.getSize();

        Assert.assertFalse(bt.containsNode(99));
        bt.delete(99);
        Assert.assertFalse(bt.containsNode(99));
        assertEquals(initialSize, bt.getSize());
    }

    @Test
    public void it_deletes_the_root() {
        int value = 12;
        BinaryTree bt = new BinaryTree();
        bt.add(value);

        Assert.assertTrue(bt.containsNode(value));
        bt.delete(value);
        Assert.assertFalse(bt.containsNode(value));
    }

    @Test
    public void givenABinaryTree_WhenTraversingInOrder_ThenPrintValues() {

        BinaryTree bt = createBinaryTree();

        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traverseInOrderWithoutRecursion();
    }

    @Test
    public void givenABinaryTree_WhenTraversingPreOrder_ThenPrintValues() {

        BinaryTree bt = createBinaryTree();

        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traversePreOrderWithoutRecursion();
    }

    @Test
    public void givenABinaryTree_WhenTraversingPostOrder_ThenPrintValues() {

        BinaryTree bt = createBinaryTree();

        bt.traversePostOrder(bt.root);
        System.out.println();
        bt.traversePostOrderWithoutRecursion();
    }

    @Test
    public void givenABinaryTree_WhenTraversingLevelOrder_ThenPrintValues() {

        BinaryTree bt = createBinaryTree();

        bt.traverseLevelOrder();
    }

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

}
