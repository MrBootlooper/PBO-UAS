package id.ac.upj.tif.javafx1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {
    private Connection conn;
    private Statement st;
    public Koneksi() {
        try {
            String user = "root";
            String password = "";
            String urldb = "jdbc:mysql://localhost:3306/Cars";
            conn = DriverManager.getConnection(urldb,user,password);
            System.out.println("Koneksi Berhasil");

        }  catch (SQLException e) {
            System.out.println("koneksi gagal: " + e);

        }
        catch (Exception e) {
            System.out.println("Terjadi error yang tidak diketahui");

        }
    }

    //methid insert, update dan delete data
    public int manipulasiData(String query) {
        try{
            st = conn.createStatement();
            return st.executeUpdate(query);

        }
        catch (SQLException e) {
            System.out.println("SQL Error: " + e);
            return 0;

        }
        catch (Exception e) {
            System.out.println("Unknown Error:" + e);
            return 0;
        }
    }
    public void tutup() {
        try{
            conn.close();
            st.close();
        }
        catch (SQLException e) {
            System.out.println("Koneksi yidak berhasil ditutup" + e);
        }
        catch (Exception e){
            System.out.println("terjadi error" + e);
        }

    }
}

