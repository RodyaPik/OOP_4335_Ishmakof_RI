package Domen;

public class Product { //классы
    private int productId;
    private String productName;
    private String productCategory;
    private Double price;

    public Product(int productId, String productName, String productCategory, double price) throws Exception{ //Конструктор заполнение
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;

    }

    public int getProductId() {
        return productId;
    }

    // public void setProductName() {
    //     this.productId = productId;
    // }

    public String getProductName() {
        return productName;
    }

    // public void setproductName(String productName) {
    //     this.productName = productName;
    // }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {    //проверка на цену
        if (price <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!", price));
        }
        this.price = price;
    }

    @Override
    public String toString()    // переопределения класса, для корректного вывода
    {
        return "Product{" +
    "name='" + productName +'\'' +
    "category='" + productCategory + '\'' +
    ", cost=" + price +
    '}';
    }
}
