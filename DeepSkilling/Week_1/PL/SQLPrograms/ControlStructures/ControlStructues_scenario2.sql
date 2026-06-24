SET SERVEROUTPUT ON;
BEGIN
   FOR cust IN ( SELECT CustomerID,Name,Balance FROM Customers )
   LOOP
      IF cust.Balance > 10000 THEN
         UPDATE Customers
         SET IsVIP = 'TRUE'
         WHERE CustomerID = cust.CustomerID;
         DBMS_OUTPUT.PUT_LINE('VIP Customer Updated -> ' || cust.Name );
      END IF;
   END LOOP;
   COMMIT;
END;
/
SELECT * FROM Customers;