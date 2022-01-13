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

-- Alias
SELECT id as UserID FROM test_table;
-- //////////////////
-- create table if not exists practice_table
-- (
--     web_Id      BIGINT  not null primary key unique,
--     firstName   varchar not null,
--     lastName    varchar,
--     dob         varchar,
--     gender      varchar,
--     dateCreated date DEFAULT CURRENT_TIMESTAMP,
--     address     varchar
-- );
INSERT INTO public.practice_table (web_id, firstname, lastname, dob, gender, datecreated, address)
VALUES (44424, 'TEST', 'Model', '12-02-1265', 'male', DEFAULT, null);


Select web_Id as webId, firstName,lastName,dateCreated From practice_table;

update practice_table SET firstName='Numan',lastName='Razzaq',gender='Male' where web_id=1232131;
Select * From practice_table;

SELECT * FROM practice_table order by web_id Desc ;
