package Clases;
/**
 *
 * @author DIEGO FELIPE MUÑOZ
 */
public class BankAccount {
    //definimos atributos de la clase//
    private int accountNumber;
    protected boolean activate;

    
    //Definimos los metodos de la clase en este caso los get y set de activate
    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
    
    
}
