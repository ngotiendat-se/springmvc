package controller;

import dummy.Customer;
import dummy.CustomerManagement;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by datnt on 10/1/2016.
 */

@Controller
@SessionAttributes("customer")
public class BaseController {

    @RequestMapping(value = "/")
    public String greeting() {
        CustomerManagement.init();
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping( value = "/login/submit", method = RequestMethod.POST )
    public ModelAndView submit(@RequestParam(value = "inputUsername") String username,
                                @RequestParam(value = "inputPassword") String password) {
        ModelAndView model = new ModelAndView();
        Customer matchedCustomer = CustomerManagement.authenticate(username, password);
        if (matchedCustomer != null) {
            model.addObject("customer", matchedCustomer);
            model.setViewName("redirect:/person/manage");
            return model;
        }
        model.setViewName("redirect:/login");
        return model;
    }
}
