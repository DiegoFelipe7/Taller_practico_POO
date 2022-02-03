package Clases;
/**
 *
 * @author DIEGO FELIPE MUÑOZ
 */
public class Briefcase {
    //definicion los atributos de clase//
    public String color;
    private double price;
    public String brand;

    // definimos el constructor con los respectivos atributos
    public Briefcase(String color, double price, String brand) {
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    //definimos los metodos de la clase en este caso los get y set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    
}
