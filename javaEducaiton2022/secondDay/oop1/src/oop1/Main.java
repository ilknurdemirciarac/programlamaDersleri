package oop1;

public class Main {
    public static void main(String[] args) {
        //String mesaj = "Vade oranı";

        Product product1 = new Product();
        // set value
        product1.setName("Delong Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.jpg");
        

        // get
        // System.out.println(product1.name);
        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(9);
        product2.setUnitPrice(6500);
        product2.setUnitInStock(5);
        product2.setImageUrl("image2.jpg");
        

        Product product3 = new Product();
        product2.setName("Kitchen Kahve Makinesi");
        product2.setDiscount(8);
        product2.setUnitPrice(8500);
        product2.setUnitInStock(4);
        product2.setImageUrl("image3.jpg");
        

        Product[] products = { product1, product2, product3 };

        System.out.println("<ul>");
        System.out.println("Ürün Adı \t  Ürün Fiyatı \tStok \tÜrün Resmi");
        for (Product product : products) {
            System.out.println("<li>"+ 
                    product.getName() + "\t" + product.getUnitPrice() + "\t" + product.getUnitInStock() + "\t" + product.getImageUrl()+"</li>");

        }
        System.out.println("**********************");
       
        
        
        for (Product product : products) {
            System.out.println(
                    product.getName() + "\t" + product.getUnitPrice() + "\t" + product.getUnitInStock() + "\t" + product.getImageUrl());

        }

        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setFirstName("İsmail");
        individualCustomer.setLastName("Demirci");
        individualCustomer.setCustomerNumber("1232456");
        individualCustomer.setPhone("(344)1232344");

        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(5);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setCustomerNumber("123454322");
        corporateCustomer.setPhone("(212)1342345");
        corporateCustomer.setTaxNumber("1234567");
        
        Customer[] customers={individualCustomer,corporateCustomer};//hiç kızmadı Customer aynı zamanda individual ve corporate olduğu için     
        for (Customer customer : customers) {

            System.out.println(customer.getId()+customer.getCustomerNumber());
            
        }  
        
       

    }
}
