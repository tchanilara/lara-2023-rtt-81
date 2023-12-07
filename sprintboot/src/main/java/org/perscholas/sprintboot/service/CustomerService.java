package org.perscholas.sprintboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.sprintboot.database.dao.CustomerDAO;
import org.perscholas.sprintboot.database.entity.Customer;
import org.perscholas.sprintboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
@Slf4j
@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDao;

    public void createCustomer(CreateCustomerFormBean form) {
        log.debug("firstName: " + form.getFirstName());
        log.debug("lastName: " + form.getLastName());
        log.debug("phone: " + form.getPhone());
        log.debug("city: " + form.getCity());

        Customer customer = customerDao.findById(form.getId());
        if (customer == null) {
            customer = new Customer();
        }
        customer.setCity(form.getCity());
        customer.setFirstName(form.getFirstName());
        customer.setPhone(form.getPhone());
        customer.setLastName(form.getLastName());

        customerDao.save(customer);
    }
}
