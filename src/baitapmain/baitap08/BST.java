package baitapmain.baitap08;

import baitapmain.baitap08.Node;

public class BST {
    Node root;
//    duyệt đệ quy
    public void addTree(Node current){
//    duyệt khi node ko phải null
        if (current!=null){
//            trả về giá trị của node hiện tại
            System.out.println(current.value);
            if (current.left!=null || current.right!=null){
//                đệ quy cây con trái
                addTree(current.left);
//                đệ quy cây con phải
                addTree(current.right);
            }
        }
    }

//    thêm mới đệ quy
    private Node addRecursive(Node current, int value){
        if (current == null){   // node gốc
            return new Node(value);   //trả về node vừa thêm mới
        }
        if(value < current.value ){
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right , value);
        }else {
            return current;
        }
        return current;
    }

    public void add(int value){
        this.root =addRecursive(root, value);
    }
}
