package pl.coderslab.dietPlanner.plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class PlanController {

    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private PlanService planService;

    @RequestMapping(value = "/dashboard/planDetails", method = RequestMethod.GET)
    public String planDetailsGet (HttpSession session, Model model) {
        model.addAttribute("planDetailed", planService.findPlanSortDayNames(
                (Long) session.getAttribute("newestPlanId")));
        return "plan/details";
    }

}
