import javax.swing.*;
import java.awt.*;


public class P1EtiquetasColoridas {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("P1EtiquetasColoridas");
        JPanel panelPrincipal = new JPanel();

        JLabel etiqueta = new JLabel("Selecciona un color");
        etiqueta.setHorizontalAlignment(JLabel.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JRadioButton rojo = new JRadioButton("Rojo");
        JRadioButton verde = new JRadioButton("Verde");
        JRadioButton azul = new JRadioButton("Azul");

        rojo.addActionListener(e -> {
            etiqueta.setText("Seleccionado: Rojo");
            etiqueta.setBackground(Color.RED);
            etiqueta.setForeground(Color.RED);
        });
        verde.addActionListener(e -> {
            etiqueta.setText("Seleccionado: Verde");
            etiqueta.setBackground(Color.GREEN);
            etiqueta.setForeground(Color.GREEN);
        });
        azul.addActionListener(e -> {
            etiqueta.setText("Seleccionado: Azul");
            etiqueta.setBackground(Color.BLUE);
            etiqueta.setForeground(Color.BLUE);
        });

        ButtonGroup botones = new ButtonGroup();
        botones.add(rojo);
        botones.add(verde);
        botones.add(azul);

        panel.add(rojo);
        panel.add(verde);
        panel.add(azul);

        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(etiqueta, BorderLayout.PAGE_START);
        panelPrincipal.add(panel, BorderLayout.CENTER);

        ventana.add(panelPrincipal);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);
        ventana.setVisible(true);
    }
}
