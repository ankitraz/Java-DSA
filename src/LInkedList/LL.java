package LInkedList;
import java.util.LinkedList;

public class LL {
        private  Node head;
        private  Node tail;
        private  int size;
        LL(){
            this.size = 0;
        }

        public void insertfirst(int value){
            Node node = new Node(value);
            node.next = head;
            head = node;

            if (tail == null){
                tail = head;
            }
            size +=1;
        }


        public void insert(int val, int index){
            if (index== 0){
                insertfirst(val);
            }
            if (index == size){
                insertlast(val);
            }

            Node temp = head;
            for (int i = 1; i < index ; i++) {
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }

        public void displaylist(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
        }

        public void insertlast(int value){
            if (tail == null){
                insertfirst(value);
                return;
            }
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size ++;
        }

        public int deletefirst(){
            int val = head.value;
            head = head.next;

            if (head == null){
                tail = null;
            }
            size--;
            return val;
        }

        public Node get(int index){
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }
        public int deleteLast(){
            if (size <= 1){
                return deletefirst();
            }

            Node secondLast = get(size-2);
            int val = tail.value;
            tail = secondLast;
            tail.next = null;
            return val;

        }


    private static class  Node{
        private int value;
        private  Node next;
        // by default next node  will be set to null;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
