public class Jardin implements ISync {

    private int contador;

    public Jardin() {
	this.contador = 0;
    }

    public synchronized void entrar() {
	contador++;
    }

    public synchronized void salir() {
	contador--;
    }

    public synchronized int obtContador() {
	return contador;
    }
}
