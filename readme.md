***

# модуль: "Сервис enovia training" / "Enovia training service" (enovia-training)

***

#### локальная разработка и запуск:
активация dev профиля : `spring.profiles.active=dev`

локальный путь к swagger: http://localhost:22233/swagger-ui/index.html

перед запуском в application-dev.yaml произвести конфигурацию БД и других параметров

***

#### конфигурация env параметров:

##### Подключение к БД:
- DATABASE_URL - строка подключения к БД
- DATABASE_USERNAME - пользователь
- DATABASE_PASSWORD - пароль
- DATABASE_SCHEMA - схема 

##### пример:
- DATABASE_URL = jdbc:postgresql://localhost:5432/enoviatrainingservice_db
- DATABASE_USERNAME = postgres_username
- DATABASE_PASSWORD = postgres_password
- DATABASE_SCHEMA = enoviatrainingservice


#### используемые инструменты:
- язык разработки: java/openjdk 17
- фреймворк: Spring Boot 3
- система автоматизации сборки: Gradle 8.8

***
