import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame {

    public FrmJuego() {
        setTitle("Juego de dados");
        setSize(600, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDado1 = new JLabel();
        String archivoImagen = "imagenes/4.jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(archivoImagen));
        lblDado1.setIcon(imgDado);
        lblDado1.setBounds(10, 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        getContentPane().add(lblDado1);

        JLabel lblDado2 = new JLabel();
        lblDado2.setIcon(imgDado);
        lblDado2.setBounds(20 + imgDado.getIconWidth(), 10,
                imgDado.getIconWidth(), imgDado.getIconHeight());
        getContentPane().add(lblDado2);

        JLabel lblTituloLanzamientos = new JLabel("Lanzamientos");
        lblTituloLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 10,
                100, 25);
        getContentPane().add(lblTituloLanzamientos);

        JLabel lblTituloCenas = new JLabel("Cenas");
        lblTituloCenas.setBounds(140 + 2 * imgDado.getIconWidth(), 10,
                100, 25);
        lblTituloCenas.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTituloCenas);

        JLabel lblLanzamientos = new JLabel("0");
        lblLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 40,
                100, 100);
        lblLanzamientos.setBackground(new Color(0, 0, 0));
        lblLanzamientos.setForeground(new Color(50, 255, 0));
        lblLanzamientos.setFont(new Font("Tahoma", 1, 72));
        lblLanzamientos.setOpaque(true);
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(lblLanzamientos);

        JLabel lblCenas = new JLabel("0");
        lblCenas.setBounds(140 + 2 * imgDado.getIconWidth(), 40,
                100, 100);
        lblCenas.setBackground(new Color(0, 0, 0));
        lblCenas.setForeground(new Color(50, 255, 0));
        lblCenas.setFont(new Font("Tahoma", 1, 72));
        lblCenas.setOpaque(true);
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(lblCenas);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(10, 20 + imgDado.getIconHeight(),
                100, 25);
        getContentPane().add(btnIniciar);

        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10, 60 + imgDado.getIconHeight(),
                100, 25);
        getContentPane().add(btnLanzar);

        btnIniciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarLanzamientos();
            }
            
        });

        btnLanzar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lanzar();
            }
            
        });

    }

    private void iniciarLanzamientos(){
        JOptionPane.showMessageDialog(null, "Hizo clicen el boton INICIAR");
    }

    private void lanzar(){
        JOptionPane.showMessageDialog(null, "Hizo clicen el boton LANZAR");
    }
}
