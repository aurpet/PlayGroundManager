# PlayGroundManager
## Program works within REST API

Example:
1) Create new player send post to http://localhost:8080/new-player  
```bash
{
  "playGround": "DS",
  "ticket": {
    "isVIP": false,
    "ticketValidTime": "2021-10-28T22:52:03.767023"
  }
}
```
2) Get all players send get to http://localhost:8080/all
3) Count players by playground send get to http://localhost:8080/{PlayGround} 
```bash
http://localhost:8080/DOUBLE_SWINGS
```
4) DeletePlayer sent delete to http://localhost:8080/{id}

