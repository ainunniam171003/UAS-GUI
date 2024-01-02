
package CRUD;
import java.sql.*;
import javax.swing.JOptionPane;
public class Update {
    public void update (String pembeli,String obat,int harga,String idJual) {
    Koneksi koneksi = new Koneksi();
    koneksi.koneksi();
        try {
            Statement statement = koneksi.con.createStatement();
            String update = "UPDATE penjualan SET pembeli = '" + pembeli +
                    "',obat = '" + obat +
                    "',harga ='" + harga + 
                    "'WHERE kodepenjualan = '" + idJual + "'";
            statement.executeUpdate(update);
            JOptionPane.showMessageDialog(null, "Data Telah Diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    
    }
}
