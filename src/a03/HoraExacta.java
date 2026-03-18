package a03;

public class HoraExacta extends Hora {
    private int seg;

    public HoraExacta(int h, int min, int seg) {
        super(h, min);
        this.seg = seg;
    }

    public boolean setSegundos(int valor) {
        if (valor < 0 || valor >= 60) return false;
        seg = valor;
        return true;
    }

    @Override
    public void inc() {
        seg++;
        if (seg >= 60) {
            seg = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return String.format("La hora exacta es: %02d:%02d:%02d", getHora(), getMinutos(), seg);
    }

    // GETTERS protegidos para usar en equals y main
    public int getSegundos() {
        return seg;
    }

    public int getHora() {
        return super.getHora();
    }

    public int getMinutos() {
        return super.getMinutos();
    }

    // equals() para comparar horas exactas
    @Override
    public boolean equals(Object obj) {
        HoraExacta otra = (HoraExacta) obj;
        return this.getHora() == otra.getHora()
                && this.getMinutos() == otra.getMinutos()
                && this.seg == otra.seg;
    }
}
