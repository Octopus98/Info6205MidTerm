import java.util.LinkedList;
import java.util.Queue;

public class BinTree<T>{
    public Node<T> root;

    public BinTree() {

    }

    public void populateNextRight(){
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                Node node = queue.poll();
                if (i < size-1){
                    node.nextLeft = queue.peek();
                }
                if (node.right != null){
                    queue.add(node.right);
                }
                if (node.left != null){
                    queue.add(node.left);
                }
            }
        }
    }
}
