import Domen.Bottle;
import Domen.Product;

public class App {
    public static void main(String[] args) throws Exception { //подключение к продукту
        Product item1 = new Product(1, "Lays", "Чипсы", 59); //заполнения продука
        item1.setPrice(98); //меняем цену
        Product item2 = new Bottle(2, "Cola", "Water", 70, 50); //второй продукт

        System.out.println(item2.toString());
    }
}
