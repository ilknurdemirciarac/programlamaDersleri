package oop1;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        // set value
        product1.name = "Delong Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitInStock = 3;
        product1.imageUrl = "delong.jpg";

        // get
        // System.out.println(product1.name);
        Product product2 = new Product();
        product2.name = "Smeg Kahve Makinesi";
        product2.unitPrice = 6500;
        product2.discount = 8;
        product2.unitInStock = 4;
        product2.imageUrl = "smeg.jpg";

        Product product3 = new Product();
        product3.name = "Kitchen Kahve Makinesi";
        product3.unitPrice = 4500;
        product3.discount = 9;
        product3.unitInStock = 2;
        product3.imageUrl = "kitchen.jpg";

        Product[] products = { product1, product2, product3 };

        System.out.println("<ul>");
        System.out.println("Ürün Adı \t  Ürün Fiyatı \tStok \tÜrün Resmi");
        for (Product product : products) {
            System.out.println("<li>"+ 
                    product.name + "\t" + product.unitPrice + "\t" + product.unitInStock + "\t" + product.imageUrl+"</li>");

        }
        System.out.println("</ul>");

    }
}
