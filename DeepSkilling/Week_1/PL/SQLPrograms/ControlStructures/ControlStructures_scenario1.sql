SET SERVEROUTPUT ON;
BEGIN
   FOR cust IN ( SELECT c.CustomerID,c.Name,c.DOB,l.LoanID,l.InterestRate,FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) AS Age FROM Customers c
      JOIN Loans l ON c.CustomerID = l.CustomerID )
   LOOP
      IF cust.Age > 60 THEN
         UPDATE Loans SET InterestRate = InterestRate - 1 WHERE LoanID = cust.LoanID;
         DBMS_OUTPUT.PUT_LINE(
            'Customer ID: ' || cust.CustomerID ||
            ' | Name: ' || cust.Name ||
            ' | Age: ' || cust.Age ||
            ' | Loan ID: ' || cust.LoanID ||
            ' | Updated Rate: ' || (cust.InterestRate - 1)
         );
      END IF;
   END LOOP;
   COMMIT;
END;
/