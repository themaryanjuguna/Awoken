# AWOKEN News Api

#### By **Maryanne Njuguna**

## Description
Awoken is a rest REST API for querying and retrieving scoped news and information.

## User Stories
As a user, you should be able to create the following objects:-
- Departments
- News:
  - General News (Information affecting the whole company)
  - Department news (Objects within Object)
- Users:
  - As a user you should see:
  - individual users, their details, i.e position in the company, their roles, which department(s) they are associated with etc
  - specific information such as the Departments name, description, number of employees in the department.
  - all users from a specific Department, the news relating to that department or a link to a page with said news (for tidiness).
  - As a user, you will be able to Post some news relating to a department.

## Known Bugs
Report any bugs by hovering to https://github.com/themaryanjuguna/Awoken/issues and create a new issue.

## Setup/Installation Requirements
* Internet connection
* access to a browser
* fork from https://github.com/themaryanjuguna/Awoken.git

## In PSQL:
```
* CREATE DATABASE awoken;
* \c awoken;
CREATE TABLE users(id serial PRIMARY KEY, name varchar, profile varchar, position varchar, role varchar);
CREATE TABLE news(id serial PRIMARY KEY, title varchar, content varchar);
CREATE TABLE departments(id serial PRIMARY KEY, name varchar, profile varchar);

CREATE DATABASE awoken_test WITH TEMPLATE awoken;
```

## Technologies Used
* IntelliJ IDEA
* Java
* Spark
* PostgreSql
* Postman:
  * Department
    * GET http://localhost:4567/Department
    * POST http://localhost:4567/department/new
  * User
    * POST http://localhost:4567/User/new
    * GET http://localhost:4567/User
  * News
    * POST http://localhost:4567/News/new
    * GET http://localhost:4567/News

## Author Details
Maryanne Njuguna [Linktree Profile](https://linktr.ee/themaryanjuguna)

### License
Licensed by MIT
Copyright (c) 2022 **themaryanjuguna**