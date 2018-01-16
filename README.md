# compojure-api-setup

Simple example application using [compojure-api](https://github.com/metosin/compojure-api), with added database migrations and seeds.

## Usage

### Run the migrations

First make sure that the database ```compojure_api_dev``` exists.

This project uses the [migratus](https://github.com/yogthos/migratus) library, to run the migrations to initialize the database, simply run:

```
lein migratus migrate
```

This command will also seed the newly created database.

### Run the application locally

Run the following command:

```
lein run
```

You will have it up and running in port 3000. Then you can just simply navigate to [http://localhost:3000](http://localhost:3000) and start using the beautiful Swagger UI interface.

### Packaging and running as standalone jar

```
lein do clean, ring uberjar
java -jar target/server.jar
```

### Packaging as war

```
lein ring uberwar
```
