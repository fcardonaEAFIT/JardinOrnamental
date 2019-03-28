public class JardinLimitado implements ISync {

    private int contador;
    final private int maximo = 3;

    public JardinLimitado() {
	this.contador = 0;
    }

    public synchronized void entrar() {
	try {
	    while (contador == maximo) wait();
	} catch (InterruptedException ie) { }
	contador++;
    }

    public synchronized void salir() {
	if (contador == maximo) notify();
	contador--;
    }

    public synchronized int obtContador() {
	return contador;
    }
}
