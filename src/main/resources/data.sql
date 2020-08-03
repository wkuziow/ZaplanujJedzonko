insert into user (email, enable, first_name, last_name, password, role) values
        ('wkuziow@gmail.com', true, 'Wojtek','Kuziow', '$2a$10$d6yIQ387PHN0JPae5rlmMO8unoBqZEb3/uFFXG./JMq5zGcVM8CL6',1);


INSERT INTO dietPlanner.recipe (created_on, description, ingredients, name, preparation_description, preparation_time, updated_on, user_id)
VALUES
('2018-10-16', 'Opis przepisu 1', 'sałata', 'Przepis 1', 'Opis przygotowania 1', 22, '2018-11-17', 1),
('2018-10-18', 'Opis przepisu 2', 'mięso z indyka, pieczarki', 'Przepis 2', 'Opis przygotowania 2', 33, '2018-11-17', 1),
('2018-10-19', 'Opis przepisu 3', 'jabłka, mąka', 'Przepis 3', 'Opis przygotowania 3', 42, '2018-11-17', 1),
('2018-10-11', 'Opis przepisu 4', 'ryba, makaron, sos pomidorowy', 'Przepis 4', 'Opis przygotowania 4', 12, '2018-11-17', 1),
('2018-10-12', 'Opis przepisu 5', 'płatki owsiane, mleko', 'Przepis 5', 'Opis przygotowania 5', 42, '2018-11-17', 1),
('2018-10-13', 'Opis przepisu 6', 'pomidory, rosół', 'Przepis 6', 'Opis przygotowania 6', 32, '2018-11-17', 1),
('2018-10-14', 'Opis przepisu 7', 'chleb, ser', 'Przepis 7', 'Opis przygotowania 7', 62, '2018-11-17', 1)
;

INSERT INTO plan (name, description, created, user_id) VALUES
('Plan Jarski', 'Opis planu 1', '2018-10-17', 1),
('Plan Mięsny', 'Opis planu 2', '2018-10-17', 1),
('Plan Śniadaniowy', 'Opis planu 3', '2018-10-17', 1),
('Plan Redukcja', 'Opis planu 4', '2018-10-17', 1),
('Plan Dużo białka', 'Opis planu 5', '2018-10-17', 1),
('Kapuściana dieta', 'Opis planu 6', '2018-10-17', 1)
;

INSERT INTO dietPlanner.plan_item (day_name, meal_name, meal_type, recipe_name_id) VALUES (0, 'Posiłek 1', 0, 1);
INSERT INTO dietPlanner.plan_item (day_name, meal_name, meal_type, recipe_name_id) VALUES (0, 'Posiłek 2', 1, 2);
INSERT INTO dietPlanner.plan_item (day_name, meal_name, meal_type, recipe_name_id) VALUES (0, 'Posiłek 3', 2, 3);
INSERT INTO dietPlanner.plan_item (day_name, meal_name, meal_type, recipe_name_id) VALUES (1, 'Posiłek 4', 0, 4);
INSERT INTO dietPlanner.plan_item (day_name, meal_name, meal_type, recipe_name_id) VALUES (1, 'Posiłek 5', 1, 5);
INSERT INTO dietPlanner.plan_item (day_name, meal_name, meal_type, recipe_name_id) VALUES (1, 'Posiłek 6', 2, 6);
INSERT INTO dietPlanner.plan_item (day_name, meal_name, meal_type, recipe_name_id) VALUES (2, 'Posiłek 7', 0, 7);
INSERT INTO dietPlanner.plan_item (day_name, meal_name, meal_type, recipe_name_id) VALUES (2, 'Posiłek 8', 1, 1);
INSERT INTO dietPlanner.plan_item (day_name, meal_name, meal_type, recipe_name_id) VALUES (2, 'Posiłek 9', 2, 2);

INSERT INTO dietPlanner.plan_plan_item (plan_id, plan_item_id) VALUES (1, 1);
INSERT INTO dietPlanner.plan_plan_item (plan_id, plan_item_id) VALUES (1, 2);
INSERT INTO dietPlanner.plan_plan_item (plan_id, plan_item_id) VALUES (1, 3);
INSERT INTO dietPlanner.plan_plan_item (plan_id, plan_item_id) VALUES (1, 4);
INSERT INTO dietPlanner.plan_plan_item (plan_id, plan_item_id) VALUES (1, 5);
INSERT INTO dietPlanner.plan_plan_item (plan_id, plan_item_id) VALUES (1, 6);
INSERT INTO dietPlanner.plan_plan_item (plan_id, plan_item_id) VALUES (1, 7);
INSERT INTO dietPlanner.plan_plan_item (plan_id, plan_item_id) VALUES (1, 8);
INSERT INTO dietPlanner.plan_plan_item (plan_id, plan_item_id) VALUES (1, 9);
