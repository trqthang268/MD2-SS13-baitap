package baitapmain.baitap02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OnlyItem {
    public static void main(String[] args) {
//        Khai báo mảng chứa các phần tử và khởi tạo HashMap để lưu trữ các phần tử duy nhất.
        int[] arr = {1,2,3,4,5,6,7,8,9,7,3,5,2};
        HashMap<Integer,Integer> numArr = new HashMap<>();

//         Duyệt từng phần tủ trong mảng
        for (int i = 0; i < arr.length; i++) {
//          Kiểm tra đã có trong HashMap hay chưa
            if (numArr.containsKey(arr[i])){   //Có thì tăng giá trị lên 1
                numArr.put(arr[i], numArr.get(arr[i])+1);
            }else {                           // chưa có thì đặt giá trị ban đầu là 1
                numArr.put(arr[i], 1);
            }
        }
//        Duyệt qua các pt trong HashMap và lưu trữ các pt có gtri =1 vào mảng mới
        ArrayList<Integer> newArr = new ArrayList<>(); // khởi tạo mảng mới
        for (Map.Entry<Integer,Integer> entry : numArr.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
//            kiểm tra value các số có value = 1 đẩy vào mảng mới
            if (value == 1){
                newArr.add(key);
            }
        }
//        in ra
        System.out.println("Các phần tử duy nhất là :"+newArr);
    }
}
