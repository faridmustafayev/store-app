package games.storeApp5.main;

import games.storeApp5.enumProduct.NameProduct;
import games.storeApp5.shopping.Shopping;

public class Main {
    public static void main(String[] args) {

        Shopping shopping = new Shopping();

        shopping.buyProduct(NameProduct.SOFA, 120, 5);
        shopping.buyProduct(NameProduct.SOFA, 130, 6);
        shopping.buyProduct(NameProduct.SOFA, 130, 6);

        shopping.buyProduct(NameProduct.CHAIR, 200, 7);
        shopping.buyProduct(NameProduct.CHAIR, 250, 8);

        shopping.report();

        System.out.println("------------------------------------");

//        shopping.saleProduct(NameProduct.SOFA, 120, 2);
//
//        shopping.report();

    }
}
