
package ColasArreglo;

/**
 *
 * @author hernan
 */
public class TestCola {
    
    public static void main(String[] args) {
        cola c = new cola(4);
        c.imprimirCola();
        c.insertarCola("hola");
        c.insertarCola(3);
        c.insertarCola("java");
        c.insertarCola(5);
        c.imprimirCola();
        
    }
    
}
