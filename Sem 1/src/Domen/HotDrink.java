package Domen;

public class HotDrink extends Product {
    private int temp;
    /**
     * Create a product for VM
     * 
     * @param productId         id product
     * @param productName
     * @param productCategory
     * @param price
     * @param volume
     * @throws Exception
     */
    public HotDrink(int productId, String productName, String productCategory, double price, int volume, double temp) throws Exception{ //Конструктор заполнение
        super(productId, productName, productCategory, price); //вызов конструктора
        this.temp = (int) temp;
    }
    
    public int getTemp() {
        return temp;
    }

    public void setTemp(int volume) {
        this.temp = temp;
    }
    
    @Override
    public String toString()    // переопределения класса, для корректного вывода
    {
        return "Product{" +
    "name='" + super.getProductName() +'\'' +
    "category='" + super.getProductCategory() + '\'' +
    ", cost=" + super.getPrice() +
    ", volume=" + super.getVolume() +
    ", temp=" + temp +
    '}';
    }
}

