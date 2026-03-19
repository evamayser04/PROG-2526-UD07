package a05;

import a04.Instrumento;

public class Piano extends Instrumento {

    public void interpretar() {
        System.out.print("El piano toca: ");
        for (int i = 0; i < posicion; i++) {
            System.out.print(melodia[i] + " ");
        }
        System.out.println();
    }
}
