-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2014 at 01:00 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `data_restoran_bubur`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE IF NOT EXISTS `account` (
  `Nama` varchar(20) NOT NULL,
  `Username` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `Jabatan` varchar(10) NOT NULL,
  UNIQUE KEY `Username` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`Nama`, `Username`, `Password`, `Jabatan`) VALUES
('Fahni', 'chef', 'chef', 'Chef'),
('Jono', 'gudang', 'gudang', 'Gudang'),
('Teno', 'kasir', 'kasir', 'Kasir'),
('Susi', 'manager', 'manager', 'Manager'),
('Sosu', 'Sosu', 'waiter', 'Waiter'),
('Tuti', 'waiter', 'waiter', 'Waiter');

-- --------------------------------------------------------

--
-- Table structure for table `antar`
--

CREATE TABLE IF NOT EXISTS `antar` (
  `no_meja` varchar(10) NOT NULL,
  `nama_item` varchar(100) NOT NULL,
  `jumlah_item` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `antar`
--

INSERT INTO `antar` (`no_meja`, `nama_item`, `jumlah_item`) VALUES
('1', 'bubur_ayam', '1'),
('1', 'bubur_ayam', '1'),
('1', 'bubur_ayam', '1'),
('1', 'bubur_ayam', '1'),
('1', 'bubur_ayam', '1'),
('1', 'bubur_ayam', '1'),
('1', 'bubur_ayam', '1'),
('1', 'bubur_ikan', '1');

-- --------------------------------------------------------

--
-- Table structure for table `bubur_ayam`
--

CREATE TABLE IF NOT EXISTS `bubur_ayam` (
  `nomor_makanan` int(11) NOT NULL,
  `kode_bahan` int(11) NOT NULL AUTO_INCREMENT,
  `nama_bahan` varchar(30) NOT NULL,
  `jumlah_bahan` varchar(11) NOT NULL,
  `satuan` varchar(11) NOT NULL,
  PRIMARY KEY (`kode_bahan`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `bubur_ayam`
--

INSERT INTO `bubur_ayam` (`nomor_makanan`, `kode_bahan`, `nama_bahan`, `jumlah_bahan`, `satuan`) VALUES
(1, 1, 'beras', '1', 'liter'),
(1, 2, 'ayam_kampung', '2', 'potong'),
(1, 3, 'kaldu_ayam', '100', 'gram'),
(1, 4, 'garam', '100', 'gram'),
(1, 5, 'kecap_manis', '400', 'mililiter'),
(1, 6, 'daun_bawang', '1', 'siung'),
(1, 7, 'minyak_goreng', '300', 'mililiter'),
(1, 8, 'bawang_merah', '2', 'biji'),
(1, 9, 'bawang_putih', '2', 'biji'),
(1, 10, 'kunyit', '1', 'biji'),
(1, 11, 'ketumbar', '100', 'gram'),
(1, 12, 'kemiri', '1', 'biji'),
(1, 13, 'merica', '100', 'gram'),
(1, 14, 'biji_pala', '1', 'biji');

-- --------------------------------------------------------

--
-- Table structure for table `bubur_ayam_lada_hitam`
--

CREATE TABLE IF NOT EXISTS `bubur_ayam_lada_hitam` (
  `nomor_makanan` int(11) NOT NULL,
  `kode_bahan` int(11) NOT NULL AUTO_INCREMENT,
  `nama_bahan` varchar(30) NOT NULL,
  `jumlah_bahan` varchar(11) NOT NULL,
  `satuan` varchar(11) NOT NULL,
  PRIMARY KEY (`kode_bahan`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `bubur_ayam_lada_hitam`
--

INSERT INTO `bubur_ayam_lada_hitam` (`nomor_makanan`, `kode_bahan`, `nama_bahan`, `jumlah_bahan`, `satuan`) VALUES
(2, 1, 'ayam_kampung', '2', 'potong'),
(2, 2, 'kentang', '2', 'biji'),
(2, 3, 'santan', '100', 'mililiter'),
(2, 4, 'garam', '100', 'gram'),
(2, 5, 'bawang_merah', '1', 'biji'),
(2, 6, 'bawang_putih', '1', 'biji'),
(2, 7, 'lada_hitam', '50', 'gram'),
(2, 8, 'lada_merah', '50', 'gram'),
(2, 9, 'daun_bawang', '1', 'siung'),
(2, 10, 'minyak_goreng', '200', 'mililiter');

-- --------------------------------------------------------

--
-- Table structure for table `bubur_ikan`
--

CREATE TABLE IF NOT EXISTS `bubur_ikan` (
  `nomor_makanan` int(11) NOT NULL,
  `kode_bahan` int(11) NOT NULL AUTO_INCREMENT,
  `nama_bahan` varchar(30) NOT NULL,
  `jumlah_bahan` varchar(11) NOT NULL,
  `satuan` varchar(11) NOT NULL,
  PRIMARY KEY (`kode_bahan`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `bubur_ikan`
--

INSERT INTO `bubur_ikan` (`nomor_makanan`, `kode_bahan`, `nama_bahan`, `jumlah_bahan`, `satuan`) VALUES
(3, 1, 'beras', '1', 'liter'),
(3, 2, 'kaldu_ikan', '300', 'gram'),
(3, 3, 'ikan_filet', '3', 'potong'),
(3, 4, 'jahe', '2', 'biji'),
(3, 5, 'daun_bawang', '1', 'siung'),
(3, 6, 'ketumbar', '100', 'gram'),
(3, 7, 'minyak_goreng', '100', 'milliter'),
(3, 8, 'garam', '100', 'gram'),
(3, 9, 'merica', '100', 'gram');

-- --------------------------------------------------------

--
-- Table structure for table `gudang`
--

CREATE TABLE IF NOT EXISTS `gudang` (
  `kode_bahan` int(11) NOT NULL AUTO_INCREMENT,
  `nama_bahan` varchar(30) NOT NULL,
  `jumlah_bahan` varchar(11) NOT NULL,
  `satuan` varchar(11) NOT NULL,
  `minimal` varchar(11) NOT NULL,
  PRIMARY KEY (`kode_bahan`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Dumping data for table `gudang`
--

INSERT INTO `gudang` (`kode_bahan`, `nama_bahan`, `jumlah_bahan`, `satuan`, `minimal`) VALUES
(1, 'beras', '194', 'Liter', '20'),
(2, 'ayam_kampung', '88', 'potong', '10'),
(3, 'kaldu_ayam', '94300', 'gram', '10000'),
(4, 'garam', '94200', 'gram', '10000'),
(5, 'daun_salam', '100', 'siung', '10'),
(6, 'minyak_goreng', '83400', 'mililiter', '10000'),
(7, 'biji_pala', '52', 'biji', '10'),
(8, 'kecap_manis', '77200', 'mililiter', '10000'),
(9, 'daun_bawang', '42', 'siung', '10'),
(10, 'bawang_merah', '32', 'biji', '10'),
(11, 'bawang_putih', '50', 'biji', '10'),
(12, 'kunyit', '43', 'biji', '10'),
(13, 'kemiri', '43', 'biji', '10'),
(14, 'ketumbar', '4200', 'gram', '1000'),
(15, 'merica', '94200', 'gram', '10000'),
(16, 'ikan_filet', '91', 'Potong', '10'),
(17, 'kaldu_ikan', '99100', 'gram', '10000'),
(18, 'jahe', '94', 'biji', '10'),
(19, 'santan', '9700', 'mililiter', '1000'),
(20, 'lada_hitam', '9850', 'gram', '1000'),
(21, 'lada_merah', '9850', 'gram', '1000'),
(22, 'kentang', '294', 'biji', '20'),
(23, 'aqua', '50', 'box', '10'),
(24, 'teh_botol', '50', 'box', '10'),
(25, 'sprite_kaleng', '50', 'box', '10'),
(26, 'Cakwe', '100', 'Buah', '15');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE IF NOT EXISTS `menu` (
  `nomor_makanan` int(11) NOT NULL AUTO_INCREMENT,
  `nama_item` varchar(30) NOT NULL,
  `harga` int(11) NOT NULL,
  PRIMARY KEY (`nomor_makanan`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`nomor_makanan`, `nama_item`, `harga`) VALUES
(1, 'bubur_ayam', 15000),
(2, 'bubur_ayam_lada_hitam', 20000),
(3, 'bubur_ikan', 14000),
(4, 'aqua', 3000),
(5, 'teh_botol', 3500),
(6, 'soft_drink', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE IF NOT EXISTS `pembelian` (
  `tanggal_pembelian` date NOT NULL,
  `kode_pembelian` varchar(11) NOT NULL,
  `total_harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`tanggal_pembelian`, `kode_pembelian`, `total_harga`) VALUES
('2014-06-04', '1', 200000),
('2014-06-05', '2', 50000),
('2014-06-06', '1', 200000),
('2014-06-06', '2', 50000),
('2014-06-06', '3', 50000),
('2014-06-04', '4', 50000),
('2014-06-05', '4', 50000),
('2014-06-05', '5', 50000),
('2014-06-06', '6', 50000),
('2014-06-19', '7', 30000),
('2014-06-05', '9', 10000);

-- --------------------------------------------------------

--
-- Table structure for table `pembelian_detail`
--

CREATE TABLE IF NOT EXISTS `pembelian_detail` (
  `kode_pembelian` int(100) NOT NULL AUTO_INCREMENT,
  `nama_bahan` varchar(50) NOT NULL,
  `jumlah_bahan` varchar(100) NOT NULL,
  `subtotal` int(100) NOT NULL,
  `Status` varchar(20) NOT NULL,
  PRIMARY KEY (`kode_pembelian`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `pembelian_detail`
--

INSERT INTO `pembelian_detail` (`kode_pembelian`, `nama_bahan`, `jumlah_bahan`, `subtotal`, `Status`) VALUES
(4, 'ayam_kampung', '100', 50000, 'reported'),
(5, 'beras', '200', 50000, 'reported'),
(6, 'bawang_merah', '50', 50000, 'reported'),
(7, 'bawang_putih', '50', 30000, 'reported'),
(8, 'beras', '10', 20000, 'reported'),
(9, 'beras', '200', 10000, 'reported'),
(10, 'ayam_kampung', '100', 50000, 'unreported'),
(11, 'bawang_putih', '60', 10000, 'unreported');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `tanggal_transaksi` date NOT NULL,
  `kode_transaksi` int(11) NOT NULL,
  `total_harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`tanggal_transaksi`, `kode_transaksi`, `total_harga`) VALUES
('2014-06-02', 1, 51750),
('2014-06-11', 1, 40250),
('2014-06-19', 1, 85100),
('2014-06-19', 1, 17250),
('2014-06-17', 1, 17250),
('2014-06-05', 1, 34500),
('2014-06-05', 1, 63250);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_detail`
--

CREATE TABLE IF NOT EXISTS `transaksi_detail` (
  `no_meja` varchar(10) NOT NULL,
  `kode_transaksi` int(100) NOT NULL,
  `nama_item` varchar(100) NOT NULL,
  `jumlah_item` int(100) NOT NULL,
  `subtotal` int(100) NOT NULL,
  `Status` varchar(50) NOT NULL,
  `parameter` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi_detail`
--

INSERT INTO `transaksi_detail` (`no_meja`, `kode_transaksi`, `nama_item`, `jumlah_item`, `subtotal`, `Status`, `parameter`) VALUES
('1', 1, 'bubur_ayam', 1, 15000, 'Masak', 1),
('1', 1, 'bubur_ikan', 1, 14000, 'Masak', 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
