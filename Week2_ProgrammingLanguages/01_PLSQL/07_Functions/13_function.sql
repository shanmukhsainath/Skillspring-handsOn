SET SERVEROUTPUT ON;
CREATE OR REPLACE FUNCTION calculate_square(p_number IN NUMBER)
RETURN NUMBER AS
BEGIN
    RETURN p_number * p_number;
END;
/
BEGIN
    DBMS_OUTPUT.PUT_LINE('Square: ' || calculate_square(6));
END;
/
