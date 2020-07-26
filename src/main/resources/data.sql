insert into user (email, enable, first_name, last_name, password, role) values
        ('wkuziow@gmail.com', true, 'Wojtek','Kuziow', '$2a$10$d6yIQ387PHN0JPae5rlmMO8unoBqZEb3/uFFXG./JMq5zGcVM8CL6',1);

INSERT INTO plan (name, description, created, user) VALUES
('Plan Jarski', 'Opis planu 1', '2018-10-17 14:27:05', 1),
('Plan Mięsny', 'Opis planu 2', '2018-10-17 14:27:05', 1),
('Plan Śniadaniowy', 'Opis planu 3', '2018-10-17 14:27:05', 1),
('Plan Redukcja', 'Opis planu 4', '2018-10-17 14:27:05', 1),
('Plan Dużo białka', 'Opis planu 5', '2018-10-17 14:27:05', 1),
('Kapuściana dieta', 'Opis planu 6', '2018-10-17 14:27:05', 1)
;

INSERT INTO recipe (name, ingredients, description, created, updated, user, preparation_time, preparation) VALUES
('Przepis 1', 'sałata', 'Opis przepisu 1', '2018-10-16 00:00:00', '2018-10-17 14:24:44', 1, 22,'Opis przygotowania 1'),
('Przepis 2', 'mięso z indyka, pieczarki', 'Opis przepisu 2', '2018-10-16 00:00:00', '2018-10-17 14:24:44', 1, 22,'Opis przygotowania 2'),
('Przepis 3', 'soczewica, ser feta', 'Opis przepisu 3', '2018-10-24 00:00:00', '2018-10-17 14:24:44', 1, 23,'Opis przygotowania 3'),
('Przepis 4', 'ciecierzyca, ', 'Opis przepisu 4', '2018-10-24 00:00:00', '2018-10-17 14:24:44', 1, 24,'Opis przygotowania 4'),
('Przepis 5', 'schab, ziemniaki', 'Opis przepisu 5', '2018-10-24 00:00:00', '2018-10-17 14:24:44', 1, 25,'Opis przygotowania 5'),
('Przepis 6', 'kapusta, mięso mielone', 'Opis przepisu 6', '2018-10-24 00:00:00', '2018-10-17 14:24:44', 1, 26,'Opis przygotowania 6'),
('Przepis 7', 'kasza gryczana, cukinia', 'Opis przepisu 7', '2018-10-24 00:00:00', '2018-10-17 14:24:44', 1, 27,'Opis przygotowania 7'),
('Przepis 8', 'boczek, parmezan, jajka, makaron', 'Opis przepisu 8', '2018-10-24 00:00:00', '2018-10-17 14:24:44', 1, 28,'Opis przygotowania 8'),
('Przepis 9', 'lody, gruszki', 'Opis przepisu 9', '2018-10-24 00:00:00', '2018-10-17 14:24:44', 1, 29,'Opis przygotowania 9')
;

INSERT INTO `recipe_plan` (`id`, `recipe_id`,  `meal_name`, `display_order`, `day_name_id`, `plan_id`) VALUES
(null, 1,  'Kolacja', 2, 2, 6),
(null, 2,  'Śniadanie', 1, 1, 6),
(null, 1,  'Kolacja', 2, 1, 6),
(null, 3,  'Śniadanie', 1, 2, 6);