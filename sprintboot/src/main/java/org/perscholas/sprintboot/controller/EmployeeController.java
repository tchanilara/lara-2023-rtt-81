package org.perscholas.sprintboot.controller;


import lombok.extern.slf4j.Slf4j;
import org.perscholas.sprintboot.database.dao.EmployeeDAO;
import org.perscholas.sprintboot.database.entity.Employee;
import org.perscholas.sprintboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDao;

    @GetMapping("/employee/create")
    public ModelAndView createEmployee(CreateEmployeeFormBean form)  {
        ModelAndView response =  new ModelAndView("employee/create");
        log.debug("In create customer without args");
        return response;
    }

    @GetMapping("/employee/createSubmit")
    public ModelAndView createEmployeeSubmit(CreateEmployeeFormBean form)  {
        ModelAndView response =  new ModelAndView("employee/create");

        Employee employee = new Employee();
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartmentName());

        employeeDao.save(employee);

        return response;
    }
}
