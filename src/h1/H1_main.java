package h1;

public class H1_main {
    public static void main(String[] args) {
        PrioListe liste = new PrioListe();

        Patient a = new Patient("A", 1);
        Patient b = new Patient("B", 10);
        Patient c = new Patient("C", 5);
        Patient d = new Patient("D", 7);

        liste.addPatient(a);
        liste.addPatient(b);
        liste.addPatient(c);
        liste.addPatient(d);

        System.out.println(liste.getPosition(d));

        Patient naechster = liste.getNextPatient();
        if (naechster != null) {
            System.out.println(naechster.name);
        }

        System.out.println(liste.getPosition(d));
    }
}
