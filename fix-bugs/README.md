steps for bug test:
  * $ git clone https://github.com/jabbadev/mybatis-issues.git
  * $ cd mybatis-issues/fix-bugs
  * Set local db connection string [ fix-bugs/src/test/resources/test/database.properties ]
  * Create database objects [ src/test/resources/test/CreateDB.sql ]
  * $ mvn test
