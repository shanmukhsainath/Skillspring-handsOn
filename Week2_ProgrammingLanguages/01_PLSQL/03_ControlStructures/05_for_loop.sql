SET SERVEROUTPUT ON;
BEGIN
    FOR counter IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Number: ' || counter);
    END LOOP;
END;
/
