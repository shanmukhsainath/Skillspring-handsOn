SET SERVEROUTPUT ON;
DECLARE
    counter NUMBER := 1;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE('Loop value: ' || counter);
        counter := counter + 1;
        EXIT WHEN counter > 5;
    END LOOP;
END;
/
