package java_0718_ProductMgmt.src.com.example;

public class Product {
    private String name;
    private int quantity;
    private int sellPrice;
    private int buyPrice;
    private int transport; // 운송료
    private int benefit; // 이익금
    private double rate; // 이익율

    public Product(String name, int quantity, int sellPrice, int buyPrice, int transport) {
        this.name = name;
        this.quantity = quantity;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.transport = transport;
    }

    @Override
    public String toString() {
        return String.format("%10s\t%,7d\t%,7d\t%,7d\t%,7d\t%,10d\t%7.2f", name, quantity, sellPrice, buyPrice, transport, benefit, rate);
//        return String.format("%12s\t%7d\t%7d\t%7d\t%7d\t%7d\t%7.2f",name,quantity,sellPrice,buyPrice,transport,benefit,rate);

//      return    "name : '" + name + '\'' +
//                ", quantity : " + quantity +
//                ", sellPrice : " + sellPrice +
//                ", buyPrice : "  + buyPrice +
//                ", transport : " + transport +
//                ", benefit : " + benefit +
//                ", rate : " + rate +
//                '}';
    }

    // name, quantity, sellPrice, buyPrice, transport는 읽기만해서 setter는 필요 없다.

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getTransport() {
        return transport;
    }

    public int getBenefit() {
        return benefit;
    }

    public double getRate() {
        return rate;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
