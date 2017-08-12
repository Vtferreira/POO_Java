
package prjinsetos;

/**
 *
 * @author aluno
 */
public class Inseto {
    int tempoDevida;
    double patas;
    int tamanho;
    
    public Inseto(){
        
    }
    
    public Inseto(int tempoDevida, double patas){
        this.tempoDevida = tempoDevida;
        this.patas = patas; 
    }

    public int getTempoDevida() {
        return tempoDevida;
    }

    public void setTempoDevida(int tempoDevida) {
        this.tempoDevida = tempoDevida;
    }

    public double getPatas() {
        return patas;
    }

    public void setPatas(double patas) {
        this.patas = patas;
    }

    

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
