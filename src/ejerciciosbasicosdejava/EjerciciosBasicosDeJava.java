package ejerciciosbasicosdejava;

/**
 *
 * @author Fernando Piñeira
 */
public class EjerciciosBasicosDeJava {

    public int multa(int velocidadCoche, boolean cumpleaños) {
        if (velocidadCoche <= 60) {
            return 0;
        }
        if (velocidadCoche >= 61 && velocidadCoche <= 80) {
            return 1;
        }
        if (velocidadCoche <= 81) {
            return 2;

        }
        return 0;
    }

    public boolean fiestaArdillas(int numeroBellotas, boolean finDeSemana) {
        if (finDeSemana) {
            return true;
        }
        if (numeroBellotas >= 40 && numeroBellotas <= 60) {
            return true;
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosDeJava ejercicios = new EjerciciosBasicosDeJava();
        System.out.print(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, false));
        System.out.print(ejercicios.fiestaArdillas(70, true));

    }

}
