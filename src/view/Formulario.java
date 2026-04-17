package view;

import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {

    public JTextField txtNombre, txtCorreo;
    public JCheckBox check;
    public JButton btnEnviar;

    public Formulario() {

        setTitle("AAPHAL - Asociación de Agricultores");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centrar ventana

        JPanel panel = new JPanel();
        panel.setLayout(null); // diseño manual
        panel.setBackground(new Color(34, 139, 34)); // verde agrícola

        // TÍTULO
        JLabel titulo = new JLabel("AAPHAL - Exportación de Palta");
        titulo.setBounds(80, 20, 350, 30);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titulo);

        // NOMBRE
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 80, 100, 25);
        lblNombre.setForeground(Color.WHITE);
        panel.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 80, 250, 25);
        panel.add(txtNombre);

        // CORREO
        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(50, 120, 100, 25);
        lblCorreo.setForeground(Color.WHITE);
        panel.add(lblCorreo);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(150, 120, 250, 25);
        panel.add(txtCorreo);

        // CHECKBOX
        check = new JCheckBox("Aceptar términos y condiciones");
        check.setBounds(120, 170, 250, 25);
        check.setBackground(new Color(34, 139, 34));
        check.setForeground(Color.WHITE);
        panel.add(check);

        // BOTÓN
        btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(180, 220, 120, 30);
        btnEnviar.setBackground(Color.WHITE);
        btnEnviar.setForeground(new Color(34, 139, 34));
        panel.add(btnEnviar);

        add(panel);
    }
}
