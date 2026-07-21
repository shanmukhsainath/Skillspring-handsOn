SET SERVEROUTPUT ON;
DECLARE
    first_number NUMBER := 20;
    second_number NUMBER := 0;
    result NUMBER;
BEGIN
    result := first_number / second_number;
    DBMS_OUTPUT.PUT_LINE('Result: ' || result);
EXCEPTION
    WHEN ZERO_DIVIDE THEN
        DBMS_OUTPUT.PUT_LINE('Cannot divide by zero');
END;
/
