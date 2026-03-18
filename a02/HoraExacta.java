package a02;

public class HoraExacta extends Hora {
    private int seg;

    // Constructor
    public HoraExacta(int h, int min, int seg) {
        super(h, min); // llamamos al constructor de Hora
        this.seg = seg;
    }

    // Setter de segundos
    public boolean setSegundos(int valor) {
        if (valor < 0 || valor >= 60) {
            return false;
        } else {
            seg = valor;
            return true;
        }
    }

    // Incrementar en un segundo
    @Override
    public void inc() {
        seg++;
        if (seg >= 60) {
            seg = 0;
            super.inc(); // usamos el inc() de Hora para minutos y horas
        }
    }

    // Representación en String
    @Override
    public String toString() {
        return "La hora exacta es: " + super.toString().substring(12) + ":" + seg;
        // super.toString() devuelve "La hora es: h:min", quitamos "La hora es:" con substring
    }
}
