package Streams.Terminal.Collect;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
    private String name;
    private String productCategory;

    public Product(String name, String productCategory) {
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


public class Demo4
{
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("iPhone 15", "Electronics"),
                new Product("Nike Shoes", "Footwear"),
                new Product("Dell Laptop", "Electronics"),
                new Product("Wooden Table", "Furniture"),
                new Product("Ray-Ban Sunglasses", "Accessories"),
                new Product("Puma T-shirt", "Clothing"),
                new Product("Samsung TV", "Electronics"),
                new Product("HP Printer", "Electronics"),
                new Product("Levi's Jeans", "Clothing"),
                new Product("Bajaj Mixer", "Home Appliances")
        );

        Map<String,List<Product>> mapprods= products.stream().collect(Collectors.groupingBy(x->x.getProductCategory()));
        System.out.println(mapprods);
    }
}
