SET SERVEROUTPUT ON;
DECLARE
    balance NUMBER := 3000;
    withdraw_amount NUMBER := 4500;
    insufficient_balance EXCEPTION;
BEGIN
    IF withdraw_amount > balance THEN
        RAISE insufficient_balance;
    END IF;
    balance := balance - withdraw_amount;
    DBMS_OUTPUT.PUT_LINE('Remaining Balance: ' || balance);
EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Withdrawal failed: insufficient balance');
END;
/
