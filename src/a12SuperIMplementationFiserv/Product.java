package a12SuperIMplementationFiserv;

public class Product {


    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // You may need to implement a proper hash function based on your product data
    @Override
    public int hashCode() {
        // Assuming id is unique for each product
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product otherProduct = (Product) obj;
        return id == otherProduct.id;
    }
}
