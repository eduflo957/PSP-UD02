import java.util.logging.Logger;

public class HelloThread extends Thread {
    //Lo tengo que poner por defecto para hacer el logging
    private static Logger logging = PSPLogger.getLogger(HelloThread.class.getName());

    //un thread es algo que tiene una función run
    public void run() {
        logging.info("Hola desde Thread");
    }

    //La función start la "comienza"
    public static void main (String[] args) {
        // Se llama a start, que pertenece a la clase Thread
        (new HelloThread()).start();
    }
}
