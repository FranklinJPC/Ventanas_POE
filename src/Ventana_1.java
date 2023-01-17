import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.text.DecimalFormat;

public class Ventana_1 {
    public JPanel panel1;
    private JTextField textEstatura;
    private JTextField textPeso;
    private JButton buttonCalcular;
    private JLabel labelResultado;

    public Ventana_1()
    {
    buttonCalcular.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            DecimalFormat dft = new DecimalFormat("0.##");
            double altura = Double.parseDouble(textEstatura.getText());
            double peso = Double.parseDouble(textPeso.getText());
            double resultado;
            resultado = peso / Math.pow(altura,2);
            JOptionPane.showMessageDialog(null,"Un mensaje!!!" + peso + "   " + altura + " = " + resultado);
            /* AL ACCIONAR SE REMPLAZA EL TEXTO EN EL LABEL */
            labelResultado.setText("Resultado: " + dft.format(resultado));
        }
    });

    }
}
