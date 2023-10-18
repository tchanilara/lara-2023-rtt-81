select distinct country 
from customers
order by country desc;

delete  
from customers
where customer_name = 'Hibernate Customer' and id > 498;

delete 
from customers
where customer_name LIKE '%4';

select * 
from customers
where customer_name LIKE '%4'
order by id desc; 

