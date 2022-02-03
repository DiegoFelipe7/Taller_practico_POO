package Clases;

import java.util.ArrayList;
/**
 *
 * @author DIEGO FELIPE MUÑOZ
 */
public class Fruit {    
    //definimos los atributos de la clase //
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;
    
    
    //creamos los metodos de la clase  en este caso el get y set 
    public String setColor(String name){
        return this.name=name;
    }
    public ArrayList<String> getColors() {
        return colors;
    }
    
}
