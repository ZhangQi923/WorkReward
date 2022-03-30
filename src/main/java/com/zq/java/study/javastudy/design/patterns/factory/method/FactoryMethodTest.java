package com.zq.java.study.javastudy.design.patterns.factory.method;

public class FactoryMethodTest {

    public static void main(String[] args) {
        Application application = new Application();
        ProductA product = application.getObject();
        product.method1();
    }
}


class ProductA {
    public void method1() {
        System.out.println("ProductA.method1 executed.");
    }
}


class Application {
    private ProductA createProduct() {
        // ....init
        // ....
        return new ProductA();
    }

    ProductA getObject() {
        ProductA product = createProduct();
        // ...
        return product;
    }
}