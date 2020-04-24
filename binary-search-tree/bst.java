import org.graalvm.compiler.lir.amd64.vector.AMD64VectorShuffle.Insert128Op;

class bst{

    class Node{
        int data;
        Node left;
        Node right;
        Node(int x){
            this.data = x;
            left = null;
            right = null;
        }
    }

    /*
    if the new node’s value is lower than the current node’s, go to the left child
    if the new node’s value is greater than the current node’s, go to the right child
    when the current node is null, we’ve reached a leaf node, we insert the new node in that position
    */
    public void addNode(Node node, int data){
        if(data < node.data){
            if(node.left != null){
                addNode(node.left, data);
            } else {
                System.out.println("Inserted " + data + " to the left of" + node.data);
                node.left = new Node(data);
            }  
        } else if(data > node.date){
            if(node.right != null){
                addNode(node.right, data);
            }else{
                System.out.println("Inserted " + data + " to the right of" + node.data);
                node.right = new Node(data);
            }
        }
    }
    public static void main(String[] args){

    }
}