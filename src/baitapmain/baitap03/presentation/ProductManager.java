package baitapmain.baitap03.presentation;

import baitapmain.baitap03.business.design.IProduct;
import baitapmain.baitap03.business.designimpl.ProductImpl;
import baitapmain.baitap03.config.InputMethods;

public class ProductManager {
    private static IProduct productImpl = new ProductImpl();

    public static void main(String[] args) {
        while (true) {
            System.out.println("-----------Product Menu ------------");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("0. Quay lại");
            System.out.println("Nhâp lưa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    productImpl.addNewElement();
                    break;
                case 2:
                    productImpl.editElement();
                    break;
                case 3:
                    productImpl.deleteElement();
                    break;
                case 4:
                    productImpl.displayAll();
                    break;
                case 5:
                    productImpl.displayItemByName();
                    break;
                case 6:
                    productImpl.displayByPrice();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhập không đúng lựa chọn, vui lòng nhập lại.");
            }
        }

    }
}
