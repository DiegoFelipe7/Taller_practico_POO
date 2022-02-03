package Clases;
import java.util.Date;
/**
 *
 * @author DIEGO FELIPE MUÑOZ
 */
public class People {
    //Definimos los atributos de la clase y agregamos un atributo mas en este caso la identificacion//
    public String  name;
    private int identification_card;
    public String lastName1;
    public String lastName2;
    public Date dateBirth; 

    
    //Creamos los metodos de la clas en este caso los get y set 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
