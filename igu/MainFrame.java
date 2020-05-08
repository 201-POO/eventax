package igu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JMenuItem m11;

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setTitle("Main Frame");
        setLocationRelativeTo(null);
        initMenu();
    }

    void initMenu() {
        // menu
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");

        m11 = new JMenuItem("Contactos");
        m11.addActionListener(this);
        m1.add(m11);

        mb.add(m1);
        // setLayout(null); // con menu
        add(BorderLayout.NORTH, mb);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == m11) {
            System.out.println(" Menu 1.1 has press ");
            PersonDialog personDialog = new PersonDialog();
            personDialog.setVisible(true);
        }
    }
}