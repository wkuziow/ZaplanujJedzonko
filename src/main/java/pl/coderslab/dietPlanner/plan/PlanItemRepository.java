package pl.coderslab.dietPlanner.plan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PlanItemRepository extends JpaRepository<PlanItem, Long> {

    @Modifying
    @Transactional
    long deletePlanItemById (Long id);

    @Modifying
    @Transactional
    @Query(value = "delete abc, pit from dietPlanner.plan_plan_item abc inner join dietPlanner.plan_item pit on abc.plan_item_id = pit.id where abc.plan_item_id = ?1", nativeQuery = true)
    void deletePlanItemQuery (Long id);


}
