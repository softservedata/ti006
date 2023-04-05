@echo off
java -jar dashrest.jar



rem curl -k -X POST https://speak-ukrainian.org.ua/dev/api/signin  -H "accept: */*"   -H "Content-Type: application/json" -d "{\"email\": \"test@gmail.com\",  \"password\": \"user\"}"

rem curl -k -i  -H 'accept: */*' -H "Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbkBnbWFpbC5jb20iLCJleHAiOjE2ODA3MDkxMDJ9.myntA2GDjmQtAzvpEqUltQz4QZMJ1wkaait3T1iroNVITU_YIY_pfF47WyCW1A893hz8CgdHOVBAFTg_m0Deqw" -X GET https://speak-ukrainian.org.ua/dev/api/user/32
