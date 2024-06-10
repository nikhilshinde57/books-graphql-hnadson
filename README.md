# books-graphql-handson
This is a demonstration of how to create APIs in GraphQL with Spring Boot





## Tech Stack


**Server:** Java 17, Spring Boot 3.1.1, GraphQL

**Client:** Insomnia, GraphQL Playground
## Run Locally

Clone the project

```bash
  git clone https://github.com/nikhilshinde57/books-graphql-handson
```

Open project in IntelliJ or an preferred IDE

```bash
  open project from IDE
```

Build Project

```bash
  mvn clean install -U
```

Run the project 

Testing Endpoint

Get All Books Query 
```bash
  curl --request POST \
  --url http://localhost:8080/graphql \
  --header 'Content-Type: application/json' \
  --data '{"query":"{\n  allBooks {\n    id\n    title\n    pages\n    author {\n      name\n    }\n  }\n}"}'
```

Get Book By Id Query
```bash
  curl --request POST \
  --url http://localhost:8080/graphql \
  --header 'Content-Type: application/json' \
  --data '{"query":"{\n  bookById (id: 102){\n    id\n    title\n    pages\n    author {\n      name\n    }\n  }\n}"}'
```

Update Book By Id 
```bash
  curl --request POST \
  --url http://localhost:8080/graphql \
  --header 'Content-Type: application/json' \
  --data '{"query":"mutation {\n    updateBook(id:102, title: \"Java World v3\") {\n        id\n        title\n        pages\n    }\n}"}'
```