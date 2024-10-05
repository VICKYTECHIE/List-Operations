package com.SinglyLinkedList;

class NodeDouble{
    NodeDouble pre_adders;
    int  data;
    NodeDouble next;
}
class Operations{
    NodeDouble head=null;
    void insert(int value){
        NodeDouble newNode=new NodeDouble();
        newNode.data=value;
        if(head==null){
            head=newNode;
        }
        else {
            NodeDouble temp=head;
            while (temp.next!=null){
                temp=temp.next;

            }
            temp.next=newNode;
            temp.pre_adders=newNode;
        }
    }
    void insertAtBegining(int value_beg){
        NodeDouble temp=head;
        NodeDouble Beging=new NodeDouble();
        Beging.data=value_beg;
        Beging.next=temp;
        head=Beging;
    }
    void insert_End(int value_End){
        NodeDouble temp=head;
        NodeDouble endNode=new NodeDouble();
        endNode.data=value_End;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp=endNode.next;
        endNode=temp;
    }
    void insert_Anywhere(int index,int value_AW){
        NodeDouble temp=head;
        NodeDouble in_bt_val=new NodeDouble();
        in_bt_val.data=value_AW;
        if(index==0){
            insertAtBegining(value_AW);
            return;
        }
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        in_bt_val.next=temp.next;
        temp.next=in_bt_val;
        in_bt_val.pre_adders=temp.pre_adders;
    }
    void delete_Begin(){
        NodeDouble temp=head;
        head=head.next;
        head.pre_adders=null;
        temp=null;
    }
    void delet_End(){
        NodeDouble temp=head;
        NodeDouble per_node=null;
        while (temp.next!=null){
            per_node=temp;
            temp=temp.next;
        }
        per_node.next=null;
        temp.pre_adders=null;
        temp=null;
    }
    void delete_Any_Where(int pos){
          NodeDouble temp=head;
          NodeDouble pre_node= null;
          if(pos==0){
              delete_Begin();
              return;
          }
          for(int i=0;i<pos;i++){
              pre_node=temp;
              temp=temp.next;
          }
          pre_node.next=temp.next;
          pre_node.pre_adders=temp.pre_adders;
          temp.next=null;
          temp.pre_adders=null;
          temp=null;
    }
    void display(){
        NodeDouble temp=head;
         while (temp!=null){
             System.out.println(temp.data);
             temp=temp.next;
         }
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Operations dl=new Operations();
        dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(40);
        dl.insertAtBegining(90);
        dl.insertAtBegining(100);
        dl.insert_End(23);
        dl.insert_Anywhere(4,24);
        dl.delete_Begin();
        dl.delet_End();
        dl.delete_Any_Where(1);
        dl.display();
    }
}
