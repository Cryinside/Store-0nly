package ss17_IO_BinaryFile_Serialization.btap.models;

import java.io.Serializable;

public class Product implements Serializable {
    private String codeProduct;
    private String nameProduct;
    private String producer;
    private long money;

    public  Product() {
    }

    public Product(String codeProduct, String nameProduct, String producer, long money) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.money = money;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) { this.codeProduct = codeProduct; }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct=" + codeProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", producer='" + producer + '\'' +
                ", money=" + money +
                '}';
    }
}
