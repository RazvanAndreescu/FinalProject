ALTER TABLE submissions
    ADD FOREIGN KEY (problemID) REFERENCES problems (problemID),
ADD FOREIGN KEY (userID) REFERENCES users(userID);