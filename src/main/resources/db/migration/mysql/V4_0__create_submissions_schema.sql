CREATE TABLE IF NOT EXISTS  submissions
(
    submissionsID
    INT
    Primary
    key
    Auto_Increment,
    userID
    INT,
    problemID
    INT,
    dateOfSubmissions
    DATE
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;