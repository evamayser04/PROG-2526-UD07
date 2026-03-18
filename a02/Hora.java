package a02;

public class Hora {
    protected int h;
    protected int min;

    public Hora(int h, int min){
        this.h = h;
        this.min = min;
    }

    public void inc(){
        min++;
        if(min >= 60){
            min = 0;
            h++;
        }if(h >= 24){
            h = 0;
        }
    }

    public boolean setMinutos(int valor){
        
        boolean resultado = true;
        
        if(valor >= 60 ||valor < 0){
            resultado =  false;
        }else{
            min = valor;
        }
        return resultado;
    }

    public boolean setHora(int valor){
        
        boolean resultado = true;
        
        if(valor > 23 ||valor < 0){
            resultado =  false;
        }else{
            h = valor;
        }
        return resultado;
    }

    @Override
    public String toString() {
        String cad;
        cad = "La hora es: " + h + ":" + min;
        return cad;
        
    }
}
