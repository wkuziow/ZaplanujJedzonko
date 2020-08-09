package pl.coderslab.dietPlanner.plan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {

    int countAllByUserId(long userId);
    List<Plan> findAllByUserIdOrderByCreatedDesc(long userId);
    Plan findPlanById (long planId);

}
