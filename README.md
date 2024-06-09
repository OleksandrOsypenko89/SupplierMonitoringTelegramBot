# SUPPLIER MONITORING - TELEGRAM BOOT 

This project is created for corporate needs.
To gain access, a company employee must enter his/her personal corporate number.
After authorization, the user gets access to information that may be useful for his/her work and tasks from the management.

### Stack of technologies used in the project

* Java 17
* Spring Boot
* PostgreSQL
* Docker
* Maven

### Run the project

- Clone the project to your computer.
- Start the database server locally (PostgreSQL). I recommend doing this through docker.

Related command:

```
  docker run --name TelegramBot -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres 
```
Connecting to DB
```
  url: jdbc:postgresql://localhost:5432/postgres
  username: postgres
  password: postgres
```
- Создайте свой телеграм бот и внесите его данные в файл `src/resource/application.properties`
  - _bot.name_
  - _bot.token_
- Start the Spring Boot application `SupplierMonitoringTelegramBotApplication`

The bot is designed to display information, it does not have the ability to make entries or change them.
In order to view the bot work you need to fill the database a little bit so that the bot has something to display. 