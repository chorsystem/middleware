-- Database drops
DROP DATABASE "managementRegistry";
DROP DATABASE "eventRegistry";
DROP DATABASE "serviceRegistry";
DROP DATABASE "artifactRegistry";

-- Database: "managementRegistry"
CREATE DATABASE "managementRegistry"
  WITH OWNER = test
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'German_Germany.1252'
       LC_CTYPE = 'German_Germany.1252'
       CONNECTION LIMIT = -1;
	   
	   
-- Database: "eventRegistry"
CREATE DATABASE "eventRegistry"
  WITH OWNER = test
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'German_Germany.1252'
       LC_CTYPE = 'German_Germany.1252'
       CONNECTION LIMIT = -1;	   
	   
-- Database: "serviceRegistry"
CREATE DATABASE "serviceRegistry"
  WITH OWNER = test
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'German_Germany.1252'
       LC_CTYPE = 'German_Germany.1252'
       CONNECTION LIMIT = -1;

-- Database: "artifactRegistry"
CREATE DATABASE "artifactRegistry"
  WITH OWNER = test
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'German_Germany.1252'
       LC_CTYPE = 'German_Germany.1252'
       CONNECTION LIMIT = -1;       