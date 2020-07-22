package pl.coderslab.dietPlanner.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homeGet() {
        return "home/home";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String aboutGet() {
        return "home/about";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactGet () {
        return "home/contact";
    }
}
