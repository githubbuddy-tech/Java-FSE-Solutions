CREATE OR REPLACE PROCEDURE TransferFunds(p_source_acc IN NUMBER,p_dest_acc IN NUMBER,p_amount IN NUMBER)
IS
   v_balance NUMBER;
BEGIN
   SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_source_acc;
   IF v_balance >= p_amount THEN
      UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_source_acc;
      UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_dest_acc;
      COMMIT;
      DBMS_OUTPUT.PUT_LINE('Transfer Successful');
   ELSE
      DBMS_OUTPUT.PUT_LINE('Insufficient Balance');
   END IF;
EXCEPTION
   WHEN NO_DATA_FOUND THEN
      DBMS_OUTPUT.PUT_LINE('Invalid Account Number');
END;
/
BEGIN
   TransferFunds(1,2,500);
END;
/