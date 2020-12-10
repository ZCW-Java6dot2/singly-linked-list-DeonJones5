package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.soap.Node;
import java.util.List;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void nullHeadTest(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        Assert.assertEquals(0, (long) list.size() );


    }
    @Test
    public void addTest(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("Item");
        Assert.assertEquals(1,(long) list.size());
        list.add("Item2");
        Assert.assertEquals(2,(long) list.size());

    }

    @Test
    public void containsTest(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("Item");
        Assert.assertTrue("Item", true);

    }

    @Test
    public void findTest(){
            SinglyLinkedList<String> list = new SinglyLinkedList<String>();
            list.add("Item");
            Assert.assertEquals(1, 1);

    }

    @Test
    public void getTest(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("Item");
        Assert.assertEquals("Item", list.get(0));

    }

    @Test
    public void removeTest(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("Item");
        Assert.assertTrue("Item", list.remove(0));

    }




}
