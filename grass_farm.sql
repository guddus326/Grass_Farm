-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- 생성 시간: 20-11-25 04:00
-- 서버 버전: 8.0.20
-- PHP 버전: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 데이터베이스: `grass_farm`
--

-- --------------------------------------------------------

--
-- 테이블 구조 `bbs`
--

CREATE TABLE `bbs` (
  `bbsID` int NOT NULL,
  `bbsTitle` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `userID` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bbsDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `bbsContent` text COLLATE utf8mb4_unicode_ci,
  `bbsSource` text COLLATE utf8mb4_unicode_ci,
  `bbsLanguage` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- 테이블의 덤프 데이터 `bbs`
--

INSERT INTO `bbs` (`bbsID`, `bbsTitle`, `userID`, `bbsContent`, `bbsSource`, `bbsLanguage`) VALUES
(1, '1102', 'guddus326', '셀렉트 박스', '<div class=\"mb-3\">\r\n					<label for=\"language\">LANGUAGE</label>\r\n					<select class=\"form-control\" name=\"bbsLanguage\">\r\n	  					<option value=\"\">LANGUAGE</option>\r\n	  					<option value=\"JAVA\">JAVA</option>\r\n	  					<option value=\"C\">C</option>\r\n	  					<option value=\"C++\">C++</option>\r\n	  					<option value=\"C#\">C#</option>\r\n	  					<option value=\"PYTHON\">PYTHON</option>\r\n	  					<option value=\"PHP\">PHP</option>\r\n	  					<option value=\"JSP\">JSP</option>\r\n	  					<option value=\"HTML\">HTML</option>\r\n	  					<option value=\"CSS\">CSS</option>\r\n	  					<option value=\"JavaScript\">JavaScript</option>\r\n					</select>\r\n				</div><BR>', 'HTML'),
(2, 'asdf', 'guddus326', 'adsf', '}else{\r\n				BbsDAO BbsDAO = new BbsDAO();\r\n				int result = BbsDAO.write(bbs);\r\n				if (result == -1) {\r\n					PrintWriter script = response.getWriter();\r\n					script.println(\"<script>\");\r\n					script.println(\"alert(\'글쓰기에 실패했습니다\')\");\r\n					script.println(\"history.back()\");\r\n					script.println(\"</script>\");\r\n				} else {\r\n					PrintWriter script = response.getWriter();\r\n					script.println(\"<script>\");\r\n					script.println(\"location.href=\'Main.jsp\'\");\r\n					script.println(\"</script>\");\r\n				}\r\n			}\r\n			', NULL),
(3, '1102', 'guddus326', 'aadfadf', '	public int getBbsID() {\r\n		return bbsID;\r\n	}\r\n	public void setBbsID(int bbsID) {\r\n		this.bbsID = bbsID;\r\n	}\r\n	public String getBbsTitle() {\r\n		return bbsTitle;\r\n	}\r\n	public void setBbsTitle(String bbsTitle) {\r\n		this.bbsTitle = bbsTitle;\r\n	}\r\n	public String getUserID() {\r\n		return userID;\r\n	}\r\n	public void setUserID(String userID) {\r\n		this.userID = userID;\r\n	}\r\n	public String getBbsDate() {\r\n		return bbsDate;\r\n	}\r\n	p', 'JAVA'),
(4, '1109', 'guddus326', '	이코드는 어레이리스트 뭐시기뭐시기 하는 코드\r\nㄴ미얼;미ㅓㄹ;ㅁ넝ㄹ;ㅁㄴㅇㄹ\'\r\nㅁㄴㅇㄻㄴㅇㄻㄴㅇㄹ\r\nㅁㅇㄴㄹㄴㅁㅇ\r\n	', '	UserDAO userDAO=new UserDAO();\r\nArrayList<User> user=userDAO.user(userID);\r\nfor(int i=0; i<1; i++){\r\n	', 'JAVA'),
(5, 'sd', 'rr', 'adfadadf', 'sdd', 'C#'),
(6, 'ddrwer', 'rr', 'adfadsf', 'adfa', 'C#'),
(7, 'gg', 'eh419', 'adsf', 'gg', 'JSP'),
(8, 'gg', 'eh419', 'adsf', 'gg', 'JSP');

-- --------------------------------------------------------

--
-- 테이블 구조 `follow`
--

CREATE TABLE `follow` (
  `me` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `follow` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- 테이블의 덤프 데이터 `follow`
--

INSERT INTO `follow` (`me`, `follow`) VALUES
('eh419', 'eh419'),
('eh419', 'guddus326'),
('guddus326', 'eh419'),
('guddus326', 'eh419'),
('guddus326', 'eh419'),
('eh419', 'guddus326');

-- --------------------------------------------------------

--
-- 테이블 구조 `user`
--

CREATE TABLE `user` (
  `userID` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `userPass` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `userName` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `userEmail` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `userDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- 테이블의 덤프 데이터 `user`
--

INSERT INTO `user` (`userID`, `userPass`, `userName`, `userEmail`) VALUES
('eh419', 'dmsgP419', '박은혜', 'eh419@naver.com'),
('guddus326', 'gkaguddus326@', '함형연', 's2019s39@e-mirim.hs.kr'),
('hhe000', '1111', '함형연', 'hhe000@naver.com'),
('hhy326', '1111', '함형연', 'guddus326@naver.com');

--
-- 덤프된 테이블의 인덱스
--

--
-- 테이블의 인덱스 `bbs`
--
ALTER TABLE `bbs`
  ADD PRIMARY KEY (`bbsID`);

--
-- 테이블의 인덱스 `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userID`);

--
-- 덤프된 테이블의 AUTO_INCREMENT
--

--
-- 테이블의 AUTO_INCREMENT `bbs`
--
ALTER TABLE `bbs`
  MODIFY `bbsID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
