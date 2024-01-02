
package CRUD;
import java.sql.*;
import javax.swing.JOptionPane;

public class Hapus {
  public void hapus (String idJual) {
  Koneksi koneksi = new Koneksi ();
  koneksi.koneksi();
      try {
        Statement statement = koneksi.con.createStatement();
        String sql = "DELETE FROM penjualan WHERE kodepenjualan = '" + idJual +"'";
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data Sudah dihapus");
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
      }
      
  }
    
}
