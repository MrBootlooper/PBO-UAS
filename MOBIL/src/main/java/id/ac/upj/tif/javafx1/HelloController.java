package id.ac.upj.tif.javafx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField TextBrand;
    public TextField TextModel;
    public TextField TextTahun;
    public Label Label_Pesan;
    private Koneksi koneksi = new Koneksi();



    public void Tambah_Onclick(ActionEvent actionEvent) {
        String teksbrand = TextBrand.getText();
        String teksmodel = TextModel.getText();
        String tekstahun = TextTahun.getText();

        if (!teksbrand.isEmpty()) {
            String query = "INSERT INTO brand (isi) VALUES('"+teksbrand+"')";
            int hasil = koneksi.manipulasiData(query);
            if (hasil == 1) {
                System.out.println("Brand data successfully added");
            }
        }
        if (!teksmodel.isEmpty()) {
            String query = "INSERT INTO brand (isi) VALUES('"+teksmodel+"')";
            int hasil = koneksi.manipulasiData(query);
            if (hasil == 1) {
                System.out.println("Model data successfully added");
            }
        }
        if (!tekstahun.isEmpty()) {
            String query = "INSERT INTO brand (isi) VALUES('"+tekstahun+"')";
            int hasil = koneksi.manipulasiData(query);
            if (hasil == 1) {
                System.out.println("Year release data successfully added");
            }
        }
        
    }
    public void Hapus_Onclick(ActionEvent actionEvent) {
        String teksbrand = TextBrand.getText();
        String teksmodel = TextModel.getText();
        String tekstahun = TextTahun.getText();

        if (!teksbrand.isEmpty()) {
            String query = "REMOVE FROM brand (isi) VALUES('"+teksbrand+"')";
            int hasil = koneksi.manipulasiData(query);
            if (hasil == 1) {
                System.out.println("Brand data successfully removed");
            }
        }
        if (!teksmodel.isEmpty()) {
            String query = "REMOVE FROM brand (isi) VALUES('"+teksmodel+"')";
            int hasil = koneksi.manipulasiData(query);
            if (hasil == 1) {
                System.out.println("Model data successfully removed");
            }
        }
        if (!tekstahun.isEmpty()) {
            String query = "REMOVE FROM brand (isi) VALUES('"+tekstahun+"')";
            int hasil = koneksi.manipulasiData(query);
            if (hasil == 1) {
                System.out.println("Year release data successfully removed");
            }
        }
    }

    public void Update_Onclick(ActionEvent actionEvent) {
    }
}