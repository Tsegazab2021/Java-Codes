-- Q1
-- select first and last name of employees with salaries greater than 10000 and hired after 1998 
-- select first_name, last_name from employees
-- where salary > 10000 and hire_date > '1987-06-17'

-- Q2
-- Select the first 6 higly paid employees who are Accountants,Administration Assistant
select  employees.salary, jobs.job_title from employees
inner join jobs on employees.job_id=jobs.job_id
where job_title = 'Accountants' and 'Administration Assistant'
 order by  salary desc limit 0,6
 
 -- Q3
 -- Select dependents of the employees whose salaries are between 10000 and 2000

Select * from Employees
Where EXISTS (select * from Dependents where
employees.employee_id = dependents.employee_id) and salary between 10000 and 20000








