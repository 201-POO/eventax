package igu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PersonDialog extends JDialog {
    private static final long serialVersionUID = 1L;
    JTextField fromField;
    JTextField toField;
    JButton goButton;
    JTable jTable;
    JScrollPane jSP;

    public PersonDialog() {
        setSize(500, 500);
        setTitle("Person Dialog");
        setLocationRelativeTo(null);
        initForm();
    }

    void initForm() {
        fromField = new JTextField(" ", 30);
        toField = new JTextField(30);
        goButton = new JButton("Save");

        jTable = new JTable();
        jTable.setModel(new DefaultTableModel(
            new  Object[][] { 
                //{ 1, 2 }, 
                //{ 3, 4 } 
            },
            new String[] { "col1", "col2" }
        ));

        jSP  = new JScrollPane();
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