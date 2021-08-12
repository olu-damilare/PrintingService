package printServices;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.PrintStream;

public class PrintButtonListener implements ActionListener {


    private JTextArea textArea;

    public PrintButtonListener(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
            try {
                boolean isComplete = textArea.print();
                if(isComplete){
                    JOptionPane.showMessageDialog(null, "Printing completed", "Information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Printing Failed", "Print", JOptionPane.ERROR_MESSAGE);
                }
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
    }
}
