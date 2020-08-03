package pl.coderslab.dietPlanner.plan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PlanItemRepository extends JpaRepository<PlanItem, Long> {

    @Modifying
    @Transactional
    long deletePlanItemById (Long id);
}
