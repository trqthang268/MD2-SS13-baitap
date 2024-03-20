package baitapmain.baitap01;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
    public static void main(String[] args) {
//        khai bảo mảng hoặc list phần từ với bất kỳ kdl nào

        String [] kdl = {"SV001","SV002","SV003","SV001","SV004"};
        Map<String,Integer> hashMap = new HashMap<>();

//        Duyệt từng phần tử trong mảng và kiểm tra xem phần tử đó đã có trong HashMap hay chưa.
//        Nếu đã có thì tăng số lần xuất hiện lên 1, nếu chưa có thì thêm phần tử vào HashMap với số lần xuất hiện ban đầu là 1.

        for (String sv : kdl) {
            if (hashMap.containsKey(sv)){
                hashMap.put(sv,hashMap.get(sv)+1);
            }else {
                hashMap.put(sv,1);
            }
        }
//         Duyệt qua các phần tử trong HashMap và in ra số lần xuất hiện của từng phần tử.
        for(Map.Entry<String, Integer> entry :hashMap.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: "+key+" | Value: "+value);
        }
    }
}
