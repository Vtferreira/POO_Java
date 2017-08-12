
package exercicio;

import objetos.Retangulo;
import classes.LogicaRetangulo;

/**
 *
 * @author vinicius tarcisio
 */

public class Exercicio {

    public static void main(String[] args) {
        Retangulo q = new Retangulo();
        q.setA(6);
        q.setB(4);
        
        LogicaRetangulo lq = new LogicaRetangulo();
        q = lq.somarArea(q);
        
        System.out.println("A área do Retangulo é: " + q.getArea());      
    }
}