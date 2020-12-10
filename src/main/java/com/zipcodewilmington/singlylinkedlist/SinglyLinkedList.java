package com.zipcodewilmington.singlylinkedlist;


import org.w3c.dom.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>> {
    private Node head = null;

    public Node getHead(){
        return this.head;

    }


    public void add(T data){
        if (head == null){
            this.head = new Node(data, null);
        } else{
            Node currentNode = this.head;
            while (currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(new Node(data, null));
        }
    }

    public Integer size(){
        Integer counter = 1;
        Node currentNode = this.head;
        if (this.head == null){
            return 0;
        }
        while (currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
            counter++;
        }
        return counter;
    }

    public Boolean contains(T data){
        Node currentNode = this.head;

        while (currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        if (currentNode.getNextNode().equals(currentNode.getData())){
            return true;
        } else {
            return false;
        }
    }

    public Integer find(T data){
        Node currentNode = this.head;

        while (currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        if (currentNode.getNextNode().equals(currentNode.getData())){
            return 1;
        } else{
            return -1;
        }
    }

   public T get(Integer index){
        Integer indexTemp = 0;
        Node currentNode = this.head;

        while(currentNode != null){
            if (index == indexTemp){
                return (T) currentNode.getData();
            }
            currentNode = currentNode.getNextNode();
            indexTemp++;
        }
        return null;
   }


    public Boolean remove(Integer index){
        Integer currentIndex = 0;
        Node prevNode = null;
        Node currentNode = this.head;

        while (currentNode != null){
            if (index == currentIndex){
                if (currentNode == this.head){
                    this.head = currentNode.getNextNode();
                } else {
                    prevNode.setNextNode(currentNode.getNextNode());
                }
                return true;
            }
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
            currentIndex++;

            }
        return false;

    }

    private class Node<T extends Comparable<T>> implements Comparable<Node> {
        private T data;
        private Node nextNode;


        public Node(T data, Node nextNode){
            this.data = data;
            this.nextNode = nextNode;

        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;

        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public int compareTo(Node o) {

            return this.data.compareTo((T) o.getData());
        }

    }

}
