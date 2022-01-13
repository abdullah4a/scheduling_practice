select * from test_table;

INSERT INTO public.test_table (id, name)
VALUES (336412, 'TEST');

SELECT name from test_table;


UPDATE public.test_table
SET id=5646564,name = 'new Name'
WHERE id = 3213;

DELETE
FROM public.test_table
WHERE id=3213;




-- Data Control Language (DCL)
Grant INSERT,DELETE ON test_table TO current_user;
