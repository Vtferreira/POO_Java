
package prjinsetos;

/**
 *
 * @author aluno
 */
public class PrjInsetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Inseto mosca = new Inseto();
        mosca.setTempoDevida(10);
        
        
       
        Inseto barata = new Inseto();
        barata.setTempoDevida(15);
        
        
        
        
        
        
        System.out.println("O tempo de vida da mosca e: " + mosca.getTempoDevida() + " Dias de vida");
        
        System.out.println("O tempo de vida da barata e: " + barata.getTempoDevida() + " Dias de vida");   
    }
    
}
