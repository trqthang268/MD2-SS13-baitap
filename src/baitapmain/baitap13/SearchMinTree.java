package baitapmain.baitap13;

import java.util.TreeMap;

public class SearchMinTree {
    public static void main(String[] args) {
//        Khai báo và khởi tạo một đối tượng TreeMap.
        int[] arr = {7,4,9,12,43,56,76,76,76,34,99,1,2,5,6,4,4};
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
//        Đưa các phần tử vào TreeMap.
        for (int i = 0; i < arr.length; i++) {
            treeMap.put(arr[i], 0);
        }
        System.out.println(treeMap);
//        Lấy giá trị của phần tử nhỏ nhất trong TreeMap bằng cách sử dụng phương thức firstEntry() của đối tượng TreeMap
        System.out.println("Phần tử nhỏ nhất trong treemap là");
        System.out.println(treeMap.firstEntry());
    }
}
