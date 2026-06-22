SET SERVEROUTPUT ON;
BEGIN
   FOR loan_rec IN (SELECT l.LoanID,c.CustomerID,c.Name,l.EndDate FROM Loans l JOIN Customers c ON l.CustomerID = c.CustomerID
      WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30)
   LOOP
      DBMS_OUTPUT.PUT_LINE('Reminder:' || loan_rec.Name || ',Loan ID ' || loan_rec.LoanID || ' is due on ' || TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY'));
   END LOOP;
END;
/