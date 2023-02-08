package JavaAlgorithm._04_LinkedList;

public class SingleLinkedList<T> {

    public Node<T> head = null;

    public class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }

    }

    public void addNode(T data){
        if(head == null)
        {
            head = new Node<T>(data);
        }
        else{
            Node<T> node = this.head;   // 맨 처음의 노드부터 시작

            while(node.next != null)    // 맨 마지막의 노드를 찾아가는 과정
            {
                node = node.next;
            }

            node.next = new Node<T>(data); // 맨 마지막의 노드에 다음 데이터를 추가.
        }
    }

    public void printAll(){
        if(head != null){
            Node<T> node = this.head;
            System.out.println(node.data);

            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> MYSLL = new SingleLinkedList<Integer>();

        MYSLL.addNode(1);
        MYSLL.addNode(2);

        System.out.println(MYSLL.head.data);            // 1
        System.out.println(MYSLL.head.next.data);       // 2
        MYSLL.printAll();

    }
}
