package controller;

import dummy.CustomerManagement;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by datnt on 10/1/2016.
 */
@Controller
public class CustomerController {

    @RequestMapping(value = "/person/manage")
    public ModelAndView persons() {
        ModelAndView model = new ModelAndView("person");
        model.addObject("customers", CustomerManagement.getCustomers());
        return model;
    }

}
