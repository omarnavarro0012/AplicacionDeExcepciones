import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alumnos on 19/10/2017.
 */
public class FormularioExcepciones {
    private JButton Accion;
    private JPanel panel1;
    private JTextField numero2;
    private JTextField numero1;

    public FormularioExcepciones()
    {
        Accion.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                try
                {
                    // System.out.println("Hola !!"+ nombre.getText());
                    int num1 = Integer.parseInt(numero1.getText());
                    int num2 = Integer.parseInt(numero2.getText());
                    int resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "Dividir  " + numero1.getText() + " entre " + numero2.getText()
                            + " es " + resultado);


                }
                catch (ArithmeticException e)
                {
                    JOptionPane.showMessageDialog(null,"Valor no valido");
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null,"Valor no numerico");
                }

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
