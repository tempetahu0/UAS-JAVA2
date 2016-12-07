/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author febrylam
 */
public class transaksi {
    public static final String host = "jdbc:mysql://localhost:3306/";
    public static final String dbName = "restoran";
    public static final String username = "root";
    public static final String password = "";
    public static final String url = host + dbName + "?user=" + username + "&password=" + password;
    
    
    // format tanggal : tanggal 1, bulan 2, tahun 2014 = '2014-02-01'
    
    // format tanggal : tanggal 1, bulan 2, tahun 2014 = '2014-02-01'
    public static void buatLaporanPembelian(String tanggaldari, String tanggalke) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
            
            java.util.HashMap parameterMap = new java.util.HashMap();
            parameterMap.put("datefrom", tanggaldari);
            parameterMap.put("dateto", tanggalke);
            
            Report rpt = new Report(parameterMap, connection);
            rpt.setReportName("src/Report/Pembelian");
            // false = jangan save, ganti true kalo mau save ke path yang ditentukan di parameter ke 2
            rpt.callReport(false, "src/hasilreport/pembelian.pdf", url);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    // format tanggal : tanggal 1, bulan 2, tahun 2014 = '2014-02-01'
    public static void buatLaporanPenjualan(String tanggaldari, String tanggalke) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
            
            java.util.HashMap parameterMap = new java.util.HashMap();
            parameterMap.put("datefrom", tanggaldari);
            parameterMap.put("dateto", tanggalke);
            
            Report rpt = new Report(parameterMap, connection);
            rpt.setReportName("src/Report/Penjualan");
            // false = jangan save, ganti true kalo mau save ke path yang ditentukan di parameter ke 2
            rpt.callReport(false, "src/hasilreport/penjualan.pdf", url);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
