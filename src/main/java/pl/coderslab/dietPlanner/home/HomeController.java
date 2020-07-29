package pl.coderslab.dietPlanner.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.dietPlanner.plan.PlanRepository;
import pl.coderslab.dietPlanner.user.CurrentUser;
import pl.coderslab.dietPlanner.utils.Utils;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    private Utils utils;

    @Autowired
    private HomeService homeService;

    @Autowired
    PlanRepository planRepository;

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
    public String dashboardGet(Model model, @AuthenticationPrincipal CurrentUser customUser) {
        model.addAttribute("recipeCount", homeService.recipeCount(customUser));
        model.addAttribute("planCount", homeService.plantCount(customUser));
        if (!planRepository.findAllByUserIdOrderByCreatedDesc(customUser.getUser().getId()).isEmpty()) {
            model.addAttribute("display", "okToDisplay");
            model.addAttribute("newestPlan",
                    planRepository.findAllByUserIdOrderByCreatedDesc(customUser.getUser().getId()));
            model.addAttribute("newestPlanName",
                    planRepository.findAllByUserIdOrderByCreatedDesc(customUser.getUser().getId()).get(0).getName());
        }
        return "home/dashboard";
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.POST)
    public String dashboardPost (@RequestParam Long newestPlanId, HttpSession session) {
        session.setAttribute("newestPlanId", newestPlanId);
        return "redirect:/dashboard/planDetails";
    }


}
