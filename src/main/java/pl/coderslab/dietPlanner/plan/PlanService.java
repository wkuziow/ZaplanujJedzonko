package pl.coderslab.dietPlanner.plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanService {
    @Autowired
    private PlanRepository planRepository;

    public Plan findPlanSortDayNames(Long planId) {
        Plan result = planRepository.findPlanById(planId);
        List<PlanItem> planItems = result.getPlanDetails().stream()
                .sorted(Comparator.comparing(PlanItem::getDayName))
                .collect(Collectors.toList());
        result.setPlanDetails(planItems);
        return result;
    }
}
