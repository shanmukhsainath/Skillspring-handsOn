SET SERVEROUTPUT ON;
CREATE TABLE student_audit (
    audit_id NUMBER GENERATED ALWAYS AS IDENTITY,
    student_id NUMBER,
    action_name VARCHAR2(20),
    action_time TIMESTAMP DEFAULT SYSTIMESTAMP
);
/
CREATE OR REPLACE TRIGGER trg_student_insert
AFTER INSERT ON students
FOR EACH ROW
BEGIN
    INSERT INTO student_audit(student_id, action_name)
    VALUES (:NEW.student_id, 'INSERT');
END;
/
