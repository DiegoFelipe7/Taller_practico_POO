package Clases;
/**
 *
 * @author DIEGO FELIPE MUÑOZ
 */
public class Car {
 //definition of class attributes//  
    public String brand;
    public String model;
    public String color;
    private String enrollment;
    private double price;
    
    //Definimos un constructor con todos los atributos del objeto

    public Car(String brand, String model, String color, String enrollment, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.enrollment = enrollment;
        this.price = price;
    }

    //definimos los meodos de la clase en este caso los get y set 
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
            
            
    
}
