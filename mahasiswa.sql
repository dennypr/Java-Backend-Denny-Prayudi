
CREATE TABLE mahasiswa
(
  id serial NOT NULL,
  address character varying(255),
  age integer NOT NULL,
  name character varying(255),
  CONSTRAINT mahasiswa_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE mahasiswa
  OWNER TO postgres;