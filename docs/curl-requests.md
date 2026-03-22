# Test Endpoints

```bash
curl -X GET -i http://localhost:8080/auth/test
curl -X GET -i http://localhost:8080/account/test
curl -X GET -i http://localhost:8080/accommodation/test
curl -X GET -i http://localhost:8080/reservation/test
```

# Actuator Endpoints

## API Gateway
```bash
curl -X GET -i http://localhost:8080/actuator/health
```

## Auth Service
```bash
curl -X GET -i http://localhost:8080/auth/actuator/health
curl -X GET -i http://localhost:8081/actuator/health
curl -X POST http://localhost:8081/auth/signup  \
    -H "Content-Type: application/json" \
    -d '{
        "user": {
            "username":"myGo4d11223344",
            "password":"myGod11223344"
            },
        "account": {
            "firstName":"wewedfsdfsdsdss",
            "lastName":"fdfdsfsdfsdf",
            "email":"my4544gdod@gmail.com",
            "birthdate":"1990-10-10"
        }
    }' \
    -i 
    
curl -X POST http://localhost:8081/auth/signin  \
    -H "Content-Type: application/json" \
    -d '{
        "username":"myGo4d11223344",
        "password":"myGod11223344"
        }
    }' \
    -i 
curl -X GET http://localhost:8081/actuator/health  \
    -H "Content-Type: application/json" \
    -H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE3NzQyMDE3NTQsImV4cCI6MTc3NDIwNTM1NCwianRpIjoiN2E5MmNkMjgtZDIyNy00ZmE1LTg5ZjctYmVmMmExMmRlZjNmIiwic3ViIjoiMjViNGUyMDgtZjIwZi00ZjE0LWEwZTUtY2E4MjE2OGRlZThjIiwidXNlcm5hbWUiOiJteUdvNGQxMTIyMzM0NCJ9.fkgiXD7yEOQgcxosgdohxErwi696SNWcpafB6o7eWt7Ia6AGGq-SE48GgMlxJzlYJzxeDFunahuj0g--UTjslQ" \
    -i 

Grpc test
curl -i http://localhost:8081/greet?name=Gaze
```

## Account Service
```bash
curl -X GET -i http://localhost:8080/account/actuator/health
curl -X GET -i http://localhost:8082/actuator/health
curl -X POST \
    -H "Content-Type: application/json" \
    -d '{"authUserId":"dd24dcd7-44b0-4ac5-ad7a-adf941e64ce6","firstName":"Marko","lastName":"Markovic","gender":"MALE","birthDate":"1999-09-09","email":"marko@gmail"}' \
    -i http://localhost:8082/account/create 
```

## Accommodation Service
```bash
curl -X GET -i http://localhost:8080/accommodation/actuator/health
curl -X GET -i http://localhost:8083/actuator/health
curl -X POST \
    -H "Content-Type: application/json" \
    -d '{
        "name":"wewedfsdfsdsdss",
        "description":"fdfdsfsdfsdf",
        "address": {
            "country":"222222",
            "city":"sddsad",
            "street":"sadsad",
            "number":"999999"
        },
        "amenities":["WIFI", "BATH_TUB"],
        "ownerId":"2ee2dae2-7936-417a-beee-707dd14c6236",
        "minNumberOfGuests":"2",
        "maxNumberOfGuests":"4"
    }' \
    -i http://localhost:8083/accommodation/new 
```

## Reservation Service
```bash
curl -X GET -i http://localhost:8080/reservation/actuator/health
curl -X GET -i http://localhost:8084/actuator/health
curl -X POST \
    -H "Content-Type: application/json" \
    -d '{
        "accommodationId":"2ae2dae2-9136-417a-beee-707dd14c6236",
        "userId":"2ae2dae2-9136-433a-beee-707dd14c6236",
        "description":"fdfdsfsdfsdf",
        "beginning":"2026-10-10",
        "ending":"2026-11-10",
        "guests":"2"
    }' \
    -i http://localhost:8084/reservation/new 
```