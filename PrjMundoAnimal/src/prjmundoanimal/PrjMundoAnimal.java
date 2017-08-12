/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjmundoanimal;

/**
 *
 * @author aluno
 */
public class PrjMundoAnimal {

    
    public static void main(String[] args) {
        
        Animal edmundoAnimal = new Animal(); //instancia de objeto
        
        //masculino
        edmundoAnimal.setSexoAnimal("transgenero"); // definindo o sexo
        String resultado = edmundoAnimal.getSexoAnimal(); //obtemos o sexo
        System.out.println(resultado + " " + ("transgenero" == resultado)); // imprimimos o sexo
        
        edmundoAnimal.setSexoAnimal("masculino"); // definindo o sexo
        resultado = edmundoAnimal.getSexoAnimal();
        System.out.println(resultado + " " + ("masculino" == resultado));
        
        edmundoAnimal.setSexoAnimal("feminino"); // definindo o sexo
        resultado = edmundoAnimal.getSexoAnimal();
        System.out.println(resultado + " " + ("feminino" == resultado));
        
        edmundoAnimal.setSexoAnimal("xxxxxxxxxxx"); // definindo o sexo
        resultado = edmundoAnimal.getSexoAnimal();
        System.out.println(resultado + " " + ("masculino" == resultado));
        System.out.println(resultado + " " + ("feminino" == resultado));
        System.out.println(resultado + " " + ("transgenero" == resultado));
        System.out.println(resultado + " " + ("erro" == resultado));
        
    }
    
}
