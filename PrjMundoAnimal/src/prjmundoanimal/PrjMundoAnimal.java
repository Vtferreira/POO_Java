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
        
        edmundoAnimal.setSexoAnimal("masculino"); // definindo o sexo
        
        String resultado = edmundoAnimal.getSexoAnimal(); //obtemos o sexo
        System.out.println(resultado); // imprimimos o sexo
        
    }
    
}