package org.example;

import javax.swing.*;
import java.awt.*;

public class ProfilSayfa {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    public ProfilSayfa(){
        label.setText("İsim: ŞİMŞEK MCQEEN");
        label.setFont(new Font(null,Font.PLAIN,15));

        frame.add(label);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Profil sayfa");
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);

    }
}
