package pl.coderslab.dietPlanner.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.dietPlanner.user.CurrentUser;
import pl.coderslab.dietPlanner.utils.Utils;

@Controller
public class HomeController {

    @Autowired
    private Utils utils;

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

    @ModelAttribute("currentUserFullName")
    public String currentUser(@AuthenticationPrincipal CurrentUser customUser) {
        return utils.currentUser(customUser);
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String dashboardGet() {
        return "home/dashboard";
    }

}
