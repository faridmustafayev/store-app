package games.storeApp5.shopping;

import games.storeApp5.enumProduct.NameProduct;
import games.storeApp5.product.Product;

import java.util.*;
import java.util.function.BiFunction;

public class Shopping {

    Map<NameProduct, List<Product>> productMap;
    public Shopping() {
        productMap = new HashMap<>();
    }

    public void buyProduct(NameProduct nameProduct, double weight, int count) {
        if (count > 0) {



//            productMap.merge(nameProduct, new ArrayList<>(),
//                    new BiFunction<List<Product>, List<Product>, List<Product>>() {
//                @Override
//                public List<Product> apply(List<Product> products, List<Product> products2) {
//                    return null;
//                }
//            });

            List<Product> products = productMap.get(nameProduct);
            if (!productMap.containsKey(nameProduct)) {

                ArrayList< Product> productList = new ArrayList<>();
                productList.add(new Product(nameProduct.name(), weight, count));
                productMap.put(nameProduct, productList);

            } else if (products.stream().allMatch(p -> p.getWeight() != weight)) {
                products.add(new Product(nameProduct.name(),weight, count));
                productMap.put(nameProduct,products);

            }else {// name eyni, weight eyni,count artirmalisan
                Product product = products
                        .stream()
                        .filter(p -> p.getWeight() == weight)
                        .findFirst()
                        .orElseThrow(RuntimeException::new);

                product.setCount(product.getCount()+count);
            }
        }
        else {
            throw new RuntimeException("count can not be negative .. ");
        }

    }

    public void saleProduct(NameProduct nameProduct, double weight, int count) {
        Product product = productMap
                .get(nameProduct)
                .stream()
                .filter(p -> p.getWeight() == weight)
                .findFirst()
                .get();

        if (count > 0 && count >= product.getCount()) {

            if (productMap.containsKey(nameProduct) && (product.getWeight() == weight)) {
                product.setCount(product.getCount() - count);
            }
            else {
                System.out.println("weight of the product is incorrect .. ");
            }
        }
        else {
            throw new RuntimeException("value of count is incorrect .. ");
        }
    }


    public void report() {
        System.out.println(productMap);
    }

}
