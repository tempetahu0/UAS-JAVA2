import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//import method.*;



public class Menu extends JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    int kode = 0;   
    boolean m;
    ArrayList<String> arrInvrcp = new ArrayList<String>(); //arrInvrcp
    ArrayList<String> arrQtyrcp = new ArrayList<String>(); //arrQtyrcp
    ArrayList<String> arrQtyinv = new ArrayList<String>(); //arrQtyinv
    ArrayList<String> arrGdgmin = new ArrayList<String>(); 
    ArrayList<String> arrInvname = new ArrayList<String>(); //arrInvname
   
    
    public Menu() {
        initComponents();
        connect();
        jButton4.setVisible(false);
    }
    
    public void connect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/restoran", "root", "");
            st = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error Connnection");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txt_harga_makan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_jumlah_makan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cmb_makanan = new javax.swing.JComboBox();
        cmb_nomor = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_parameter = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("NOMOR MEJA");

        txt_harga_makan.setEditable(false);

        jLabel1.setText("Menu");

        jLabel7.setText("Nama Pesanan");

        jLabel6.setText("Harga");

        jLabel5.setText("Jumlah");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        label1.setText("DAFTAR MENU RESTORAN BUBUR MAKNYUZ");

        jButton2.setText("Batal");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmb_makanan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "bubur_ayam", "bubur_ayam_lada_hitam", "bubur_ikan", "aqua", "teh_botol", "soft_drink" }));

        cmb_nomor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));

        jButton3.setText("Help");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("View");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Parameter");

        jButton6.setText("Log out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                        .addGap(379, 379, 379)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_nomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_parameter, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmb_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_harga_makan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_jumlah_makan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmb_nomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_harga_makan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_jumlah_makan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_parameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        String makanan = cmb_makanan.getSelectedItem().toString();
        String jumlah_makan = txt_jumlah_makan.getText();
        int jumlah_makanan = Integer.parseInt(jumlah_makan);
        int harga_makanan, harga_minuman, total_makanan,total_minuman; 
        String text_makan,text_minum;
        String nomor = cmb_nomor.getSelectedItem().toString();
        String status = "Masak";
        m = true;
        jButton4.setVisible(true);
        
        try
        {
            rs = st.executeQuery("select nama_bahan,jumlah_bahan from "+makanan+"");
            while(rs.next())
            {
                arrInvrcp.add(rs.getString("nama_bahan"));
                arrQtyrcp.add(rs.getString("jumlah_bahan"));
            }
        }        
        catch(SQLException e)
        {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
        try
        {
            rs = st.executeQuery("select nama_bahan,jumlah_bahan,minimal from gudang");
            while(rs.next())
            {
                arrInvname.add(rs.getString("nama_bahan"));
                arrQtyinv.add(rs.getString("jumlah_bahan"));
                arrGdgmin.add(rs.getString("minimal"));
            }
        }       
        catch(SQLException e)
        {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
        
        for(int i = 0;i<arrInvrcp.size();i++)
             {
                 int qtyrcp = Integer.parseInt(arrQtyrcp.get(i).toString());
                 qtyrcp= qtyrcp*jumlah_makanan;
                 String invrcp = arrInvrcp.get(i).toString();
                 for(int j = 0; j<arrInvname.size();j++)
                 {
                     int qtyinv = Integer.parseInt(arrQtyinv.get(j).toString());
                     String invname = arrInvname.get(j).toString();
                     int gudangmin = Integer.parseInt(arrGdgmin.get(j).toString());
                     if(invrcp.equalsIgnoreCase(invname))
                     {
                        if(qtyinv <= gudangmin)
                        {
                            JOptionPane.showMessageDialog(this, "Stok sudah mau habis. Lakukan restok segera");
                        }
                        if(qtyrcp<=qtyinv)
                        {
                            
                             try{
                                       String sql = "update gudang set jumlah_bahan = '"+(qtyinv-qtyrcp)+"' where nama_bahan = '"+arrInvname.get(j).toString()+"'";
                                       st.executeUpdate(sql);
                                       
                            }
                            catch(SQLException e) {
                               Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
                            }
          
                         } 
                         else
                         {
                             m = false;
                             
                         }
                     
                       
                 }
             }
           }
        
        if(m == true)
        {
        try{                        
        String sql = "SELECT harga FROM menu WHERE nama_item ='"+makanan+"'";
            rs = st.executeQuery(sql);
            
            if(rs.next()){
                 text_makan = rs.getString(1);
                 harga_makanan = Integer.parseInt(text_makan);
                 total_makanan = jumlah_makanan*harga_makanan;
                 String price_makanan = String.valueOf(total_makanan);
                 txt_harga_makan.setText(price_makanan);
                 
                 kode++;
            }
            
            String parameter = txt_parameter.getText();
            String total_harga_makan = txt_harga_makan.getText();
            int total_makan = Integer.parseInt(total_harga_makan);
                      
           String sql2 = "insert into transaksi_detail (kode_transaksi,no_meja,nama_item,jumlah_item,subtotal,status,parameter) values('" +kode+ "','" +nomor+ "','" +makanan+ "','" +jumlah_makanan+ "','" +total_makan+ "','" +status+ "','" +parameter+ "')";
           st.executeUpdate(sql2);                   
           
           String sql3 = "insert into antar (no_meja,nama_item,jumlah_item) values('" +nomor+ "','" +makanan+ "','" +jumlah_makanan+ "')";
           st.executeUpdate(sql3);
           
        }catch(SQLException e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
       fillTable();
        }
        else
             {
                 JOptionPane.showMessageDialog(this, "Out of Stock");
             }
    }//GEN-LAST:event_jButton1ActionPerformed


    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
      Desktop desktop = null;
      if (Desktop.isDesktopSupported()) {
        desktop = Desktop.getDesktop();
      }

       desktop.open(new File("C:/Doc1.docx"));
    } catch (IOException ioe) {
      JOptionPane.showMessageDialog(this, "File not found");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        String makanan = cmb_makanan.getSelectedItem().toString();
        String jumlah_makan = txt_jumlah_makan.getText();
        int jumlah_makanan = Integer.parseInt(jumlah_makan);
        int harga_makanan, harga_minuman, total_makanan,total_minuman; 
        String text_makan,text_minum;
        String nomor = cmb_nomor.getSelectedItem().toString();
        String status = "Masak";
        
        try{
            
        String sql = "SELECT harga FROM menu WHERE nama_item ='"+makanan+"'";
            rs = st.executeQuery(sql);
            
            if(rs.next()){
                 text_makan = rs.getString(1);
                 harga_makanan = Integer.parseInt(text_makan);
                 total_makanan = jumlah_makanan*harga_makanan;
                 String price_makanan = String.valueOf(total_makanan);
                 txt_harga_makan.setText(price_makanan);
            }
            
            String parameter = txt_parameter.getText();
            String total_harga_makan = txt_harga_makan.getText();
            int total_makan = Integer.parseInt(total_harga_makan);
                      
           String sql2 = "insert into transaksi_detail (kode_transaksi,no_meja,nama_item,jumlah_item,subtotal,status,parameter) values('" +kode+ "','" +nomor+ "','" +makanan+ "','" +jumlah_makanan+ "','" +total_makan+ "','" +status+ "','" +parameter+ "')";
           st.executeUpdate(sql2);
            
           String sql3 = "insert into antar (no_meja,nama_item,jumlah_item) values('" +nomor+ "','" +makanan+ "','" +jumlah_makanan+ "')";
           st.executeUpdate(sql3);
           
        }catch(SQLException e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
       fillTable();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton4.setVisible(false);
        int row = jTable1.getSelectedRow();
        try{
                String sql = "delete from transaksi_detail where kode_transaksi = '"+jTable1.getModel().getValueAt(row, 0)+"'";
                st.executeUpdate(sql);
                fillTable();
                JOptionPane.showMessageDialog(this, "Success");
            
        }catch(SQLException e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        fillTable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Login loginframe = new Login();
        loginframe.show();
        this.dispose();

    }//GEN-LAST:event_jButton6ActionPerformed
    
    public void fillTable() {
        Vector <String> kolom = new Vector <String>();
        Vector <Vector> baris = new Vector <Vector>();
        Vector isi;
        DefaultTableModel tm = new DefaultTableModel(baris, kolom);
        
        kolom.add("Kode Transaksi");
        kolom.add("Nomor meja");
        kolom.add("Nama item");
        kolom.add("Jumlah item");
        kolom.add("Subtotal");

        
        try{
            rs = st.executeQuery("select * from transaksi_detail");
            
            while(rs.next()){
                isi = new Vector();
                isi.add(rs.getString("kode_transaksi"));
                isi.add(rs.getString("no_meja"));
                isi.add(rs.getString("nama_item"));
                isi.add(rs.getString("jumlah_item"));
                isi.add(rs.getString("subtotal"));
                baris.add(isi);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error Retieving Data");
        }
        jTable1.setModel(tm);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb_makanan;
    private javax.swing.JComboBox cmb_nomor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private javax.swing.JTextField txt_harga_makan;
    private javax.swing.JTextField txt_jumlah_makan;
    private javax.swing.JTextField txt_parameter;
    // End of variables declaration//GEN-END:variables
}
