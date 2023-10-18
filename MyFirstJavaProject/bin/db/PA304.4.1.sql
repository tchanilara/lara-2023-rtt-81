/*Display the name, product line, and buy price of all products*/
select product_name as Name, productline_id as "Product Line", buy_price as "Buy Price"
from products;

/*Display the first name, last name, and city name of all customers from Germany. */
select contact_firstname as "First Name", contact_lastname as "Last Name", city as "City Name"
from customers
where country = "Germany"
order by contact_firstname asc;

/*Display each of the unique values of the status field in the orders table. */
select distinct status
from orders
order by status asc;

/*Display all fields from the payments table for payments made on or after January 1, 2005.*/
select *
from payments
where payment_date >= '2005-01-01'
order by payment_date desc; 

/*Display the last Name, first Name, email address, and job title of all employees working out of the San Francisco office*/
select e.lastname as 'Last Name', e.firstname as 'First Name', e.email as 'Email Address', e.job_title as 'Job Title'
from employees e, offices o
where e.office_id = o.id and o.city ='San Francisco';

/*Display the name, product line, scale, and vendor of all of the car products – both classic and vintage. */
select p.product_name as Name, pl.product_line as 'Product Line', p.product_scale as Scale, p.product_vendor as Vendor
from products p, productlines pl
where productline_id = pl.id and pl.product_line like '%vintage%' or pl.product_line like '%classic%'
order by  p.product_name asc;
select product_name from products;
SELECT DISTINCT product_name FROM products WHERE  SUBSTR(product_name, LENGTH(product_name),1) IN ('a','e','i','o','u') AND SUBSTR(product_name, 1,1) IN ('a','e','i','o','u');

SELECT DISTINCT product_name FROM products WHERE  SUBSTR(product_name, LENGTH(product_name),1) IN ('a','e','i','o','u');


