import java.lang.String;
import java.util.Objects;
import java.util.Arrays;

public class Order {
    public String customer;
    public Product[] productBasket; // Одно общее поле для корзины

    // Конструктор
    public Order(String customer, Product[] productBasket) {
        this.customer = customer;
        this.productBasket = productBasket;
    }


    @Override
    public String toString() {
        return "Заказчик: " + customer + ", Корзина: " + Arrays.toString(productBasket);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        if (!Objects.equals(this.customer, order.customer)) {
            return false;
        }
        if (this.productBasket == null || order.productBasket == null) {
            return this.productBasket == order.productBasket;
        }
        if (this.productBasket.length != order.productBasket.length) {
            return false;
        }
        for (int i = 0; i < this.productBasket.length; i++) {
            if (!Objects.equals(this.productBasket[i], order.productBasket[i])) {
                return false; // Если хоть один элемент не совпал — объекты не равны
            }
        }

        return true;
    }
}
