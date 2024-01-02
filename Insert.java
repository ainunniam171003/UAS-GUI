
package CRUD;
import java.sql.*;
import javax.swing.JOptionPane;
    public class Insert {
     Koneksi koneksi = new Koneksi ();
     
     public void insert (String idJual,String pembeli,String obat,int harga) {
         try {
         koneksi.koneksi();
         Statement statement = koneksi.con.createStatement();
          //insert data
         String sql = "INSERT INTO penjualan VALUES ('" + idJual +
                "','" + pembeli +
                "','" + obat +
                "','" + harga +"')";
                statement.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
         }
         catch (Exception ex){
             JOptionPane.showMessageDialog(null,ex);
                }
     }
    
    
}
