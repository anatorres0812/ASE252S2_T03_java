package controller;

import view.Formulario;
import model.Usuario;

import javax.swing.*;

public class Controlador {

    public Controlador(Formulario vista) {

        vista.btnEnviar.addActionListener(e -> {

            String nombre = vista.txtNombre.getText();
            String correo = vista.txtCorreo.getText();

            if (nombre.isEmpty() || correo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
                return;
            }

            if (!vista.check.isSelected()) {
                JOptionPane.showMessageDialog(null, "Debe aceptar los términos");
                return;
            }

            Usuario usuario = new Usuario(nombre);

            JOptionPane.showMessageDialog(null,
                    "Registro exitoso\nBienvenido a AAPHAL " + usuario.getNombre());
        });
    }
}
