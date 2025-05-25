package View;

import View.Mahasiswa.ViewData;
import View.Dosen.ViewDataDosen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame{

    JLabel judul = new JLabel("Selamat Datang, silahkan pilih : ");
    JButton buttonMahasiswa = new JButton("Mahasiswa");
    JButton buttonDosen = new JButton("Dosen");
    JButton buttonKeluar = new JButton("Keluar");


    public MainView() {
        setTitle("Daftar Mahasiswa dan Dosen");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(552, 540);

        add(judul);
        add(buttonMahasiswa);
        add(buttonDosen);
        add(buttonKeluar);

        judul.setBounds(185,30,200,20);
        buttonMahasiswa.setBounds(40,80,200,50);
        buttonDosen.setBounds(300,80,200,50);
        buttonKeluar.setBounds(170,150,200,50);

        buttonMahasiswa.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewData();
            }
        });


        buttonDosen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataDosen();
            }
        });
//        judul.setBounds(185,30,200,20);
    }
}
