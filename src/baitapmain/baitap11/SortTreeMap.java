package baitapmain.baitap11;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;

public class SortTreeMap {
    public static void main(String[] args) {
//    Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng. Với TreeMap, các phần tử sẽ được sắp xếp theo thứ tự tăng dần của khóa.
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Random ramdom = new Random();
        for (int i = 0; i < 20; i++) {
            map.put(ramdom.nextInt(100), 0);
        }//    Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap. Đối với mỗi phần tử trong mảng, thêm nó vào TreeMap với giá trị là 0.
//    Kiểm tra kết quả bằng cách in ra các phần tử trong TreeMap. Chú ý rằng các phần tử sẽ được in ra theo thứ tự tăng dần của khóa.
        System.out.println(map);
    }
}
