Q.1 Write a mysql statement to find the name, birth, department name, department block from the given tables.sele+----+--------------+------------+------------+
| id | name | dept_id | birth |
+----+--------------+------------+------------+
| 1 | Maria Gloria | 2 | 1994-03-12 |
| 2 | John Smith | 1 | 1993-02-07 |
| 3 | Gal Rao | 4 | 1992-09-11 |
| 4 | Jakey Smith | 2 | 1990-08-31 |
| 5 | Rama Saho | 1 | 1994-12-09 |
| 6 | Maria Gaga | 4 | 1993-10-09 |
+----+--------------+------------+------------++i
+---------+--------------------------+------------+
| dept_id | dept_name | dept_block |
+---------+--------------------------+------------+
| 1 | Computer Science | B-Block |
| 2 | Information Technology | C-Block |
| 3 | Mechanical | A-Block |
| 4 | Electronic Communication | D-Block |
+---------+--------------------------+------------+

mysql> use college;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> describe student;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| roll  | int         | YES  |     | NULL    |       |
| name  | varchar(20) | YES  |     | NULL    |       |
| class | varchar(10) | YES  |     | NULL    |       |
| marks | float       | YES  |     | NULL    |       |
| age   | float       | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

mysql> drop table student;
Query OK, 0 rows affected (0.11 sec)

mysql> create table student(id int, name varchar(20), dept_id int, birth date); 
Query OK, 0 rows affected (0.04 sec)

mysql> INSERT INTO employees (id, name, dept_id, birth)
    -> VALUES
    ->     (1, 'Maria Gloria', 2, '1994-03-12'),
    ->     (2, 'John Smith', 1, '1993-02-07'),
    ->     (3, 'Gal Rao', 4, '1992-09-11'),
    ->     (4, 'Jakey Smith', 2, '1990-08-31'),
    ->     (5, 'Rama Saho', 1, '1994-12-09'),
    ->     (6, 'Maria Gaga', 4, '1993-10-09');
ERROR 1146 (42S02): Table 'college.employees' doesn't exist
mysql> INSERT INTO student (id, name, dept_id, birth) VALUES     (1, 'Maria Gloria', 2, '1994-03-12'),     (2, 'John Smith', 1, '1993-02-07'),     (3, 'Gal Rao', 4, '1992-09-11'),     (4, 'Jakey Smith', 2, '1990-08-31'),     (5, 'Rama Saho', 1, '1994-12-09'),     (6, 'Maria Gaga', 4, '1993-10-09');
Query OK, 6 rows affected (0.01 sec)
Records: 6  Duplicates: 0  Warnings: 0

mysql> create table dept(dept_id int, dept_name, dept_block);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ', dept_block)' at line 1
mysql> create table dept(dept_id int, dept_name varchar(20) , dept_block varchar(20));
Query OK, 0 rows affected (0.03 sec)

mysql> INSERT INTO departments (dept_id, dept_name, dept_block)
    -> VALUES
    ->     (1, 'Computer Science', 'B-Block'),
    ->     (2, 'Information Technology', 'C-Block'),
    ->     (3, 'Mechanical', 'A-Block'),
    ->     (4, 'Electronic Communication', 'D-Block');
