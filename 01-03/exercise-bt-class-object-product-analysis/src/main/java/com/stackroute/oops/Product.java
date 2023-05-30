package com.stackroute.oops;

/*
    Product class stores the information about a single product.
    It contains parameterized constructor and Getters/Setters
 */
public class Product {
        private int productCode;
        private String name;
        private double price;
        private String Category;

        public Product(int productCode, String name, double price, String category) {
            this.productCode = productCode;
            this.name = name;
            this.price = price;
            this.Category = category;
        }

        public int getProductCode() {
            return productCode;
        }

        public void setProductCode(int productCode) {
            this.productCode = productCode;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCategory() {
            return Category;
        }

        public void setCategory(String category) {
            Category = category;
        }
    }