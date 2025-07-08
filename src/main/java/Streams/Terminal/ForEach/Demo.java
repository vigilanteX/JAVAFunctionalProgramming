package Streams.Terminal.ForEach;


import java.util.Arrays;
import java.util.List;

class Product2 {
    private String name;
    private String productCategory;

    public Product2(String name, String productCategory) {
        this.name = name;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}


public class Demo
{
    public static void main(String[] args) {

        List<Product2> products = Arrays.asList(
                new Product2("iPhone 15", "Electronics"),
                new Product2("Nike Shoes", "Footwear"),
                new Product2("Dell Laptop", "Electronics"),
                new Product2("Wooden Table", "Furniture"),
                new Product2("Ray-Ban Sunglasses", "Accessories"),
                new Product2("Puma T-shirt", "Clothing"),
                new Product2("Samsung TV", "Electronics"),
                new Product2("HP Printer", "Electronics"),
                new Product2("Levi's Jeans", "Clothing"),
                new Product2("Bajaj Mixer", "Home Appliances")
        );
        //products.stream().forEach(x-> System.out.println(x.getName()+" "+x.getProductCategory()));
    }
}
