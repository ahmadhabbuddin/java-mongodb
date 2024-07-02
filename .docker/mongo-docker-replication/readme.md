# DEPLOYMENT
1. Pada file mongod.conf disabled bagian security
2. kemudian jalankan perintah berikut
```
$ docker compose up -d
```

# LOGIN CONTAINER
```
$ docker exec -it mongodb1 /bin/bash
```

# SET REPLICA
```
$ mongosh
$ rs.initiate({
  _id: "rs0",
  members: [
    { _id: 0, host: "mongodb1:27017" },
    { _id: 1, host: "mongodb2:27017" },
    { _id: 2, host: "mongodb3:27017" }
  ]
})
$ rs.status()
```

# SET USER RBAC
```
$ use admin;
$ db.createUser({
  user: "root",
  pwd: "root",
  roles: [ { role: "root", db: "admin" } ]
});
$ db.getCollectionNames();
$ db.system.users.find()
```

# ENABLE SECURITY
1. pada file mongod.conf enabled kembali bagian security
2. restart 1 per 1 container mongo db
```
$ docker restart mongodb1
$ docker restart mongodb2
$ docker restart mongodb3
```
3. tunggu hingga beberapa menit, agar node atau container berjalan normal kembali.

# SELESAI
1. lakukan login mongodb menggunakan user yang sudah dibuat
2. docker exec -it mongodb1 /bin/bash
3. mongosh "mongodb://root:root@localhost:27017/?authSource=admin"

note: lakukan login untuk ketiga container, memastikan bahwa user yang dibuat telah di replikasi ke semua container mongodb.