ALTER TABLE problems_company
    ADD FOREIGN KEY (problemID) REFERENCES problems (problemID),
    ADD FOREIGN KEY (companyID) REFERENCES company(companyID);