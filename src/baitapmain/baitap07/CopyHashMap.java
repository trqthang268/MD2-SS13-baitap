package baitapmain.baitap07;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CopyHashMap {
    public static void main(String[] args) {
//     Khai báo và khởi tạo HashMap gốc.và tạo dữ liệu.
        Map<Integer, Integer> hashMap = new HashMap<>();
        int [] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(i, random.nextInt(100));
        }
        System.out.println("Bản gốc :");
        System.out.println(hashMap);
//     Khai báo một HashMap mới và sử dụng phương thức putAll() để sao chép tất cả các phần tử từ HashMap gốc vào HashMap mới.
        Map<Integer, Integer> copyMap = new HashMap<>();
        copyMap.putAll(hashMap);
//     Kiểm tra xem HashMap mới đã sao chép chính xác tất cả các phần tử từ HashMap gốc hay chưa
        System.out.println("Bản sao :");
        System.out.println(copyMap);
    }
}
