package com.SinglyLinkedList;

class NodeCircular{
    NodeCircular prev;
    int data;
    NodeCircular next;
}
class Oper_circ{
    NodeCircular head=null;
    void doubly_insert(int value){
        NodeCircular nodeCircular=new NodeCircular();
        nodeCircular.data=value;
        if(head==null){
            head=nodeCircular;
            head.next=head;
            head.prev=head;
        }
        else {
            NodeCircular temp = head;
            while (temp.next!=head) {
                temp=temp.next;
            }
            nodeCircular.prev=temp;
            temp.next=nodeCircular;
            nodeCircular.next=head;
            head.prev=nodeCircular;

        }
    }
    void singleNode(int value){
        NodeCircular nodeCircular1=new NodeCircular();
        nodeCircular1.data=value;
        //nodeCircular1.next=null;
        if(head==null){
            head=nodeCircular1;
            head.next=head;
        }
        else{
            NodeCircular temp=head;
            while (temp.next!=head){
                temp=temp.next;
            }
            temp.next=nodeCircular1;
            nodeCircular1.next=head;
        }
    }
    void insert_beg(int value){
        NodeCircular nodeCircular=new NodeCircular();
        nodeCircular.data=value;
        NodeCircular temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        nodeCircular.next=head;
        head=nodeCircular;
        head.next=temp;
        temp.next=head;
        head.prev=temp;

    }
    void del_beging(){
        NodeCircular temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
          head=head.next;
          head.prev=temp.next;
         temp=head.prev;
    }
    void delete_last(){
        NodeCircular tem=head;
        NodeCircular prev=null;
        while (tem.next!=head){
            prev=tem;
            tem=tem.next;
        }
        prev.next=head;
        tem=null;
    }
    void delete_AnyWhere(int position){
        NodeCircular temp=head;
        NodeCircular previous=null;
        if(position==0){
            del_beging();
            return;
        }
        for(int i=0;i<position;i++){
            previous=temp;
            temp=temp.next;
        }
        previous.next=null;
        temp=temp.next;
        temp.prev=null;
        temp.prev=previous;
        previous.next=temp;
    }
    void display(){
        NodeCircular temp=head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while (temp!=head);
    }
}
public class CircularLinkedList {
    public static void main(String[] args) {
        Oper_circ cl=new Oper_circ();
        cl.singleNode(100);
        cl.singleNode(200);
        cl.singleNode(300);
        cl.singleNode(400);
        cl.singleNode(500);
        cl.doubly_insert(100);
        cl.doubly_insert(200);
        cl.doubly_insert(300);
       // cl.del_beging();
       // cl.delete_AnyWhere(2);
        cl.insert_beg(1);
        cl.display();
    }
}
