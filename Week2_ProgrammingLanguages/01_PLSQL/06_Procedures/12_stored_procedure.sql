SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE greet_student(p_name IN VARCHAR2) AS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Welcome, ' || p_name);
END;
/
BEGIN
    greet_student('Riya');
END;
/
