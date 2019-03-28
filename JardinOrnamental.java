public class JardinOrnamental {

    public static void main(String args[]) {

	ISync jardin = null;
	if (args.length == 0)
	    jardin = new Jardin();
	else
	    jardin = new JardinLimitado();

	Thread tAdmin = new Thread(new Admin(jardin));
	tAdmin.start();
	
	for (int i = 0; i < 20; ++i) {
	    Thread t = new Thread(new Gente(jardin));
	    t.start();
	}
	try {
	    tAdmin.join();

	}
	catch(InterruptedException ie) { }
    }
}
