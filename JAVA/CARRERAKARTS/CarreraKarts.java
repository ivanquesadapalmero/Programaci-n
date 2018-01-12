package carreraKarts;

/**
 *
 * @author Iván Quesada Palmero
 */
public class CarreraKarts {

    // METODOS
    public static void verClasificacion(int[] p) {
        System.out.print("CLASIF.: (" + p[0]);
        for (int i = 1; i < p.length; i++) {
            System.out.print("," + p[i]);
        }
        System.out.println(")");
    }
    
    //Devuelve la posicion del numero dentro del array
    public static int verPos(int[] p, int numero) {
        int i;
        for (i = 0; i < p.length; i++) {
            if (p[i] == numero) {
                int posicion = i++;
            }

        }
        return 0;
    }

    //Ca
    public static void reordenar(int[] p, int numero, int adelanta) {

    }

    public static void main(String[] args) {
// ------- DECLARACIONES E INICIALIZACIONES
// Declarar arrays de objetos
        Kart[] kart = new Kart[10];
// Declarar array de posiciones
// El coche nº 10 lo poenmos en posición 1, el 9 en la 2, ...
        int[] posicion = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
// Variable que registra adelantamientos
        int adelantamiento = 0;
// Instanciar objetos
        for (int i = 0; i < 10; i++) {
            kart[i] = new Kart(i + 1, 40 + i);
        }
// Ver propiedades de los objetos
        for (int i = 0; i < 10; i++) {
            System.out.println(kart[i]);
        }
// --------------------------
// Ver clasificación actual
        verClasificacion(posicion);
// Dar una vuelta para todos los kart
        for (int v = 0; v < 6; v++) {
            System.out.println("))))) VUELTA: " + v);
            for (int i = 0; i < 10; i++) {
                System.out.println("Inicio de la vuelta del coche " + kart[i].numero);
                adelantamiento = kart[i].vuelta();
                if ((adelantamiento != 0)
                        && (verPos(posicion, kart[i].numero) - adelantamiento) >= 0) {
                    reordenar(posicion, kart[i].numero, adelantamiento);
                    System.out.println("El coche " + kart[i].numero + " tiene un premio por adelantar");
                }
            }
// Ver clasificación actual
            verClasificacion(posicion);
        }
// Ver propiedades de los objetos
        for (int i = 0; i < 10; i++) {
            System.out.println(kart[i]);
        }
    }
}
