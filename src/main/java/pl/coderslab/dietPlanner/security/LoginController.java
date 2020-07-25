package pl.coderslab.dietPlanner.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login() {
        return "home/login";
    }

//    @ModelAttribute("currentUserFullName")
//    public String currentUser(@AuthenticationPrincipal CurrentUser customUser) {
//        return utils.currentUser(customUser);
//    }
}
