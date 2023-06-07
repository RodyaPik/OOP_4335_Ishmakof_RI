package Domen;

public class Bottle extends Product {  //унаследовали у продукта
    private int volume;

    /**
     * Create a product for VM
     * 
     * @param productId         id product
     * @param productName
     * @param productCategory
     * @param price
     * @throws Exception
     */
    public Bottle(int productId, String productName, String productCategory, double price, int volume) throws Exception{ //Конструктор заполнение
        super(productId, productName, productCategory, price); //вызов конструктора
        this.volume = volume;
    }
    
    public int getvolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override
    public String toString()    // переопределения класса, для корректного вывода
    {
        return "Product{" +
    "name='" + super.getProductName() +'\'' +
    "category='" + super.getProductCategory() + '\'' +
    ", cost=" + super.getPrice() +
    ", volume=" + volume +
    '}';
    }
}
