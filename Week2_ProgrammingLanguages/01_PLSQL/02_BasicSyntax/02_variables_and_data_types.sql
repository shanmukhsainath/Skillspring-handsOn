SET SERVEROUTPUT ON;
DECLARE
    student_id NUMBER := 101;
    student_name VARCHAR2(30) := 'Aarav';
    course_fee NUMBER(8,2) := 15000.50;
    is_active BOOLEAN := TRUE;
BEGIN
    DBMS_OUTPUT.PUT_LINE('Student Id: ' || student_id);
    DBMS_OUTPUT.PUT_LINE('Student Name: ' || student_name);
    DBMS_OUTPUT.PUT_LINE('Course Fee: ' || course_fee);
    IF is_active THEN
        DBMS_OUTPUT.PUT_LINE('Status: Active');
    END IF;
END;
/
