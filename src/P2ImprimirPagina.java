import javax.swing.*;
import java.awt.*;


public class P2ImprimirPagina {

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setTitle("Página 1");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final int[] numeroPagina = {1};

        JButton btnAnterior = new JButton("< Anterior");
        JButton btnSiguiente = new JButton("Siguiente >");

        btnAnterior.setEnabled(false);
        btnAnterior.addActionListener(e -> {
            if (numeroPagina[0] > 1) {
                numeroPagina[0]--;
                ventana.setTitle("Página " + numeroPagina[0]);
                btnSiguiente.setEnabled(true);
            }
            if (numeroPagina[0] == 1) {
                btnAnterior.setEnabled(false);
            }
        });

        btnSiguiente.addActionListener(e -> {
            if (numeroPagina[0] < 20) {
                numeroPagina[0]++;
                ventana.setTitle("Página " + numeroPagina[0]);
                btnAnterior.setEnabled(true);
            }
            if (numeroPagina[0] == 20) {
                btnSiguiente.setEnabled(false);
            }
        });

        JMenuBar menuBar = new JMenuBar();
        JMenu menuOperaciones = new JMenu("Operaciones");
        JMenuItem menuItemReiniciar = new JMenuItem("Reiniciar");
        JMenuItem menuItemSalir = new JMenuItem("Salir");

        menuItemReiniciar.addActionListener(e -> {
            numeroPagina[0] = 1;
            ventana.setTitle("Página " + numeroPagina[0]);
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(true);
        });

        menuItemSalir.addActionListener(e -> System.exit(0));

        menuOperaciones.add(menuItemReiniciar);
        menuOperaciones.addSeparator();
        menuOperaciones.add(menuItemSalir);

        menuBar.add(menuOperaciones);
        ventana.setJMenuBar(menuBar);

        JPanel pnlBotones = new JPanel(new FlowLayout());
        pnlBotones.add(btnAnterior);
        pnlBotones.add(btnSiguiente);

        ventana.add(pnlBotones, BorderLayout.CENTER);
        ventana.setVisible(true);
    }
}
