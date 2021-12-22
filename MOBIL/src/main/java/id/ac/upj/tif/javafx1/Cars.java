package id.ac.upj.tif.javafx1;

public class Cars {
    private String brand;
    private String model;
    private int tahun;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    //Menambah data pada DB

    public int tambahData() {
        Koneksi koneksi = new Koneksi();
        //String Query SQL
        String query = "INSERT INTO Cars (Brand,Model,Tahun) " +
                "VALUES( '" + this.brand + "','" + this.model + "','" + this.tahun + ")";
        System.out.println("Query = " + query);

        int hasil = koneksi.manipulasiData(query);
        koneksi.tutup();
        return hasil;
    }

    //Menghapus data pada DB

    public int HapusData() {
        Koneksi koneksi = new Koneksi();
        //String Query SQL
        String query = "DELETE FROM Cars (Brand,Model,Tahun) " +
                "VALUES( '" + this.brand + "','" + this.model + "','" + this.tahun + ")";
        System.out.println("Query = " + query);

        int hasil = koneksi.manipulasiData(query);
        koneksi.tutup();
        return hasil;
    }
}