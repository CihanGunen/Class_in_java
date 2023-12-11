public class Main {
    public static void main(String[] args) {

        // set value
        Product product1=new Product();
        product1.setName("Delonghi Kahve  Makinesi");
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setDiscount(7);
        product1.setImageUrl("bilmemne.jpg");
        // get value
        // System.out.println(product1.name);




        Product product2=new Product();
        product2.setName("Philips Kahve  Makinesi");
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(3);
        product2.setDiscount(4);
        product2.setImageUrl("bilmemne.jpg");

       // System.out.println(product2.name);




        Product product3=new Product();
        product3.setName("Bosch Kahve  Makinesi");
        product3.setUnitPrice(3500);
        product3.setUnitsInStock(23);
        product3.setDiscount(9);
        product3.setImageUrl("bilmemne.jpg");
       // System.out.println(product3.name);




        Product[] products={product1,product2,product3};
        System.out.println("<ul>");
        for(Product product:products){
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(32);
        individualCustomer.setPhone("0677848");
        individualCustomer.setCostumerNumber("12345");
        individualCustomer.setFirstName("Cihan");
        individualCustomer.setLastName("Günen");
        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodla.cuan");
        corporateCustomer.setPhone("0533335");
        corporateCustomer.setTaxNumber("22222222");
        corporateCustomer.setCostumerNumber("4552");


        Customer[] customers = {individualCustomer,corporateCustomer};






    }
}