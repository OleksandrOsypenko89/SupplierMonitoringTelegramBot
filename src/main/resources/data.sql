CREATE TABLE public.projects (
                                 id bigint NOT NULL,
                                 project_name character varying(255)
);

CREATE SEQUENCE public.projects_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE public.projects_task_list (
                                           project_id bigint NOT NULL,
                                           task_list_id bigint NOT NULL
);

CREATE TABLE public.projects_users_list (
                                            project_id bigint NOT NULL,
                                            users_list_id bigint NOT NULL
);

CREATE TABLE public.suppliers (
                                  id bigint NOT NULL,
                                  comment character varying(255),
                                  delivery_speed character varying(255),
                                  name character varying(255),
                                  price integer,
                                  rating double precision
);

CREATE SEQUENCE public.suppliers_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE public.tasks (
                              id bigint NOT NULL,
                              extra_info character varying(255),
                              task_status character varying(255),
                              text character varying(255),
                              manager_id bigint,
                              project_id bigint,
                              worker_id bigint
);

CREATE SEQUENCE public.tasks_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE public.users (
                              id bigint NOT NULL,
                              corp_id integer,
                              password character varying(255),
                              role character varying(255),
                              user_name character varying(255),
                              project_id bigint,
                              access bigint
);

CREATE SEQUENCE public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE public.users_manage_tasks (
                                           user_id bigint NOT NULL,
                                           manage_tasks_id bigint NOT NULL,
                                           users_id bigint NOT NULL
);