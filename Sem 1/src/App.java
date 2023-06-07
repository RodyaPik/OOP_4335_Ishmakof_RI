import Domen.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays", "Чипсы", 59);
        item1.setPrice(98);


        System.out.println(item1.toString());
    }
}
