package baitapmain.baitap04;

public class BST {
    Node root;
//   duyệt đệ quy
    public void pushNode(Node current){
//        duyệt khi node không phải null
        if (current!=null){
//        duyệt node khi node do là lá
            if (current.left == null && current.right == null){
//                 trả về giá trị node
                System.out.println(current.value);
            }
            if (current.left !=null || current.right != null){
//                đệ quy cây con trái
                pushNode(current.left);
//                đệ quy cây con phải
                pushNode(current.right);
//                trả về giá trị node
                System.out.println(current.value);
            }
        }
    }
}
