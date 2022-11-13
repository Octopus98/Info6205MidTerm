
public class LinkList {
    public Node head;

    public int length = 0;

    public LinkList() {
        head = null;
    }

    public void insert(Integer data){
        // Insert in sorted manner
        if (head == null) return;
        int index = 0;
        Node temp = head;
        if (data <= head.data) {
            head = new Node(data);
            head.next = temp;
            return;
        }
        while (temp != null && temp.next != null) {
            index++;
            if (data <= temp.next.data) {
                Node node = new Node(data);
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
        temp.next = new Node(data);
        index++;
    }
}
