CREATE USER 'project03'@'localhost' IDENTIFIED BY 'project03';

GRANT ALL PRIVILEGES ON * . * TO 'project03'@'localhost';

#
# Starting with MySQL 8.0.4, the MySQL team changed the 
# default authentication plugin for MySQL server 
# from mysql_native_password to caching_sha2_password.
#

ALTER USER 'project03'@'localhost' IDENTIFIED WITH mysql_native_password BY 'project03';