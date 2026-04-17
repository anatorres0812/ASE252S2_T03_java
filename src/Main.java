import view.Formulario;
import controller.Controlador;

public class Main {
    public static void main(String[] args) {

        Formulario vista = new Formulario();
        new Controlador(vista);

        vista.setVisible(true);
    }
}
