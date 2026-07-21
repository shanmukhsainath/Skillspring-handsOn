SET SERVEROUTPUT ON;
DECLARE
    grade CHAR(1) := 'B';
    message VARCHAR2(30);
BEGIN
    message := CASE grade
        WHEN 'A' THEN 'Excellent'
        WHEN 'B' THEN 'Good'
        WHEN 'C' THEN 'Average'
        ELSE 'Needs Improvement'
    END;
    DBMS_OUTPUT.PUT_LINE(message);
END;
/
