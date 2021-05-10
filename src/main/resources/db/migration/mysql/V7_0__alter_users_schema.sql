ALTER TABLE users
    ADD FOREIGN KEY (accountID) REFERENCES accountType (accountID);