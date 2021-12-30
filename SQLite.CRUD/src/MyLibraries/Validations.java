package MyLibraries;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Validations {

    public static void validateRFC(javax.swing.JTextField txt, KeyEvent e) {
        char c = e.getKeyChar();

        if (txt.getText().length() >= 13) {
            JOptionPane.showMessageDialog(null,
                    "El límite de carácteres del RFC es de 13",
                    "Límite de carácteres",
                    2);
            e.consume();
        } else if (((!Character.isLetter(c)) && (!Character.isDigit(c)))
                && ((c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_DELETE)
                && (c != KeyEvent.VK_ENTER))) {
            e.consume();
        } else if (Character.isLetter(c)) {
            e.setKeyChar(Character.toUpperCase(c));
        }
    }

    public static void validateName(javax.swing.JTextField txt, KeyEvent e) {
        char c = e.getKeyChar();

        if (txt.getText().length() >= 100) {
            JOptionPane.showMessageDialog(null,
                    "El límite de carácteres del Nombre es de 100",
                    "Límite de carácteres",
                    2);
            e.consume();
        } else if (((!Character.isLetter(c)) && (c != ' ')
                || ((txt.getText().endsWith(" ")) && (c == ' ')))
                && ((c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_DELETE)
                && (c != KeyEvent.VK_ENTER))) {
            e.consume();
        }
    }

    public static void validateHoursWorked(javax.swing.JTextField txt, KeyEvent e) {
        char c = e.getKeyChar();

        if (txt.getText().length() >= 3) {
            JOptionPane.showMessageDialog(null,
                    "El límite de carácteres de las Horas Trabajadas es de 3",
                    "Límite de carácteres",
                    2);
            e.consume();
        } else if ((!Character.isDigit(c)) && ((c != KeyEvent.VK_BACK_SPACE)
                && (c != KeyEvent.VK_DELETE) && (c != KeyEvent.VK_ENTER))) {
            e.consume();
        }
    }

    public static void validateHourly(javax.swing.JTextField txt, KeyEvent e) {
        char c = e.getKeyChar();

        if (txt.getText().length() >= 5) {
            JOptionPane.showMessageDialog(null,
                    "El límite de carácteres del Pago por Hora es de 5",
                    "Límite de carácteres",
                    2);
            e.consume();
        } else if ((!Character.isDigit(c)) && ((c != KeyEvent.VK_BACK_SPACE)
                && (c != KeyEvent.VK_DELETE) && (c != KeyEvent.VK_ENTER)
                && (c != KeyEvent.VK_PERIOD)) || ((c == KeyEvent.VK_PERIOD)
                && (txt.getText().contains(".")))) {
            e.consume();
        }
    }

    public static void validateSalary(javax.swing.JTextField txt, KeyEvent e) {
        char c = e.getKeyChar();

        if (txt.getText().length() >= 7) {
            JOptionPane.showMessageDialog(null,
                    "El límite de carácteres del Sueldo es de 7",
                    "Límite de carácteres",
                    2);
            e.consume();
        } else if ((!Character.isDigit(c)) && ((c != KeyEvent.VK_BACK_SPACE)
                && (c != KeyEvent.VK_DELETE) && (c != KeyEvent.VK_ENTER)
                && (c != KeyEvent.VK_PERIOD)) || ((c == KeyEvent.VK_PERIOD)
                && (txt.getText().contains(".")))) {
            e.consume();
        }
    }
}
