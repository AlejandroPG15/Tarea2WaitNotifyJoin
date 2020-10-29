import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list =new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        try {

            while(true) {
                Camarero camarero = new Camarero();
                Cliente cliente = new Cliente();

                camarero.start();
                camarero.join();
                cliente.start();
                cliente.join();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

