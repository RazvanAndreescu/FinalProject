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
    DATE,
    FOREIGN KEY (userID) REFERENCES users(userID),
    FOREIGN KEY (problemID) REFERENCES problems(problemID)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;