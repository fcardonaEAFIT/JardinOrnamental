import java.util.Random;

public class Gente implements Runnable {

    private ISync sync;

    Gente(ISync sync) {
	this.sync = sync;
    }

    public void run() {
	Random r = new Random();

	while (true) {
	    sync.entrar();
	    System.out.println("Hilo dentro jardin: " +
			       Thread.currentThread());
	    try {
		Thread.sleep(Math.abs(r.nextInt()) % 5000 + 1);
		sync.salir();
		Thread.sleep(Math.abs(r.nextInt()) % 5000 + 1);
		System.out.println("Estoy fuera del jardin: " +
				   Thread.currentThread());
	    }
	    catch (InterruptedException ie) { }
	}

    }
}
