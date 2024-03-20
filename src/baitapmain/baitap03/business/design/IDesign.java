package baitapmain.baitap03.business.design;

public interface IDesign <T,E,A>{
    T findById(E idProduct);
    T findByName(A nameProduct);
    void addNewElement();
    void editElement();
    void deleteElement();
    void displayAll();
    T inputData(boolean isAdd);
    void displayByPrice();
    void displayItemByName();

}
