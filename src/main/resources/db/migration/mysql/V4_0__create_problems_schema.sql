CREATE TABLE IF NOT EXISTS problems
(
    problemID
    INT
    Primary
    key
    Auto_Increment,
    difficultyLevel
    INT,
    numberOfPoints
    INT
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;