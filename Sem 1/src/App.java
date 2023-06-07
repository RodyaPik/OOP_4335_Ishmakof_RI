import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception { //подключение к продукту
        Product item1 = new Product(1, "Lays", "Чипсы", 59); //заполнения продука
        item1.setPrice(98); //меняем цену
        Product item2 = new Bottle(2, "Cola", "Water", 70, 500); //второй продукт

        VendingMachine iMachine = new VendingMachine(300); //добовление из разных продуктов
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Масло", "Масло", 59));// добавили принудительно
        iMachine.addProduct(new Bottle(4, "Water", "Water", 170, 1500));
        iMachine.addProduct(new HotDrink(5, "Coffee", "HotDrink", 300, 200, 98));
        for(Product prod: iMachine.getProducts())
        {
            System.out.println(prod.toString());
        }
        
        
        
    }
}
