Spring boot version : 3.2.4


step 1 : mvn clean install

step 2 : mvn spring-boot:run (default port 8080)

step 3 : curl to get the token : 

curl --location 'http://localhost:8080/auth/login' \
--header 'Content-Type: application/json' \
--data '{
    "email":"pallav.com",
    "password" : "123456"
}'

step 4 : curl to test the endpoint for authentication

curl --location 'http://localhost:8080/test-jwt' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer <auth-token>'

replace auth-token with the token received in output of step 3
