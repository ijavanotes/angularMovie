# Movie Boot application
- embedded h2 database
- using spring jdbc template
- support create/update/delete action
You can view database 
- embedded h2 database

You can also view db  :
- http://localhost:8080/h2-console/

Crude operations:

Create 
- http://localhost:8080/addMovie 
- method POST
```javascript
 {
            "title": "Avengers: Infinity War1",
            "director": "Anthony RUSSO, Joe RUSSO",
            "releaseDate": "25/04/2018",
            "type": "sci-fi"
        }
  ```
update 
 - method POST
 - http://localhost:8080/updateMovie
```javascript {
"id":1,
            "title": "Avengers: Infinity War34",
            "director": "Anthony RUSSO, Joe RUSSO",
            "releaseDate": "25/04/2018",
            "type": "sci-fi"
        }
 ```       
 delete
 - http://localhost:8080/deleteMovie
 - METHOD POST
 ```javascript {
 {
"id":1
            
        }
  ```       
   view  All
    - http://localhost:8080/allmovies
    - METHOD GET
   ```javascript
    {"response":[{"title":"Avengers: Infinity War","director":"Anthony RUSSO, Joe RUSSO","releaseDate":"25/04/2018","type":"sci-fi"}],"status":{"code":200,"descriptions":"Success"}}
   ```
   # Movie angular  application
   - using datagrid with sort and search 
   - router for diffrent page for home page and view movies

 
