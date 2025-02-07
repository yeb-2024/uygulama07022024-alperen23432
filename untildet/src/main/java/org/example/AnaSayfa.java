package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaSayfa implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Profili Göster");

    public AnaSayfa(){
        button.addActionListener(this);
        button.setBounds(200,200,100,50);
        frame.add(button);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("AnaSayfa");
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            ProfilSayfa profilSayfa = new ProfilSayfa();
        }

    }
}
