-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 30, 2018 at 04:28 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `abcs`
--

-- --------------------------------------------------------

--
-- Table structure for table `airplane`
--

CREATE TABLE `airplane` (
  `airplane_id` int(10) NOT NULL,
  `first_capacity` int(10) NOT NULL,
  `business_capacity` int(10) NOT NULL,
  `economy_capacity` int(10) NOT NULL,
  `power` bit(1) NOT NULL,
  `wifi` bit(1) NOT NULL,
  `baggage` int(5) NOT NULL,
  `meal` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `flight_number` int(10) NOT NULL,
  `arrival_time` time NOT NULL,
  `arrival_date` date NOT NULL,
  `arrival_airport` varchar(45) NOT NULL,
  `departure_time` time NOT NULL,
  `departure_date` date NOT NULL,
  `departure_airport` varchar(45) NOT NULL,
  `airplane_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`flight_number`, `arrival_time`, `arrival_date`, `arrival_airport`, `departure_time`, `departure_date`, `departure_airport`, `airplane_id`) VALUES
(1, '23:28:18', '2018-11-05', 'LHR', '12:17:00', '2018-11-05', 'DUB', 1);

-- --------------------------------------------------------

--
-- Table structure for table `flight_bookings`
--

CREATE TABLE `flight_bookings` (
  `booking_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `flight_number` int(10) NOT NULL,
  `class` varchar(20) NOT NULL,
  `power` bit(1) NOT NULL,
  `wifi` bit(1) NOT NULL,
  `meal` bit(1) NOT NULL,
  `baggage` int(5) NOT NULL,
  `booking_price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `flight_price`
--

CREATE TABLE `flight_price` (
  `flight_number` int(10) NOT NULL,
  `first_price` float NOT NULL,
  `business_price` float NOT NULL,
  `economy_price` float NOT NULL,
  `power_price` float DEFAULT NULL,
  `wifi_price` float DEFAULT NULL,
  `baggage_price` float DEFAULT NULL,
  `meal_price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `membership`
--

CREATE TABLE `membership` (
  `user_id` int(10) NOT NULL,
  `points` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `role_id` int(5) NOT NULL,
  `role_name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(10) NOT NULL,
  `email` varchar(120) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `email`, `password`, `role_id`) VALUES
(1, 'johndoe@gmail.com', 'test1234', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `user_id` int(10) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  `sex` bit(1) DEFAULT NULL,
  `contact_number` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`user_id`, `first_name`, `last_name`, `dob`, `sex`, `contact_number`) VALUES
(1, 'John', 'Doe', '2000-11-14', b'0', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `airplane`
--
ALTER TABLE `airplane`
  ADD PRIMARY KEY (`airplane_id`);

--
-- Indexes for table `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`flight_number`);

--
-- Indexes for table `flight_bookings`
--
ALTER TABLE `flight_bookings`
  ADD PRIMARY KEY (`booking_id`);

--
-- Indexes for table `flight_price`
--
ALTER TABLE `flight_price`
  ADD PRIMARY KEY (`flight_number`);

--
-- Indexes for table `membership`
--
ALTER TABLE `membership`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`role_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `airplane`
--
ALTER TABLE `airplane`
  MODIFY `airplane_id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `flight`
--
ALTER TABLE `flight`
  MODIFY `flight_number` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `flight_bookings`
--
ALTER TABLE `flight_bookings`
  MODIFY `booking_id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
