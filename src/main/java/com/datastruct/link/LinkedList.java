package com.datastruct.link;

/**
 * 链表
 * @author chenchao
 */
public class LinkedList {
    // 链表节点
    public class Link{
        public int iData;
        public double dData;
        public Link next;

        public Link(int i ,double d) {
            iData = i;
            dData = d;
        }

        public void displayLinked(){
            System.out.println("{" + iData + "," + dData + "}");
        }

    }

    private Link first; // ref of first link on list

    public LinkedList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int id,double dd){
        Link newLink = new Link(id,dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void display(){
        System.out.println("List (first -> last):");
        Link current = first;
        while (current != null){
            current.displayLinked();
            current = current.next;
        }
        System.out.println("");
    }

    public Link find(int key){
        Link current = first;
        while (current.iData != key){
            if (current.next == null){
                return null;
            }else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key){
        Link current = first;
        Link previous = first;
        while (current.iData == key){
            if (current.next == null){
                return null;
            }else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first){
            first = first.next;
        }else {
            previous.next = current.next;
        }
        return current;
    }
}
