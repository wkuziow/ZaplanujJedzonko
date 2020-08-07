package pl.coderslab.dietPlanner.plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.dietPlanner.recipe.RecipeRepository;
import pl.coderslab.dietPlanner.user.CurrentUser;
import pl.coderslab.dietPlanner.user.User;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@Transactional
public class PlanController {

    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private PlanService planService;

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private PlanItemRepository planItemRepository;

    @RequestMapping(value = "/dashboard/planDetails", method = RequestMethod.GET)
    public String planDetailsGet(HttpSession session, Model model) {
        model.addAttribute("planDetailed", planService.findPlanSortDayNames(
                (Long) session.getAttribute("newestPlanId")));
        return "plan/details";
    }

    @RequestMapping(value = "/dashboard/planDetails", method = RequestMethod.POST)
    public String planDetailsPost(Model model, @RequestParam Long idPlanDetailsItem, @RequestParam String actionOnPlanDetails, HttpSession session) {
        session.setAttribute("idPlanDetailsItem", idPlanDetailsItem);
        String result = "";
        if (actionOnPlanDetails.equals("getDetails")) {
            result = "redirect:/dashboard/planDetails/recipeDetails";
        } else if (actionOnPlanDetails.equals("deletePlanItem")) {
            planItemRepository.deletePlanItemQuery(idPlanDetailsItem);
            model.addAttribute("planDetailed", planService.findPlanSortDayNames(
                    (Long) session.getAttribute("newestPlanId")));
            result = "redirect:/dashboard/planDetails";
        }

        return result;
    }

    @RequestMapping(value = "/dashboard/planDetails/recipeDetails", method = RequestMethod.GET)
    public String planRecipeDetailsGet(Model model, HttpSession session) {
        Long idPlanDetailsItem = (Long) session.getAttribute("idPlanDetailsItem");
        model.addAttribute("recipeDetails", recipeRepository.findRecipeById(idPlanDetailsItem));
        session.removeAttribute("idPlanDetailsItem");
        return "recipe/details";
    }

    @RequestMapping(value = "/plan/add", method = RequestMethod.GET)
    public String addPlanGet(Model model) {
        model.addAttribute("plan", new Plan());
        return "plan/add";
    }

    @RequestMapping(value = "/plan/add", method = RequestMethod.POST)
    public String addPlanPost(@ModelAttribute @Validated Plan plan,
                              BindingResult bindingResult, @AuthenticationPrincipal CurrentUser customUser) {
        if (bindingResult.hasErrors()) {
            return "plan/add";
        }
        planService.savePlan(plan, customUser);
        return "redirect:/dashboard";
    }
}
