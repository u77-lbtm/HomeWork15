import java.lang.String;
import java.util.Objects;
import java.util.Arrays;

public class Order {
    public String customer;
    public Product[] productBasket;

    public Order(String customer, Product[] productBasket) {
        this.customer = customer;
        this.productBasket = productBasket;
    }

    @Override
    public String toString() {
        return "Заказчик: " + customer + ", Корзина: " + Arrays.toString(productBasket);
    }

    @Override
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


        boolean isBasketEqual = true;


        for (int i = 0; i < productBasket.length; i++) {
            Product p1 = this.productBasket[i];
            Product p2 = order.productBasket[i];


            if (p1 == null || p2 == null) {
                if (p1 != p2) {
                    isBasketEqual = false;
                    break;
                }
                continue;
            }


            if (!p1.equals(p2)) {
                isBasketEqual = false;
                break;
            }
        }

        return isBasketEqual;
    }
}
