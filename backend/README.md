
## Running app

$ docker compose up --build

After app get up and running, two mongo container must be set as replica for Drink service.
For this run commands below:

1. docker exec < containerid from "docker ps" command > -it mongosh
2. config={_id:_id="mongo-set",members:members=[{_id:0,host:"drinks-menu-db:27017"},{_id:1,host:"drinks-menu-replica-db:27017"}]};
3. rs.initiate(config);
###### * sharding will be added *