# Login Registration and EMAIL Verification Backend Project

- Spring Boot 2.7.9 verzió
- Java 17
- MaildDev [GitHub Page](https://github.com/maildev/maildev)
- Postgresql

Az alkalmazás célja egy egyszerű regisztráció email token küldéssel. A bejelentkezéshez aktiválni kell a tokent amit 
emailbe küldünk ki, / MailDev / használok ehhez.  Az alkalmazás a backendre fokuszál 
így a frontend oldal csak egyszerű Stringenkkel reprezentálok.

## Az alkalmazás föbb egységei
### AppUser
A felhasználóról a következőket jegyezük fel az adatbázisba.
* Long id
* String firstName
* String lastName
* String email
* String password
* Enum AppUserRole appUserRole
* Boolean locked alapból false
* Boolean enabled alapból false

A felhasználokhoz rögtön implementáljuk a UserDetails interface-t.

### ConfirmationToken
A felhasználó tokenjéről a következőket jegyezük fel az adatbázisba.
* Long id
* String token
* LocalDateTime createdAt
* LocalDateTime expiresAt
* LocalDateTime confirmedAt
* AppUser appUser --> Az adatbázisba az app_user_id-ra hivatkozunk

## MailDev Használata
### MailDev [GitHub Page](https://github.com/maildev/maildev) oldala
Elsőnek felkell telepítenünk a MailDev-et ezt cmd-ben egyszerűen megtehetjük csak használjuk ezeket a parancssort.: 
npm install -g maildev

Majd ha már fut az alakalmazásunk egyszerűen command line-ba beírjuk a maildev parancssort.

Majd a böngészőbe a http://localhost:1080 oldalon megtalálhatjuk az Email-t.
A application.yml fájlban adhatjuk meg melyik porton szeretnénk elérni az oldalt.



