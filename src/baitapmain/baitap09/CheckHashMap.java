package baitapmain.baitap09;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class CheckHashMap {
    public static void main(String[] args) {
//     Khai báo và khởi tạo HashMap với các phần tử bên trong.
        Scanner scanner =new Scanner(System.in);
        Map<Integer, Integer> hashMap = new HashMap<>();
        int [] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(i, random.nextInt(100));
        }
        System.out.println(hashMap);
//     Sử dụng phương thức containsKey() để kiểm tra xem phần tử đó có tồn tại trong HashMap hay không nếu có trả về true, nếu không trả về false
        System.out.println("Nhập số muốn kiểm tra sự tồn tại");
        int inputCheck = Integer.parseInt(scanner.nextLine());
        boolean flag = hashMap.containsKey(inputCheck);
        System.out.println("Phần tử "+inputCheck+" có tồn tại trong HashMap hay không:");
        System.out.println(flag);
    }
}
