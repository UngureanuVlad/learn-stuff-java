CREATE TABLE persons
(
    id   SERIAL UNIQUE NOT NULL,
    name VARCHAR(200),
    PRIMARY KEY (id)
);
INSERT INTO public.persons(id, name)
VALUES (nextval('persons_id_seq'), 'Vlad');
INSERT INTO public.persons(id, name)
VALUES (nextval('persons_id_seq'), 'Mark');
