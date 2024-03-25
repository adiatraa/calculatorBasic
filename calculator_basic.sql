-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 25, 2024 at 07:43 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `calculator_basic`
--

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `history_id` int(11) NOT NULL,
  `expression` varchar(255) NOT NULL,
  `result` varchar(255) NOT NULL,
  `timestamp` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`history_id`, `expression`, `result`, `timestamp`) VALUES
(1, '8.0 + 8.0', '16', '2024-03-24 12:07:05'),
(2, '8.0 + 8.0', '16', '2024-03-24 12:49:42'),
(3, '8.0 + 9.0', '17', '2024-03-24 13:39:09'),
(4, '8.0 + 8.0', '16', '2024-03-24 13:47:26'),
(5, '168.0 + 2.0', '170', '2024-03-24 13:47:34'),
(6, '88.0 + 2.0', '90', '2024-03-24 13:52:41'),
(7, '10.0 + 10.0', '20', '2024-03-24 14:26:04'),
(8, '5.0 + 5.0', '10', '2024-03-24 14:31:36'),
(9, '8.0 + 9.0', '17', '2024-03-24 15:19:56'),
(10, '8.0 + 9.0', '17', '2024-03-24 15:28:08'),
(11, '170.0 + 8.0', '178', '2024-03-24 15:28:15'),
(12, '8.0 + 9.0', '17', '2024-03-24 15:36:30'),
(13, '8.0 + 9.0', '17', '2024-03-24 15:38:15'),
(14, '88.0 - 5.0', '83', '2024-03-24 15:38:40'),
(15, '5.0 * 6.0', '30', '2024-03-24 15:38:52'),
(16, '5.0 / 5.0', '1', '2024-03-24 15:38:58'),
(17, '100.0 / 10.0', '10', '2024-03-24 15:39:09'),
(18, '10.0 % 10.0', '0', '2024-03-24 15:39:20'),
(19, '8.0 + 9.0', '17', '2024-03-25 08:19:12'),
(20, '8.0 + 8.0', '16', '2024-03-25 09:22:15'),
(21, '5.0 * 6.0', '30', '2024-03-25 09:22:33'),
(22, '8.0 + 9.0', '17', '2024-03-25 13:26:28'),
(23, '8.0 + 9.0', '17', '2024-03-25 13:37:30'),
(24, '8.0 * 9.0', '72', '2024-03-25 13:37:35'),
(25, '8.0 - 2.0', '6', '2024-03-25 13:37:41'),
(26, '5.0 / 5.0', '1', '2024-03-25 13:37:45'),
(27, '18.0 % 5.0', '0.9', '2024-03-25 13:37:51');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`history_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `history_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
