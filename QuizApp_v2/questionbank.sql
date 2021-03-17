-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 13, 2021 at 12:44 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `questionbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `fib_answers`
--

CREATE TABLE `fib_answers` (
  `fib_answers_id` int(11) NOT NULL,
  `question_bank_id` int(11) NOT NULL,
  `answers` text CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fib_answers`
--

INSERT INTO `fib_answers` (`fib_answers_id`, `question_bank_id`, `answers`) VALUES
(1, 3, 'The'),
(2, 3, 'Asdfdf'),
(3, 3, 'sdvdvd'),
(4, 3, 'sdcvvsvsv'),
(5, 3, 'sdvcsvdsv sv ');

-- --------------------------------------------------------

--
-- Table structure for table `mcq_options`
--

CREATE TABLE `mcq_options` (
  `mcq_options_id` int(11) NOT NULL,
  `question_bank_id` int(11) NOT NULL,
  `options` varchar(255) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mcq_options`
--

INSERT INTO `mcq_options` (`mcq_options_id`, `question_bank_id`, `options`) VALUES
(1, 1, 'Water Lily '),
(2, 1, 'Rose '),
(3, 1, 'Tulip'),
(4, 1, 'Marigold'),
(5, 2, 'Hindiusm'),
(6, 2, 'Crishtian'),
(7, 2, 'Buddhist '),
(8, 2, 'Islam ');

-- --------------------------------------------------------

--
-- Table structure for table `question _bank`
--

CREATE TABLE `question _bank` (
  `question _bank_id` int(11) NOT NULL,
  `question_type_id` int(11) NOT NULL,
  `question` text CHARACTER SET utf8 NOT NULL,
  `answers` varchar(255) CHARACTER SET utf8 NOT NULL,
  `ref` varchar(255) CHARACTER SET utf8 NOT NULL,
  `users_type_id` int(11) NOT NULL,
  `status` int(11) NOT NULL COMMENT '1 = Active\r\no = Inactive '
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question _bank`
--

INSERT INTO `question _bank` (`question _bank_id`, `question_type_id`, `question`, `answers`, `ref`, `users_type_id`, `status`) VALUES
(1, 1, 'What is the national flower of Bangladesh? ', 'Water Lily ', 'para001', 1, 1),
(2, 1, 'What is the main religion practiced in Bangladesh? ', 'Islam ', 'para 002', 1, 1),
(3, 2, 'Students should observe (a) __ laws of health.  They should rise (b) ___ the bed early (c) __ the morning and go (d) __ for (e) __ walk.  ', '', 'para002', 1, 1),
(4, 1, 'On which continent is Bangladesh located?', 'Asia', 'para001', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `question_type`
--

CREATE TABLE `question_type` (
  `question_type_id` int(11) NOT NULL,
  `question_type_name` varchar(255) NOT NULL,
  `status` int(11) NOT NULL COMMENT '1=Active\r\n0=Inactive'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question_type`
--

INSERT INTO `question_type` (`question_type_id`, `question_type_name`, `status`) VALUES
(1, 'MCQ', 1),
(2, 'FIB', 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `users_id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 NOT NULL,
  `users_type_id` int(11) NOT NULL,
  `status` int(11) NOT NULL COMMENT '1=Active\r\n0=Inactive'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`users_id`, `username`, `password`, `users_type_id`, `status`) VALUES
(1, 'officer', 'e10adc3949ba59abbe56e057f20f883e', 1, 1),
(2, 'jco', 'e10adc3949ba59abbe56e057f20f883e', 2, 1),
(3, 'others', 'e10adc3949ba59abbe56e057f20f883e', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `users_type`
--

CREATE TABLE `users_type` (
  `users_type_id` int(11) NOT NULL,
  `users_type_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_type`
--

INSERT INTO `users_type` (`users_type_id`, `users_type_name`) VALUES
(1, 'Officer'),
(2, 'JCO'),
(3, 'Others');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fib_answers`
--
ALTER TABLE `fib_answers`
  ADD PRIMARY KEY (`fib_answers_id`);

--
-- Indexes for table `mcq_options`
--
ALTER TABLE `mcq_options`
  ADD PRIMARY KEY (`mcq_options_id`);

--
-- Indexes for table `question _bank`
--
ALTER TABLE `question _bank`
  ADD PRIMARY KEY (`question _bank_id`);

--
-- Indexes for table `question_type`
--
ALTER TABLE `question_type`
  ADD PRIMARY KEY (`question_type_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`users_id`);

--
-- Indexes for table `users_type`
--
ALTER TABLE `users_type`
  ADD PRIMARY KEY (`users_type_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `fib_answers`
--
ALTER TABLE `fib_answers`
  MODIFY `fib_answers_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `mcq_options`
--
ALTER TABLE `mcq_options`
  MODIFY `mcq_options_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `question _bank`
--
ALTER TABLE `question _bank`
  MODIFY `question _bank_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `question_type`
--
ALTER TABLE `question_type`
  MODIFY `question_type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `users_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users_type`
--
ALTER TABLE `users_type`
  MODIFY `users_type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
