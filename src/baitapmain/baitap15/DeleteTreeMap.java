package baitapmain.baitap15;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;

public class DeleteTreeMap {
    public static void main(String[] args) {
//        Khởi tạo TreeMap và thêm các phần tử
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Random ramdom = new Random();
//        Thêm các phần tử vào TreeMap
        for (int i = 0; i < 20; i++) {
            map.put(i, ramdom.nextInt(100) );
        }
//        in treemap ra để kiểm tra
        System.out.println("Trước khi xóa");
        System.out.println(map);
//        thực hiện xóa bằng phương thức remove()
        map.remove(0);
        map.remove(1);
        map.remove(2);
//        in ra để kiểm tra
        System.out.println("Sau khi xóa");
        System.out.println(map);

    }
}
