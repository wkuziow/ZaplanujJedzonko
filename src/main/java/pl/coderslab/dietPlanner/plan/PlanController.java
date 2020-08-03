package pl.coderslab.dietPlanner.plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.dietPlanner.recipe.RecipeRepository;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
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
            planItemRepository.deleteById(idPlanDetailsItem);
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

    @RequestMapping(value = "/dashboard/planDetails/deleteItem", method = RequestMethod.GET)
    public String deletePlanItemGet(HttpSession session, Model model) {
        Long idPlanDetailsItem = (Long) session.getAttribute("idPlanDetailsItem");
        planItemRepository.deletePlanItemById(idPlanDetailsItem);
        model.addAttribute("planDetailed", planService.findPlanSortDayNames(
                (Long) session.getAttribute("newestPlanId")));
        return "plan/details";
    }
}
