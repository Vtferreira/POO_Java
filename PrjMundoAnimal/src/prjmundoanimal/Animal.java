//operador de copia embutido, basicamente "this" tem a funcionalidade para efetuar a mudança (transição) de escopo
// efetuando a reeferencia ao atributo global encontrado na classe.
// inserir o genero transgenero
package prjmundoanimal;

public class Animal {
    private char sexoAnimal = 'x';
    
    //contrutor
    public Animal() {
        
        
    }

    //metodos acessores
    public void setSexoAnimal(String sexoAnimal) {
        if(sexoAnimal == "masculino")
            this.sexoAnimal = 'm';
        else if(sexoAnimal == "feminino")
            this.sexoAnimal = 'f';
        else if(sexoAnimal == "transgenero")
            this.sexoAnimal = 't';
        else 
            this.sexoAnimal = 'x';
    }
    
    public String getSexoAnimal() {
        if(sexoAnimal == 'f')
            return "feminino";
        else if(sexoAnimal == 'm' )
            return "masculino";
        else if(sexoAnimal == 't')
            return "transgenero";
        return "erro";
    }   
}
