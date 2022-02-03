
package principal;

//importamos las clases 
import Clases.BankAccount;
import Clases.Car;
import Clases.People;

/**
 *
 * @author ASUS
 */
public class index {

    public static void main(String[] args) {
        //ejemplo con la clase personas
        People people = new People();
        people.setName("Diego Muñoz");
        System.out.println(people.getName());
    
        //ejemplo con cuenta bancaria
        BankAccount bankAccount = new BankAccount();
        bankAccount.setActivate(true);
        
        
        //ejemplo con la clase carros enviamos datos por medio del construnctor
        Car car = new Car("Mazda", "Automovil", "Rojo", "2019", 145.44);
    }
    
}
