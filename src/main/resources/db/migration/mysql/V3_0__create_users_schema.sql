CREATE TABLE IF NOT EXISTS users
(
    userID
    INT
    PRIMARY
    KEY
    AUTO_INCREMENT,
    firstName
    VARCHAR
(
    50
),
    lastName VARCHAR
(
    50
),
    email VARCHAR
(
    100
),
    accountID INT,
    totalNumberOfPoints INT,
    FOREIGN KEY
(
    accountID
) REFERENCES accountType
(
    accountID
)) ENGINE=InnoDB DEFAULT CHARSET=UTF8;