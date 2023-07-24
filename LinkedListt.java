package Oops;

public class LinkedListt {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
    public static LinkedListt insert(LinkedListt list, int data){
        Node new_node=new Node(data);
        new_node.next=null;
        if(list.head==null){
            list.head=new_node;
        }else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
                last.next=new_node;
            }
            return list;
        }
        public static void printList(LinkedListt list){
            Node currNode=list.head;
            System.out.print("LinkedList: ");
            while(currNode!=null){
                System.out.println(currNode.data+" ");
                currNode=currNode.next;
            }
            System.out.println();
        }
        public static LinkedListt detleteAtPosition(LinkedListt list, int index){
            Node currNode=list.head, prev=null;
            if(index==0 && currNode!=null){
                list.head=currNode.next;
                System.out.println(index+"position element deleted");
                return list;
            }
            int counter=0;
            while(currNode!=null){
                if(counter==index){
                    prev.next=currNode.next;
                    System.out.println(index+"position element deleted");
                    break;
                }else{
                    prev=currNode;
                    currNode=currNode.next;
                    counter++;
                }
            }
            if(currNode==null){
                System.out.println(index+"position element not found");
            }
            return list;
        }
        public static void main(String[] args){
            LinkedListt list=new LinkedListt();
            list = insert(list, 9);
            list = insert(list, 8);
            list = insert(list, 1);
            list = insert(list, 7);
            list = insert(list, 6);
            list = insert(list, 9);
            list = insert(list, 6);
            list = insert(list, 7);
            list = insert(list, 9);
            list = insert(list, 4);

            printList(list);

            detleteAtPosition(list, 4);
            printList(list);
            detleteAtPosition(list, 1);
            printList(list);
        }
    }