ERROR 1146 (42S02): Table 'college.departments' doesn't exist
mysql> INSERT INTO dept (dept_id, dept_name, dept_block) VALUES     (1, 'Computer Science', 'B-Block'),     (2, 'Information Technology', 'C-Block'),     (3,
'Mechanical', 'A-Block'),     (4, 'Electronic Communication', 'D-Block');
ERROR 1406 (22001): Data too long for column 'dept_name' at row 2
mysql> alter table dept modify dept_name varchar(100);
Query OK, 0 rows affected (0.08 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> INSERT INTO dept (dept_id, dept_name, dept_block) VALUES     (1, 'Computer Science', 'B-Block'),     (2, 'Information Technology', 'C-Block'),     (3,
'Mechanical', 'A-Block'),     (4, 'Electronic Communication', 'D-Block');
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select * fromdept;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'fromdept' at line 1
mysql> select * from dept;
+---------+--------------------------+------------+
| dept_id | dept_name                | dept_block |
+---------+--------------------------+------------+
|       1 | Computer Science         | B-Block    |
|       2 | Information Technology   | C-Block    |
|       3 | Mechanical               | A-Block    |
|       4 | Electronic Communication | D-Block    |
+---------+--------------------------+------------+
4 rows in set (0.00 sec)

mysql> select * from student;
+------+--------------+---------+------------+
| id   | name         | dept_id | birth      |
+------+--------------+---------+------------+
|    1 | Maria Gloria |       2 | 1994-03-12 |
|    2 | John Smith   |       1 | 1993-02-07 |
|    3 | Gal Rao      |       4 | 1992-09-11 |
|    4 | Jakey Smith  |       2 | 1990-08-31 |
|    5 | Rama Saho    |       1 | 1994-12-09 |
|    6 | Maria Gaga   |       4 | 1993-10-09 |
+------+--------------+---------+------------+
6 rows in set (0.00 sec)

mysql> select student.name, student.birth, dept.dept_name, dept.dept_block fromstudent join dept on student.dept_id = dept.dept_id;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'join dept on student.dept_id = dept.dept_id' at line 1
mysql> select student.name, student.birth, dept.dept_name, dept.dept_block fromstudent s join dept d on s.dept_id = d.dept_id;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 's join dept d on s.dept_id = d.dept_id' at line 1
mysql> select s.name, s.birth, d.dept_name, d.dept_block from student s join dept d on s.dept_id = d.dept_id;
+--------------+------------+--------------------------+------------+
| name         | birth      | dept_name                | dept_block |
+--------------+------------+--------------------------+------------+
| Maria Gloria | 1994-03-12 | Information Technology   | C-Block    |
| John Smith   | 1993-02-07 | Computer Science         | B-Block    |
| Gal Rao      | 1992-09-11 | Electronic Communication | D-Block    |
| Jakey Smith  | 1990-08-31 | Information Technology   | C-Block    |
| Rama Saho    | 1994-12-09 | Computer Science         | B-Block    |
| Maria Gaga   | 1993-10-09 | Electronic Communication | D-Block    |
+--------------+------------+--------------------------+------------+
6 rows in set (0.00 sec)

mysql> select student.name, student.birth, dept.dept_name, dept.dept_block from student join dept on student.dept_id = dept.dept_id;
+--------------+------------+--------------------------+------------+
| name         | birth      | dept_name                | dept_block |
+--------------+------------+--------------------------+------------+
| Maria Gloria | 1994-03-12 | Information Technology   | C-Block    |
| John Smith   | 1993-02-07 | Computer Science         | B-Block    |
| Gal Rao      | 1992-09-11 | Electronic Communication | D-Block    |
| Jakey Smith  | 1990-08-31 | Information Technology   | C-Block    |
| Rama Saho    | 1994-12-09 | Computer Science         | B-Block    |
| Maria Gaga   | 1993-10-09 | Electronic Communication | D-Block    |
+--------------+------------+--------------------------+------------+
6 rows in set (0.00 sec)


mysql> alter table dept add constraint fkdept  foreign key (dept_id) references students(dept_id);


Q.2 Write a mysql statement to get name of students containing exactly five characters with ‘a’ as last letter.
Suppose the student table is -
+----+-------+---------+------------+
| id | name | dept_id | birth |
+----+-------+---------+------------+
| 1 | Maria | 2 | 1994-03-12 |
| 2 | John | 1 | 1993-02-07 |
| 3 | Gal | 4 | 1992-09-11 |
| 4 | Jakey | 2 | 1990-08-31 |
| 5 | Rama | 1 | 1994-12-09 |
| 6 | Maria | 4 | 1993-10-09 |
+----+-------+---------+------------+
Q.3 Write a mysql statement to determine the age of each of the students.
Suppose the table is -
+----+--------------+------------+------------+
| id | name | department | birth |
+----+--------------+------------+------------+
| 1 | Maria Gloria | CS | 1994-03-12 |
| 2 | John Smith | IT | 1993-02-07 |
| 3 | Gal Rao | CS | 1992-09-11 |
| 4 | Jakey Smith | EC | 1990-08-31 |
| 5 | Rama Saho | IT | 1994-12-09 |
| 6 | Maria Gaga | EC | 1993-10-09 |
+----+--------------+------------+------------+
Database changed
mysql> INSERT INTO employee (id, name, department, birth) VALUES     (1, 'Maria Gloria', 'CS', '1994-03-12'),     (2, 'John Smith', 'IT', '1993-02-07'),     (3, 'Gal Rao', 'CS', '1992-09-11'),     (4, 'Jakey Smith', 'EC', '1990-08-31'),
    (5, 'Rama Saho', 'IT', '1994-12-09'),     (6, 'Maria Gaga', 'EC', '1993-10-09');
Query OK, 6 rows affected (0.01 sec)
Records: 6  Duplicates: 0  Warnings: 0

mysql> select * from employee;
+----+--------------+------------+------------+
| id | name         | department | birth      |
+----+--------------+------------+------------+
|  1 | Maria Gloria | CS         | 1994-03-12 |
|  2 | John Smith   | IT         | 1993-02-07 |
|  3 | Gal Rao      | CS         | 1992-09-11 |
|  4 | Jakey Smith  | EC         | 1990-08-31 |
|  5 | Rama Saho    | IT         | 1994-12-09 |
|  6 | Maria Gaga   | EC         | 1993-10-09 |
+----+--------------+------------+------------+
6 rows in set (0.00 sec)

mysql> select name, year(currdate())-year(birth) from employee;
ERROR 1305 (42000): FUNCTION college.currdate does not exist
mysql> select name, year(currdate())-year(birth) as age  from employee;
ERROR 1305 (42000): FUNCTION college.currdate does not exist
mysql> select name, year(curdate())-year(birth) as age  from employee;
+--------------+------+
| name         | age  |
+--------------+------+
| Maria Gloria |   29 |
| John Smith   |   30 |
| Gal Rao      |   31 |
| Jakey Smith  |   33 |
| Rama Saho    |   29 |
| Maria Gaga   |   30 |
+--------------+------+
6 rows in set (0.00 sec)

mysql> select name, year(curdate())-year(birth) from employee;
+--------------+-----------------------------+
| name         | year(curdate())-year(birth) |
+--------------+-----------------------------+
| Maria Gloria |                          29 |
| John Smith   |                          30 |
| Gal Rao      |                          31 |
| Jakey Smith  |                          33 |
| Rama Saho    |                          29 |
| Maria Gaga   |                          30 |
+--------------+-----------------------------+
6 rows in set (0.00 sec)

mysql> SELECT id, name, department, birth, YEAR(CURDATE()) - YEAR(birth) - (DATE_FORMAT(CURDATE(), '%m%d') < DATE_FORMAT(birth, '%m%d')) AS age
    -> FROM student;
ERROR 1054 (42S22): Unknown column 'department' in 'field list'
mysql> SELECT id, name, birth, YEAR(CURDATE()) - YEAR(birth) - (DATE_FORMAT(CURDATE(), '%m%d') < DATE_FORMAT(birth, '%m%d')) AS age FROM student;
+----+-------+------------+------+
| id | name  | birth      | age  |
+----+-------+------------+------+
|  1 | Maria | 1994-03-12 |   29 |
|  2 | John  | 1993-02-07 |   30 |
|  3 | Gal   | 1992-09-11 |   31 |
|  4 | Jakey | 1990-08-31 |   33 |
|  5 | Rama  | 1994-12-09 |   28 |
|  6 | Maria | 1993-10-09 |   29 |
+----+-------+------------+------+
6 rows in set (0.01 sec)


Q.4 These questions are based on the following two tables, Employee table and Reward table.

Employee table
+-------------+------------+-----------+----------+--------------+-------------+
| Employee_id | First_name | Last_name | Salary | Joining_date | Departement |
+-------------+------------+-----------+----------+--------------+-------------+
| 1 | Bob | Kinto | 1000000 | 2019-01-20 | Finance |
| 2 | Jerry | Kansxo | 6000000 | 2019-01-15 | IT |
| 3 | Philip | Jose | 8900000 | 2019-02-05 | Banking |
| 4 | John | Abraham | 2000000 | 2019-02-25 | Insurance |
| 5 | Michael | Mathew | 2200000 | 2019-02-28 | Finance |
| 6 | Alex | chreketo | 4000000 | 2019-05-10 | IT |
| 7 | Yohan | Soso | 1230000 | 2019-06-20 | Banking |
+-------------+------------+-----------+----------+--------------+-------------+
Reward table
+-----------------+-------------+--------+
| Employee_ref_id | date_reward | amount |
+-----------------+-------------+--------+
| 1 | 2019-05-11 | 1000 |
| 2 | 2019-02-15 | 5000 |
| 3 | 2019-04-22 | 2000 |
| 1 | 2019-06-20 | 8000 |
+-----------------+-------------+--------+
1. Get all employees.
2. Display the first name and last name of all employees.
3. Display all the values of the “First_Name” column using the alias “Employee Name”
4. Get all “Last_Name” in lowercase.
5. Get all “Last_Name” in uppercase.
6. Get unique “DEPARTMENT”.
7. Get the first 4 characters of “FIRST_NAME” column.
 select Left(First_name,4) from Employee;

8. Get the position of the letter ‘h’ in ‘John’.
SELECT INSTR('Yohan', 'h') AS PositionOfH;



9. Get all values from the “FIRST_NAME” column after removing white space on the right.
select rtrim(First_Name) from Employee;
10. Get all values from the “FIRST_NAME” column after removing white space on the left.
11. Write the syntax to create the “employee” table.








mysql> -- Create Employee table without primary key or foreign key
mysql> CREATE TABLE Employee (
    ->     Employee_id INT,
    ->     First_name VARCHAR(255),
    ->     Last_name VARCHAR(255),
    ->     Salary DECIMAL(10, 2),
    ->     Joining_date DATE,
    ->     Department VARCHAR(255)
    -> );
Query OK, 0 rows affected (0.14 sec)

mysql> 
mysql> -- Insert sample data into the Employee table
mysql> INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Department)
    -> VALUES
    ->     (1, 'Bob', 'Kinto', 1000000.00, '2019-01-20', 'Finance'),
    ->     (2, 'Jerry', 'Kansxo', 6000000.00, '2019-01-15', 'IT'),
    ->     (3, 'Philip', 'Jose', 8900000.00, '2019-02-05', 'Banking'),
    ->     (4, 'John', 'Abraham', 2000000.00, '2019-02-25', 'Insurance'),
    ->     (5, 'Michael', 'Mathew', 2200000.00, '2019-02-28', 'Finance'),
    ->     (6, 'Alex', 'Chreketo', 4000000.00, '2019-05-10', 'IT'),
    ->     (7, 'Yohan', 'Soso', 1230000.00, '2019-06-20', 'Banking');
Query OK, 7 rows affected (0.01 sec)
Records: 7  Duplicates: 0  Warnings: 0

mysql> 
mysql> -- Create Reward table without primary key or foreign key
mysql> CREATE TABLE Reward (
    ->     Employee_ref_id INT,
    ->     date_reward DATE,
    ->     amount DECIMAL(10, 2)
    -> );
Query OK, 0 rows affected (0.06 sec)

mysql> 
mysql> -- Insert sample data into the Reward table
mysql> INSERT INTO Reward (Employee_ref_id, date_reward, amount)
    -> VALUES
    ->     (1, '2019-05-11', 1000.00),
    ->     (2, '2019-02-15', 5000.00),
    ->     (3, '2019-04-22', 2000.00),
    ->     (1, '2019-06-20', 8000.00);
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0













