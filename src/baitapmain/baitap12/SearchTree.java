package baitapmain.baitap12;

import java.util.Map;
import java.util.TreeMap;

public class SearchTree {
    public static void main(String[] args) {
//        Khai báo và khởi tạo một mảng các số nguyên.
        int [] arr = {1,2,5,6,4,4,7,4,9,12,43,56,76,76,76,34,99};
        TreeMap<Integer,Integer> treeNumber = new TreeMap<>();
//        Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap. Đối với mỗi phần tử trong mảng, thêm nó vào TreeMap với giá trị là 0.
        for (int i : arr) {
            if (treeNumber.containsKey(i)){  //kiểm tra có key hay chưa, có thì value +1
                treeNumber.put(i,treeNumber.get(i)+1);
            }else {
                treeNumber.put(i,0);
            }
        }
        System.out.println(treeNumber);
//        phần tử lớn nhất trong treemap sẽ là phần tử lớn thứ 2 trong mảng ban đầu, dung phương thức lastKey() để lấy nó ra.
        Integer max = treeNumber.lastKey();
        Integer secondMax = treeNumber.lowerKey(max);
        System.out.println("Gia tri lon thu 2 la = "+secondMax+"| so phan tu lon thu 2 = "+treeNumber.get(secondMax));

    }
}
