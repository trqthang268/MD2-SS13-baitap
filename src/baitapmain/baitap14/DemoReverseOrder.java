package baitapmain.baitap14;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;

public class DemoReverseOrder {
    public static void main(String[] args) {
//        Khởi tạo TreeMap với comporator. reverseOrder()
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        Random ramdom = new Random();
//        Thêm các phần tử vào TreeMap
        for (int i = 0; i < 20; i++) {
            map.put(i, ramdom.nextInt(100) );
        }
//        In ra các phần tử của treemap
        System.out.println(map);
    }
}
