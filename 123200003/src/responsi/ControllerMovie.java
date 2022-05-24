/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author asus
 */
public class ControllerMovie {
    ModelMovie modelMovie;
    ViewMovie viewMovie;
    public String data;
    public ControllerMovie(ModelMovie modelMovie, ViewMovie viewMovie){
        this.modelMovie = modelMovie;
        this.viewMovie = viewMovie;
        
        if (modelMovie.getBanyakData()!=0) {
            String dataMovie[][] = modelMovie.readMovie();
            viewMovie.tabel.setModel((new JTable(dataMovie, viewMovie.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
         viewMovie.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String Judul = viewMovie.getJudul();
                double Alur = Double.parseDouble(viewMovie.getAlur());
                double Penokohan = Double.parseDouble(viewMovie.getPenokohan());
                double Akting = Double.parseDouble(viewMovie.getAkting());
                double Rating = (Alur+Penokohan+Akting)/3;
                modelMovie.insertData(Judul, Alur, Penokohan, Akting, Rating);
         
                String dataMovie[][] = modelMovie.readMovie();
                viewMovie.tabel.setModel((new JTable(dataMovie, viewMovie.namaKolom)).getModel());
            }
        });
         
          viewMovie.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String Judul = viewMovie.getJudul();
                double Alur = Double.parseDouble(viewMovie.getAlur());
                double Penokohan = Double.parseDouble(viewMovie.getPenokohan());
                double Akting = Double.parseDouble(viewMovie.getAkting());
                double Rating = (Alur+Penokohan+Akting)/3;
                modelMovie.updateData(Judul, Alur, Penokohan, Akting, Rating);

                String dataMovie[][] = modelMovie.readMovie();
                viewMovie.tabel.setModel((new JTable(dataMovie, viewMovie.namaKolom)).getModel());
            }
        });
         
          viewMovie.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                viewMovie.tfJudul.setText("");
                viewMovie.tfAlur.setText("");
                viewMovie.tfPenokohan.setText("");
                viewMovie.tfAkting.setText("");
            }
        });
        
    
          viewMovie.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                
                int baris = viewMovie.tabel.getSelectedRow();
                data = viewMovie.tabel.getValueAt(baris, 0).toString();
                String dataUpdate[] = new String[4];
                dataUpdate[0] = viewMovie.tabel.getValueAt(baris, 0).toString();
                dataUpdate[1] = viewMovie.tabel.getValueAt(baris, 1).toString();
                
                
                System.out.println(data);
                 
                
                
            }
           });
                  
          viewMovie.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               int input = JOptionPane.showConfirmDialog(null,
                "Apa anda ingin menghapus Judul " + data + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

            if (input == 0) {
                modelMovie.deleteContact(data);
                String dataMovie[][] = modelMovie.readMovie();
                viewMovie.tabel.setModel((new JTable(dataMovie, viewMovie.namaKolom)).getModel());
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
            }
                }
        });

    }
    
}