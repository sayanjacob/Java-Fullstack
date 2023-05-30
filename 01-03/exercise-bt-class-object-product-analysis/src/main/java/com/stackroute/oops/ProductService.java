package com.stackroute.oops;
import java.util.ArrayList;

/* Class for Analyzing the products present in ProductRepository */
public class ProductService {
    Product[] products = ProductRepository.getProducts();
    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {
        for(Product product: products){
            if(product.getProductCode() == productCode){
                return product.getName();
            }
        }
        return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
        Product maxPriceProductInCategory = null;
        for(Product product: products){
            if((product.getCategory().equals(category))){
                if(maxPriceProductInCategory==null){
                    maxPriceProductInCategory = product;
                }
                if(product.getPrice()> maxPriceProductInCategory.getPrice())
                {
                    maxPriceProductInCategory = product;
                }
            }
        }
        return maxPriceProductInCategory;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
        ArrayList<Product> tempList = new ArrayList<>();

        for(Product product: products){
            if(product.getCategory().equals(category)){
                tempList.add(product);
            }
        }

        if(tempList.size()==0){
            return null;
        }
        return tempList.toArray(new Product[tempList.size()]);
    }
}