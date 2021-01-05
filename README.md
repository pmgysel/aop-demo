# Demo for Aspect Oriented Programming

This is a simple web service which uses AOP. The REST methods are advised by multiple Aspects.

## Dependencies

* Java JDK 15
* Maven:
  * `spring-boot-starter-aop`
  * `aspectjweaver`

## Aspects for REST calls

* Log method name and parameters
* Log duration of method

## Usage

* Compile and run web service:
```sh
mvn clean install
mvn spring-boot:run
```
* Sample REST calls:
```sh
GET http://localhost:8080/api/greeting/{name}
GET http://localhost:8080/api/order/{menu}
```

## Sample aspect output

```sh
Method [greeting] gets called with parameters [John]
Exeution took [21ms]
```