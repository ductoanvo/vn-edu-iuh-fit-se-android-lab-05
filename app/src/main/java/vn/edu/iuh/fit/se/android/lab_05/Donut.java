package vn.edu.iuh.fit.se.android.lab_05;

public class Donut {
    private String type;
    private String desc;
    private double price;
    private int image;

    public Donut(String type, String desc, double price, int image) {
        setType(type);
        setDesc(desc);
        setPrice(price);
        setImage(image);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", image=" + image +
                '}';
    }
}
