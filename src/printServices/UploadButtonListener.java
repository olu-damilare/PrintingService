package printServices;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class UploadButtonListener implements ActionListener {
    private JTextArea textArea;

    public UploadButtonListener(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File selectedFile = fileChooser.getSelectedFile();
        String fileName = selectedFile.getAbsolutePath();

        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            textArea.read(bufferedReader, null);
            bufferedReader.close();
            textArea.requestFocus();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
