CREATE TABLE IF NOT EXISTS  problems_company
(
    problemID
    INT,
    companyID
    INT,
    FOREIGN KEY (problemID) REFERENCES problems(problemID),
    FOREIGN KEY (companyID) REFERENCES company(companyID)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;