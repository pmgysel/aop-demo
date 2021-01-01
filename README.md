# Demo for Aspect Oriented Programming

## Dependencies

* `spring-boot-starter-aop`
* `aspectjweaver`

## Aspects for REST calls

* Log method name and parameters
* Log duration of REST call

## REST requests

There are 2 REST endpoints:

* GET http://localhost:8080/api/greeting/{name}
* GET http://localhost:8080/api/order/{menu}

## Sample aspect output

```bash
Method [greeting] gets called with parameters [John]
Exeution took [21ms]
```