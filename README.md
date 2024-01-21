# Magiavventure - Lib mongo
![GitHub Release](https://img.shields.io/github/v/release/Magiavventure/lib-mongo)
![GitHub Actions Workflow Status](https://img.shields.io/github/actions/workflow/status/Magiavventure/lib-mongo/build.yml)

This library takes care of connecting to mongodb and defining entities

## Configuration

The properties exposed to configure this project are:

```properties
spring.data.mongodb.uri="string"                           # Uri for mongo connection
spring.data.mongodb.uuid-representation="string"           # Format representation for uuid - use default
spring.data.mongodb.auto-index-creation=boolean            # Create index automatically
```