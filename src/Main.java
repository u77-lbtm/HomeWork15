
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Телефон", 50000, "Электроника");
        Product product2 = new Product(2, "Ноутбук", 80000, "Электроника");
        Product product3 = new Product(1, "Телефон", 50000, "Электроника");

        Product[] basket1 = {product1, product2};
        Product[] basket2 = {product3};

        Order order1 = new Order("Михаил", basket1);
        Order order2 = new Order("Анна", basket2);
        Order order3 = new Order("Михаил", basket1);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        System.out.println("order1.equals(order2) = " + order1.equals(order2)); //  false
        System.out.println("order1.equals(order3) = " + order1.equals(order3)); //  true

    }
}




