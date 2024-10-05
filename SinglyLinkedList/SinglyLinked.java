package com.SinglyLinkedList;

class Node{
    int data;
    Node next;
}
class Operation {
    Node head=null;
    Node beg=null;
    void insert(int num){
        Node newNode = new Node();
        newNode.data=num;
        newNode.next=null;
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    void insertBegning(int fstval){
        Node temp1=head;
        Node newNode1 = new Node();
        newNode1.data=fstval;
       newNode1.next=temp1;
       head=newNode1;
    }
    void insertInBetween(int index,int midValue){
        Node newNode2=new Node();
        newNode2.data=midValue;
        if(index==0){
            insertBegning(midValue);
            return;
        }
        Node inBt=head;
        for(int i=1;i<index-1;i++){
            if(inBt.next==null){
                throw new NullPointerException("INVALID INDEX");
            }
            inBt=inBt.next;
        }
        newNode2.next=inBt.next;
        //System.out.println(newNode2.data);
        inBt.next=newNode2;
    }
    void deleteAtFirst(){
        //com.SinglyLinkedList.Node newNode=new com.SinglyLinkedList.Node();
        Node temp=head;
        //System.out.println(temp.data);
        head=head.next;
        temp=null;
    }
    void deleteAtEnd(){
        Node temp=head;
        Node Previous=null;
        while (temp.next!=null){
              Previous=temp;
              temp=temp.next;
        }
        Previous.next=null;
        temp=null;
    }
    void deleteAtAnywhere(int index){
        Node temp=head;
        Node Pre=null;
        if(index==0){
            head=head.next;
            return;
        }
        for(int i=0;i<index;i++){
            if(temp==null||temp.next==null){
                throw new NullPointerException("EMPTY TEMP");
            }
            Pre=temp;
            temp=temp.next;
        }
        Pre.next=temp.next;
        temp.next=null;
        temp=null;
    }
    void display(){
        Node tem=head;
        while (tem!=null){
         System.out.println(tem.data);
            tem=tem.next;
        }
    }
}
public class SinglyLinked {
    public static void main(String[] args) {
        Operation obj = new Operation();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(100);
        obj.insert(200);
        obj.insert(300);
        obj.insert(400);
        obj.insertBegning(50);
//        obj.insertBegning(06);
//        obj.insertInBetween(4,100);
//        obj.display();
//        obj.deleteAtFirst();
//        obj.display();
        obj.deleteAtEnd();
        //obj.deleteAtAnywhere(11);
        obj.insertBegning(1234);
        obj.insertInBetween(2,0);
        obj.display();

    }
}
