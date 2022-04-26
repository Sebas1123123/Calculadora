
public class Dado
{
    //variables de instancia:
    //atributos inherentes que ayudan a describir un dado
    int valor;
    
    //métodos
    //ayudan a describir el comportamiento de un dado
    public Dado(){
        gire();
    }
    
    public void gire(){
        valor=1+(int)(Math.random()*6);
    }
    
    public int deValor(){
        return valor;
    }
    public int tomeValor(){
    
    }
}
