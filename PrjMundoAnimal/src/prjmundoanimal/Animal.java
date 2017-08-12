//operador de copia embutido, basicamente "this" tem a funcionalidade para efetuar a mudança (transição) de escopo
// efetuando a reeferencia ao atributo global encontrado na classe.

package prjmundoanimal;

public class Animal {
    private boolean sexoAnimal;
    
    //contrutor
    public Animal() {
        
        
    }

    //metodos acessores
    public void setSexoAnimal(String sexoAnimal) {
        if(sexoAnimal == "masculino")
            this.sexoAnimal = false;
         else 
            this.sexoAnimal=true;
        
        
    }
    
    public String getSexoAnimal() {
        if(sexoAnimal)
            return "feminino";
        return "masculino";
    }

    
       
}
