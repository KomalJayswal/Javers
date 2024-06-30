# Javers

### Docker command to start mongoDB instance in our local

```
docker run --name mongodb -p 27017:27017 -e MONGODB_USERNAME=test_user -e MONGODB_ROOT_PASSWORD=root_password -e MONGODB_PASSWORD=test_password -e MONGODB_DATABASE=test_database -d bitnami/mongodb:latest
```

### Add Profile

Edit configuration -> modify options -> Add VM options
```
-Dspring.profiles.active=local
```

### Connection String
```
mongodb://test_user:test_password@localhost:27017/?authMechanism=SCRAM-SHA-1&authSource=test_database
```