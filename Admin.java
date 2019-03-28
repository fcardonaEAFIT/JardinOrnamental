import java.util.Random;

public class Admin implements Runnable {

    private ISync sync;

    Admin(ISync sync) {
	this.sync = sync;
    }

    public void run() {
	Random r = new Random();

	while (true) {
	    try {
		Thread.sleep(Math.abs(r.nextInt()) % 5000 + 1);
		int contador = sync.obtContador();
		System.out.println("Contado: " + contador);
		Thread.sleep(Math.abs(r.nextInt()) % 5000 + 1);
	    }
	    catch (InterruptedException ie) { }
	}

    }
}
