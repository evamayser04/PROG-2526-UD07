package a05;

import a04.Nota;

public class Main {
    public static void main(String[] args) {
        Piano p = new Piano();

        p.add(Nota.SOL);
        p.add(Nota.LA);
        p.add(Nota.SI);
        p.add(Nota.DO);
        p.add(Nota.RE);

        p.interpretar();
    }
}
