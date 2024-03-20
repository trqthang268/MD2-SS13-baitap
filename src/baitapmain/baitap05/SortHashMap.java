package baitapmain.baitap05;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
//      Khai báo một HashMap chứa các phần tử và giá trị của chúng.
        HashMap<Integer, Integer> map =new HashMap<>();
//      Tạo một danh sách các cặp key-value từ HashMap.
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        System.out.println(map);
//      Sử dụng phương thức Collections.sort() để sắp xếp danh sách các phần tử theo giá trị tăng dần của chúng.
        ArrayList<HashMap.Entry<Integer,Integer>> newArr = new ArrayList<>(map.entrySet()); // chuyển sang array để sắp xếp
        Collections.sort(newArr,(o1,o2)-> o1.getValue().compareTo(o2.getValue()));
//      Duyệt qua danh sách đã sắp xếp và in ra các phần tử và giá trị của chúng theo thứ tự tăng dần.
        for (Map.Entry<Integer, Integer> entry : newArr) {
            System.out.println(entry);
        }
    }
}
