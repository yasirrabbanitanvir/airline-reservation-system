-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2021 at 10:35 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airlinedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `bookingtbl`
--

CREATE TABLE `bookingtbl` (
  `TicketId` int(11) NOT NULL,
  `PName` varchar(20) NOT NULL,
  `FlCode` varchar(20) NOT NULL,
  `PGen` varchar(10) NOT NULL,
  `PPass` varchar(20) NOT NULL,
  `Amount` int(11) NOT NULL,
  `Nationality` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookingtbl`
--

INSERT INTO `bookingtbl` (`TicketId`, `PName`, `FlCode`, `PGen`, `PPass`, `Amount`, `Nationality`) VALUES
(1, 'Manju', 'DB8524X', 'Male', 'IND02473', 4000, 'India'),
(3, 'Abdul', 'DX25847A', 'Male', 'Nam65479', 5800, 'Namibia'),
(4, 'Reddy', 'DB8524X', 'Male', 'IND9635', 15000, 'India');

-- --------------------------------------------------------

--
-- Table structure for table `cancellationtbl`
--

CREATE TABLE `cancellationtbl` (
  `CancId` int(11) NOT NULL,
  `TickId` int(11) NOT NULL,
  `FlCode` varchar(20) NOT NULL,
  `CancDate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cancellationtbl`
--

INSERT INTO `cancellationtbl` (`CancId`, `TickId`, `FlCode`, `CancDate`) VALUES
(1, 2, 'DX25847A', 'Thu May 27 05:01:55 IST 2021'),
(2, 2, 'DX25847A', 'Thu May 27 05:04:55 IST 2021'),
(3, 1, 'DX25847A', 'Thu May 27 05:06:41 IST 2021'),
(4, 2, 'CD368G', 'Thu May 27 05:39:45 IST 2021'),
(5, 5, 'CD368G', 'Thu May 27 05:41:19 IST 2021');

-- --------------------------------------------------------

--
-- Table structure for table `flighttbl`
--

CREATE TABLE `flighttbl` (
  `FlCode` varchar(10) NOT NULL,
  `FlSource` varchar(20) NOT NULL,
  `FlDest` varchar(20) NOT NULL,
  `FlDate` varchar(50) NOT NULL,
  `FlSeats` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flighttbl`
--

INSERT INTO `flighttbl` (`FlCode`, `FlSource`, `FlDest`, `FlDate`, `FlSeats`) VALUES
('CD368G', 'Bangalore', 'Mumbai', 'Mon Jun 14 00:00:00 IST 2021', 100),
('DB8524X', 'Mumbai', 'Goa', 'Sun May 30 00:00:00 IST 2021', 80),
('DX25847A', 'Delhy', 'TamilNadu', 'Sun May 30 00:00:00 IST 2021', 180);

-- --------------------------------------------------------

--
-- Table structure for table `passengerstbl`
--

CREATE TABLE `passengerstbl` (
  `PId` int(11) NOT NULL,
  `PName` varchar(20) NOT NULL,
  `PNat` varchar(15) NOT NULL,
  `PGen` varchar(10) NOT NULL,
  `PPass` varchar(20) NOT NULL,
  `PAdd` varchar(50) NOT NULL,
  `Pphone` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passengerstbl`
--

INSERT INTO `passengerstbl` (`PId`, `PName`, `PNat`, `PGen`, `PPass`, `PAdd`, `Pphone`) VALUES
(1, 'Danush', 'India', 'Male', 'IND0145', 'Kolar', '32547895'),
(2, 'Anusha', 'India', 'Female', 'IND78995', 'Mumbai', '357489654'),
(3, 'Manju', 'India', 'Male', 'IND02473', 'Delhy', '32584411'),
(4, 'Abdul', 'Namibia', 'Male', 'Nam65479', 'Lilongwe', '68754333'),
(5, 'Reddy', 'India', 'Female', 'IND9635', 'Hoskote', '245687451'),
(6, 'Ramos', 'Spain', 'Male', 'SP9657M', 'Madrid', '357159452'),
(7, 'Donald', 'USA', 'Male', 'US2475', 'DC', '3245657841');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bookingtbl`
--
ALTER TABLE `bookingtbl`
  ADD PRIMARY KEY (`TicketId`);

--
-- Indexes for table `cancellationtbl`
--
ALTER TABLE `cancellationtbl`
  ADD PRIMARY KEY (`CancId`);

--
-- Indexes for table `flighttbl`
--
ALTER TABLE `flighttbl`
  ADD PRIMARY KEY (`FlCode`);

--
-- Indexes for table `passengerstbl`
--
ALTER TABLE `passengerstbl`
  ADD PRIMARY KEY (`PId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
