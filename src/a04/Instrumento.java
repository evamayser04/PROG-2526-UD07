package a04;

public abstract class Instrumento {
    protected Nota[] melodia;
    protected int posicion;
    
    public Instrumento(){
        melodia = new Nota[10];
        posicion = 0;
    }
    
    public void add(Nota n) {
        if (posicion < melodia.length) {
            melodia[posicion] = n;
            posicion++;
        } else {
            System.out.println("Has alcanzado el máximo");
        }
    }
    
    public abstract void interpretar();
}
