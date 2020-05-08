package igu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PersonDialog extends JDialog {
    private static final long serialVersionUID = 1L;

    public PersonDialog() {
        setSize(500, 500);
        setTitle("Person Dialog");
        setLocationRelativeTo(null);
        initForm();
    }

    void initForm() {
        JTextField fromField = new JTextField(" ", 30);
        JTextField toField = new JTextField(30);
        JButton goButton = new JButton("Save");

        Object[][] rowData = { { 1, 2 }, { 3, 4 } };
        String[] columnNames = { "col1", "col2" };
        JTable jTable = new JTable(rowData, columnNames);
        JScrollPane jSP = new JScrollPane();
        jSP.setViewportView(jTable);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JLabel("From:"));
        add(fromField);
        add(new JLabel("To:"));
        add(toField);
        add(goButton);
        add(jSP);

        // Manejo de eventos
        final JDialog outer = this;
        goButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(" goButton has press ");
                outer.setVisible(false);
            }
        });

    }
}