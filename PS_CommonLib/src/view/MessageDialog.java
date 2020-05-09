package view;

import java.awt.Component;
import java.awt.Font;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author nikol
 */
public class MessageDialog {

    /**
     * Method for showing a success message dialog.
     *
     * @param parentComponent a parent component of this dialog.
     * @param message is message for this dialog.
     * @param title is title for this dialog.
     */
    public static void showSuccessMessage(Component parentComponent, Object message, String title) {
        UIManager.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UIManager.put("Panel.background", new ColorUIResource(255, 255, 255));
        URL imageUrl = ClassLoader.getSystemResource("img/ok.gif");
        ImageIcon icon = new ImageIcon(imageUrl);
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE, icon);
    }

    /**
     * Method for showing a error message dialog.
     *
     * @param parentComponent a parent component of this dialog.
     * @param message is message for this dialog.
     * @param title is title for this dialog.
     */
    public static void showErrorMessage(Component parentComponent, Object message, String title) {
        UIManager.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UIManager.put("Panel.background", new ColorUIResource(255, 255, 255));
        URL imageUrl = ClassLoader.getSystemResource("img/error.gif");
        ImageIcon icon = new ImageIcon(imageUrl);
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE, icon);
    }

    /**
     * Method for showing a yes or no question message dialog.
     *
     * @param parentComponent a parent component of this dialog.
     * @param message is message for this dialog.
     * @param title is title for this dialog.
     * @param locale is language region of user.
     *
     * @return answer which user clicked on.
     */
    public static boolean showYesNoOption(Component parentComponent, Object message, String title, Locale locale) {
        UIManager.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UIManager.put("Panel.background", new ColorUIResource(255, 255, 255));
        URL imageUrl = ClassLoader.getSystemResource("img/question.gif");
        ImageIcon icon = new ImageIcon(imageUrl);
        JLabel label = new JLabel((String) message);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        ResourceBundle resourceBundle = ResourceBundle.getBundle("props/LanguageBundle", locale);
        String[] options = new String[]{
            resourceBundle.getString("dialog_btn_yes"),
            resourceBundle.getString("dialog_btn_no")
        };

        return JOptionPane.showOptionDialog(null, label, title, 0, JOptionPane.INFORMATION_MESSAGE,
                icon, options, options[0]) == 0;
    }
}
