package printServices;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.*;
import java.awt.event.ActionListener;

public class ContentFrame extends JFrame {
    private JTextArea textArea;
    private JButton uploadButton;
    private JButton printButton;
    private ActionListener uploadButtonListener;
    private ActionListener printButtonListener;

    public ContentFrame(){
        super("Print Service Demo");
        Box box = Box.createHorizontalBox();
        textArea = new JTextArea(50, 100);
        box.add(new JScrollPane(textArea));
        uploadButton = new JButton("Upload File");
        uploadButtonListener = new UploadButtonListener(textArea);
        uploadButton.addActionListener(uploadButtonListener);
        box.add(uploadButton);

        printButton = new JButton("Print");
        printButtonListener = new PrintButtonListener(textArea);
        printButton.addActionListener(printButtonListener);
        box.add(printButton);
        add(box);
    }

    public static void main(String[] args) {
        ContentFrame frame = new ContentFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);

//        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
//        System.out.println("Number of print services: " + printServices.length);
//
//        for (PrintService printer : printServices)
//            System.out.println("Printer: " + printer.getName());
    }


}
