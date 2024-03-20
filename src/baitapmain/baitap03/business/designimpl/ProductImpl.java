package baitapmain.baitap03.business.designimpl;

import baitapmain.baitap03.config.InputMethods;
import baitapmain.baitap03.business.entity.Product;
import baitapmain.baitap03.business.design.IProduct;

import java.util.*;

public class ProductImpl implements IProduct {
//    tạo mảng chứa thông tin
    private static List<Product> productList = new ArrayList<>(); // new LinkedList<>();

//    tìm qua id sản phẩm
    @Override
    public Product findById(Integer id) {
        for (Product p : productList) {
            if (p.getIdProduct() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public Product findByName(String name) {
        for (Product p : productList) {
            if (Objects.equals(p.getNameProduct(), name)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void addNewElement() {
        System.out.println("Nhập vào số lượng cần thêm");
        int count = InputMethods.getInteger();

//        Duyet them vao list
        for (int i = 1; i <= count; i++) {
            System.out.println("Nhập thông tin cho sản phẩm "+i);
            Product product = inputData(true);
//            them vao list
            productList.add(product);
        }
        System.out.println("Đã thêm thành công "+count+"sản phẩm");
    }

    @Override
    public void editElement() {
        System.out.println("Nhập id của sản phẩm cần chỉnh sửa thông tin:");
        int idEdit = InputMethods.getInteger();
        Product productEdit = findById(idEdit);
        if (productEdit == null){
            System.out.println("Không tìm thấy sản phẩm");
        }else{
//            thông tin sản phẩm cũ
            System.out.println("Thông tin sản phẩm hiện tại là :");
            System.out.println(productEdit);
            System.out.println("Nhập thông tin mới của sản phẩm :");
//            Không thay đổi id sản phẩm
            productEdit = inputData(false);
            productEdit.setIdProduct(idEdit);
//            them vào danh sách ở vị trí cũ
            productList.set(productList.indexOf(findById(idEdit)),productEdit);
            System.out.println("Đã cập nhật thông tin sản phẩm");
        }
    }

    @Override
    public void deleteElement() {
        System.out.println("Nhập id của sản phẩm cần xóa :");
        int idDel = InputMethods.getInteger();
        Product productDel = findById(idDel);
        if (productDel == null){
            System.out.println("Không tìm thấy sản phẩm.");
        }else{
            productList.remove(productDel);
            System.out.println("Xóa thành công");
        }

    }

    @Override
    public void displayAll() {
        if(productList.isEmpty()){
            System.out.println("Danh sách sản phẩm rỗng");
        }else{
            for (Product p : productList) {
                System.out.println(p);
            }
        }
    }

    @Override
    public Product inputData(boolean isAdd) {
        Product newProd = new Product();
        if (isAdd){
            newProd.setIdProduct(getNewId());
            System.out.println("ID Product : "+newProd.getIdProduct());
        }
        System.out.println("Nhập tên sản phẩm :");
        newProd.setNameProduct(InputMethods.getString());
        System.out.println("Nhập giá sản phẩm :");
        newProd.setPrice(InputMethods.getDouble());
        return newProd;
    }

    @Override
    public void displayByPrice() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice()< o2.getPrice()){
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                }else {
                    return -1;
                }
            }
        });
        displayAll();
    }

    @Override
    public void displayItemByName() {
        System.out.println("Nhập tển cần tìm:");
        String input = InputMethods.getString();
        Product item = findByName(input);
        if (item == null){
            System.out.println("Không tìm thấy sản phẩm");
        }else{
            System.out.println("Sản phẩm cần tìm là :");
            System.out.println(item);
        }
    }

    @Override
    public int getNewId() {
        int idMax = 0;
        for (Product product : productList) {
            if (idMax<product.getIdProduct()){
                idMax=product.getIdProduct();
            }
        }
        return idMax+1;
    }
}
