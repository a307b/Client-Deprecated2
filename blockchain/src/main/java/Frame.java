import javax.swing.*;
import java.awt.*;


class Frame extends JFrame {

    private JButton btnTutup  = new JButton("Tutup");
    //private JButton btnTambah = new JButton("Tambah");

    private JTextField fieldUsername = new JTextField();
    private JTextField txtB = new JTextField();
    private JTextField txtC = new JTextField();

    private JLabel labelLogin = new JLabel("Login");
    private JLabel labelUsername = new JLabel("USERNAME");

    private JLabel imgLabel = new JLabel(new ImageIcon("username.png"));



    public Frame(){
        setTitle("Login");
        setSize(400,440);
        setLocation(new Point(300,200));
        setLayout(null);
        setResizable(false);

        initComponent();
    }

    private void initComponent(){

        fieldUsername.setBounds(41,157,275,25);

        labelLogin.setBounds(153,36,94,43);
        labelUsername.setBounds(36,129,65,16);

        imgLabel.setBounds(337,145,30,30);

        add(btnTutup);

        add(labelLogin);
        add(labelUsername);

        add(fieldUsername);
        add(txtB);
        add(txtC);

        add(imgLabel);
    }
}