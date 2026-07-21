SET SERVEROUTPUT ON;
DECLARE
    marks NUMBER := 78;
BEGIN
    IF marks >= 50 THEN
        DBMS_OUTPUT.PUT_LINE('Result: Pass');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Result: Fail');
    END IF;
END;
/
