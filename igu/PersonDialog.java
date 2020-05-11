package igu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import data.PersonData;
import entities.Person;

public class PersonDialog extends JDialog {
    private static final long serialVersionUID = 1L;
    PersonData pData = new PersonData();
    Person d = new Person();
    JTable jTable;
    JTextField fromField;
    JTextField toField;
    JButton goButton;
    JScrollPane jSP;
    JButton removeButton;
    JButton exitButton;

    public PersonDialog() {
        setSize(500, 500);
        setTitle("Person Dialog");
        setLocationRelativeTo(null);
        initForm();
        paintTable();
    }

    private void paintTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        List<Person> lis = pData.list();
        while (modelo.getRowCount() > 0)
            modelo.removeRow(0);
        for (Person d : lis) {
            modelo.addRow(new Object[] { d.getId(), d.getName(), d.getSex() });
        }
    }

    void initForm() {
        fromField = new JTextField(" ", 30);
        toField = new JTextField(30);
        goButton = new JButton("Save");
        removeButton = new JButton("Remove");
        exitButton = new JButton("Salir");

        jTable = new JTable();
        jTable.setModel(new DefaultTableModel(new Object[][] {
                // { 1, 2 },
                // { 3, 4 }
        }, new String[] { "ID", "Name", "Sex" }));

        jSP = new JScrollPane();
        jSP.setViewportView(jTable);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JLabel("Name:"));
        add(fromField);
        add(new JLabel("Sex:"));
        add(toField);
        add(goButton);
        add(removeButton);
        add(jSP);
        add(exitButton);

        // Manejo de eventos
        final JDialog outer = this;
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outer.setVisible(false);
            }
        });
        goButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddPerson(e);
            }
        });
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DeletePerson(e);
            }
        });
    }

    private void AddPerson(ActionEvent e) {
        if (fromField.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Missing Name");
        else if (this.toField.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Missing Sex");
        else {
            Person d = new Person();
            d.setName(this.fromField.getText());
            d.setSex(this.toField.getText());
            pData.create(d);
            paintTable();
            this.fromField.setText("");
            this.toField.setText("");
        }
    }

    private void DeletePerson(ActionEvent e) {
        if (jTable.getSelectedRow() != -1) {
            int[] row = jTable.getSelectedRows();
            String ids = jTable.getValueAt(row[0], 0).toString();
            System.out.println("selected: " + ids);
            int id = Integer.parseInt(ids);
            pData.delete(id);
            paintTable();
        }
    }
}