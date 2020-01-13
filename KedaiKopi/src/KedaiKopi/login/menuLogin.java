package KedaiKopi.login;

import KedaiKopi.tampilan;
import javax.swing.*;
import java.awt.event.*;


public class menuLogin extends JFrame{
    
    private String user = "admin";
    private String pass = "123";
    public menuLogin() {
        super("Login");
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Username");
        JLabel label2 = new JLabel("Password");
        final JTextField username = new JTextField();
        username.setEnabled(true);
        final JPasswordField password = new JPasswordField();
        password.setEnabled(true);
        JButton btn = new JButton("Login");
        label1.setBounds(75,40,150,30);
        label2.setBounds(75,90,150,30);
        username.setBounds(165,40,150,30);
        password.setBounds(165,90,150,30);
        btn.setBounds(165,140,150,30);
        panel.setLayout(null);
        panel.add(label1);
        panel.add(label2);
        panel.add(username);
        panel.add(password);
        panel.add(btn);
        add(panel);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                try{
                    if (username.getText().equals(user) && password.getText().equals(pass)){
                        tampilan View = new tampilan();
                        } else {
                        JOptionPane.showMessageDialog (null,"Username dan Password Salah!");
                    }
                } catch (Exception ex) {
                }
            }
        });
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
}
