 class Node{
    int value;
    Node next;

    Node(int value){
        this.value=value;
        this.next=null;
        }

    }

        class One{
            public static void main(String args[]){
                Node node1 = new Node(10);
                Node node2 = new Node(11);
                Node node3 = new Node(12);

                node1.next=node2;
                node2.next=node3;
            node3.next=null;

            Node temp;
            temp=node1; 

            while (temp!=null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }
 