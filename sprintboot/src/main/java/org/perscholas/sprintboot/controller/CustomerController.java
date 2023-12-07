package org.perscholas.sprintboot.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.sprintboot.database.dao.CustomerDAO;
import org.perscholas.sprintboot.database.entity.Customer;
import org.perscholas.sprintboot.formbean.CreateCustomerFormBean;
import org.perscholas.sprintboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class CustomerController {

    @Autowired
    private CustomerDAO customerDao;

    @Autowired
    private CustomerService customerService;


    @GetMapping("/customer/edit/{id}")
    public ModelAndView editCustomer(@PathVariable int id){
        ModelAndView response = new ModelAndView("customer/create");

        Customer customer = customerDao.findById(id);
        CreateCustomerFormBean form = new CreateCustomerFormBean();

        if(customer != null){
            form.setId(customer.getId());
            form.setFirstName(customer.getFirstName());
            form.setLastName(customer.getLastName());
            form.setPhone(customer.getPhone());
            form.setCity(customer.getCity());
        }
        response.addObject("form", form);

        return response;
    }

    @GetMapping("/customer/search")
    public ModelAndView searchCustomer(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName )  {
        ModelAndView response =  new ModelAndView("customer/search");
        log.debug("In search customer without args first name "+firstName +" last name "+lastName);

        if(firstName != null && lastName != null){
            List<Customer> customers = customerDao.findByFirstNameAndLastName(firstName, lastName);
            response.addObject("customerVar", customers);
            response.addObject("firstName", firstName);
            response.addObject("lastName", lastName);
            for(Customer customer : customers){
                log.debug("customer: id= "+customer.getId()+ " last name = "+customer.getLastName());
            }
        }
        return response;
    }
    @GetMapping("/customer/create")
    public ModelAndView createCustomer(@Valid CreateCustomerFormBean form, BindingResult bindingResult )  {
        ModelAndView response =  new ModelAndView("customer/create");
        log.debug("In create customer without args");
        return response;
    }

    @GetMapping("/customer/createSubmit")
    public ModelAndView createCustomerSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult)  {


        if(bindingResult.hasErrors()){
            log.info("In create customer submit has errors");
            ModelAndView response =  new ModelAndView("customer/create");
            for(ObjectError error: bindingResult.getAllErrors()){
                log.info("error: "+ error.getDefaultMessage());

            }
            response.addObject("form",form);
            response.addObject("errors", bindingResult);
            return response;
        }
        ModelAndView response =  new ModelAndView("customer/create");

       customerService.createCustomer(form);
       log.info("In create customer with incoming args");

        return response;
    }
}
