package a01;

public class Hora {
    private int h;
    private int min;

    Hora(int h, int min){
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

    boolean setMinutos(int valor){
        
        boolean resultado = true;
        
        if(valor >= 60 ||valor < 0){
            resultado =  false;
        }else{
            min = valor;
        }
        return resultado;
    }

    boolean setHora(int valor){
        
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
