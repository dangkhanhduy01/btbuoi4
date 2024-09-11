/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidudangnhap;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginFrame extends JFrame {

    private JLabel lbUser, lbpass;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btLogin, btReset;

    public LoginFrame(String title) {
        super(title);
        createGUI();
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
   
      
    }

    private void createGUI() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 2, 10, 10));
        p.add(lbUser = new JLabel("user name"));
        p.add(txtUser = new JTextField(10));
        p.add(lbpass = new JLabel ("password"));
        p.add(txtPass = new JPasswordField(10));
        p.add(btLogin = new JButton("login"));
        p.add(btReset = new JButton("reset"));
        btLogin.setIcon(new ImageIcon(this.getClass().getResource("/login.png")));
        btReset.setIcon(new ImageIcon(this.getClass().getResource("/reset.png")));
        add(p);
        
         btLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code xử lý
                String user = txtUser.getText();
                String pass = txtPass.getText();
                if (user.equals("admin") || pass.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                } else {
                   JOptionPane.showMessageDialog(null, "loa");
                }
            }
        });

        btReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code xử lý
                txtUser.setText("");
                txtPass.setText("");
                txtUser.requestFocus();
            }
        });    
    }
    
    public static void main(String[] args) {
        LoginFrame frm = new LoginFrame("login system");
        frm.setVisible(true);
    }


}
