package baitapmain.baitap03.business.design;

import baitapmain.baitap03.business.entity.Product;

public interface IProduct extends IDesign<Product,Integer,String> {
    int getNewId();
}
