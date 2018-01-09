RMDIR /S /Q "C:\Program Files\apache-tomcat-1\work"
RMDIR /S /Q "C:\Program Files\apache-tomcat-1\webapps\ode"

RMDIR /S /Q "C:\Program Files\apache-tomcat-2\work"
RMDIR /S /Q "C:\Program Files\apache-tomcat-2\webapps\ode"

"C:\Program Files (x86)\PostgreSQL\9.4\bin\psql.exe" -h localhost -p 5432 -U postgres -d postgres -a -f C:\Users\weissas\workspaces\sql-scripts\createDatabases.sql


pause