package Clases;
/**
 *
 * @author DIEGO FELIPE MUÑOZ
 */
public class Computer {
    //definimos todos los atributos de el computador
    public String brand;
    public String processor;
    public int battery;
    protected String ram_memory;
    
    //definimos el constructor con todos los atributos de clase
    public Computer(String brand, String processor, int battery, String ram_memory) {
        this.brand = brand;
        this.processor = processor;
        this.battery = battery;
        this.ram_memory = ram_memory;
    }
    
    //definimos los metodos de la clase en este caso los get y set
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getRam_memory() {
        return ram_memory;
    }

    public void setRam_memory(String ram_memory) {
        this.ram_memory = ram_memory;
    }
    
    
    
}
