package org.perscholas.sprintboot.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.sprintboot.database.dao.UserDAO;
import org.perscholas.sprintboot.database.entity.User;
import org.perscholas.sprintboot.formbean.CreateCustomerFormBean;
import org.perscholas.sprintboot.formbean.RegisterUserFormBean;
import org.perscholas.sprintboot.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class AuthController {

    @Autowired
    private UserDAO userDao;
    @Autowired
    private AuthService userService;
    @GetMapping("/auth/register")
    public ModelAndView register(){
        ModelAndView response = new ModelAndView();
        response.setViewName("auth/register");
        return response;
    }

    @GetMapping("/auth/login")
    public ModelAndView login(){
        ModelAndView response = new ModelAndView();
        response.setViewName("auth/login");
        return response;
    }

    @GetMapping("/auth/registerSubmit")
    public ModelAndView registerUserSubmit(@Valid RegisterUserFormBean form, BindingResult bindingResult)  {


        if(bindingResult.hasErrors()){
            log.info("In create user submit has errors");
            ModelAndView response =  new ModelAndView("auth/register");
            for(ObjectError error: bindingResult.getAllErrors()){
                log.info("error: "+ error.getDefaultMessage());

            }
            response.addObject("form",form);
            response.addObject("errors", bindingResult);
            return response;
        }


        User u =  userService.createNewUser(form);

        log.info("In create User with incoming args");
        ModelAndView response =  new ModelAndView("auth/register");
        response.setViewName("redirect:/");

        return response;
    }
}
