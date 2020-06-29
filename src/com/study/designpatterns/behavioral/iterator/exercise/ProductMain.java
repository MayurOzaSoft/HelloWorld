package com.study.designpatterns.behavioral.iterator.exercise;

import com.study.designpatterns.behavioral.iterator.Iterator;

public class ProductMain {
    public static void main(String[] args) {
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "IPHONE XR"));
        productCollection.add(new Product(2, "IPHONE 6"));
        productCollection.add(new Product(3, "IPHONE 7"));
        productCollection.add(new Product(4, "IPHONE MAX"));
        productCollection.add(new Product(5, "IPHONE 11 PRO"));

        Iterator iterator = productCollection.createIterator();
        while (iterator.hasNext()){
            Product product = (Product) iterator.current();
            System.out.println(product);
            iterator.next();
        }
    }
}
