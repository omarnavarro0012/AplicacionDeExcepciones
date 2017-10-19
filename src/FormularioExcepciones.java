import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alumnos on 19/10/2017.
 */
public class FormularioExcepciones {
    private JButton button1;
    private JPanel panel1;
    private JTextField numero2;
    private JTextField numero1;

    public FormularioExcepciones() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("Hola !!"+ nombre.getText());
                JOptionPane.showMessageDialog( null,"Dividir  " +numero1.getText()+ "entre " + numero2.getText());
                JOptionPane.showMessageDialog(null, "Resultado: "+numero1/numero2);

            }
        });
    }
    public static void main(String[] args)
    {
        FormularioExcepciones formulario = new FormularioExcepciones();
        JFrame ventana = new JFrame();
        ventana.setContentPane(formulario.panel1);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
    }

}
