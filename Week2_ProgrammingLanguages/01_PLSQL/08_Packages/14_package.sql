SET SERVEROUTPUT ON;
CREATE OR REPLACE PACKAGE student_package AS
    PROCEDURE show_message(p_name IN VARCHAR2);
    FUNCTION get_fee_with_tax(p_fee IN NUMBER) RETURN NUMBER;
END student_package;
/
CREATE OR REPLACE PACKAGE BODY student_package AS
    PROCEDURE show_message(p_name IN VARCHAR2) AS
    BEGIN
        DBMS_OUTPUT.PUT_LINE('Student: ' || p_name);
    END;

    FUNCTION get_fee_with_tax(p_fee IN NUMBER) RETURN NUMBER AS
    BEGIN
        RETURN p_fee + (p_fee * 0.18);
    END;
END student_package;
/
BEGIN
    student_package.show_message('Kiran');
    DBMS_OUTPUT.PUT_LINE('Fee with tax: ' || student_package.get_fee_with_tax(10000));
END;
/
