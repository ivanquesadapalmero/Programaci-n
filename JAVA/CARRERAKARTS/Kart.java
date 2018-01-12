package carreraKarts;

/**
 *
 * @author Iván Quesada Palmero
 */
public class Kart {

    // ATRIBUTOS
    int numero;
    int deposito;
    int velocidad;

    // CONSTRUCTOR
    public Kart(int numero, int velocidad) {
        this.numero = numero;
        this.velocidad = velocidad;
        this.deposito = 30;
    }

    public int getDeposito() {
        return deposito;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean depositoVacio() {
        if (this.getDeposito() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public int vuelta() {
        int bajaDeposito = (int) (3 + (Math.random() * 4));
        this.deposito -= bajaDeposito;

        int adelanta = (int) (Math.random() * 10 + 1);
        if (adelanta <= 2);
        return adelanta;
    }

    public String toString() {
        return "** Coche nº" + this.numero + " ** Dep." + this.getDeposito() + "** Vel." + this.getVelocidad();

    }
}

