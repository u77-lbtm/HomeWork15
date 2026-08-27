import java.util.Objects;
import java.lang.String;
public class Product {
    int id;
    String name;
    int price;
    String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Артикул - " + this.id + "; Название - " + this.name + "; Цена - " + this.price + "; Категория - " + this.category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
            Product product = (Product) o;
            return this.id == product.id && Objects.equals(this.category, product.category);

    }
}


