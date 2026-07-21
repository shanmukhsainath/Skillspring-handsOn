SET SERVEROUTPUT ON;
DECLARE
    CURSOR employee_cursor IS
        SELECT employee_id, first_name FROM employees WHERE ROWNUM <= 5;
    v_employee_id employees.employee_id%TYPE;
    v_first_name employees.first_name%TYPE;
BEGIN
    OPEN employee_cursor;
    LOOP
        FETCH employee_cursor INTO v_employee_id, v_first_name;
        EXIT WHEN employee_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(v_employee_id || ' - ' || v_first_name);
    END LOOP;
    CLOSE employee_cursor;
END;
/
