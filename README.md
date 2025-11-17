# workshop-springboot-jpa

Projeto exemplo de aplicação Spring Boot com JPA para Web Services REST.

---

## Descrição

Este projeto tem como objetivo demonstrar a construção de um Web Service baseado em Spring Boot utilizando JPA para persistência de dados, seguindo boas práticas de organização de código em camadas (entidades, repositórios, recursos e serviços).

---

## Estrutura de Pastas

```
└── 📁 projetoWebServices
    ├── 📁 .mvn
    │   └── 📁 wrapper
    │       └── 📄 maven-wrapper.properties
    ├── 📁 src
    │   ├── 📁 main
    │   │   ├── 📁 java
    │   │   │   └── 📁 projetoWebServices
    │   │   │       ├── 📁 config
    │   │   │       │   └── ☕ TestConfig.java
    │   │   │       ├── 📁 entities
    │   │   │       │   ├── 📁 enums
    │   │   │       │   │   └── ☕ OrderStatus.java
    │   │   │       │   ├── ☕ Category.java
    │   │   │       │   ├── ☕ Order.java
    │   │   │       │   ├── ☕ Product.java
    │   │   │       │   └── ☕ User.java
    │   │   │       ├── 📁 repositories
    │   │   │       │   ├── ☕ CategoryRepository.java
    │   │   │       │   ├── ☕ OrderRepository.java
    │   │   │       │   ├── ☕ ProductRepository.java
    │   │   │       │   └── ☕ UserRepository.java
    │   │   │       ├── 📁 resources
    │   │   │       │   ├── ☕ CategoryResource.java
    │   │   │       │   ├── ☕ OrderResource.java
    │   │   │       │   ├── ☕ ProductResource.java
    │   │   │       │   └── ☕ UserResource.java
    │   │   │       ├── 📁 services
    │   │   │       │   ├── ☕ CategoryService.java
    │   │   │       │   ├── ☕ OrderService.java
    │   │   │       │   ├── ☕ ProductService.java
    │   │   │       │   └── ☕ UserService.java
    │   │   │       └── ☕ ProjetoWebServicesApplication.java
    │   │   └── 📁 resources
    │   │       ├── 📄 application-test.properties
    │   │       └── 📄 application.properties
    │   └── 📁 test
    │       └── 📁 java
    │           └── 📁 projetoWebServices
    │               └── ☕ ProjetoWebServicesApplicationTests.java
    ├── ⚙️ .gitattributes
    ├── ⚙️ .gitignore
    ├── 📄 mvnw
    ├── 📄 mvnw.cmd
    └── ⚙️ pom.xml
```

---

## Principais Componentes

- **Entidades:** `User`, `Order`, `Category` e enums (`OrderStatus`)
- **Repositórios:** Interfaces para acesso ao banco de dados (`UserRepository`, etc.)
- **Recursos:** APIs REST (`UserResource`, `OrderResource`, etc.)
- **Serviços:** Lógica de negócio e integração entre recursos e repositórios
- **Configuração:** `TestConfig` para configuração de testes.
- **Testes:** Classe de teste principal

---

## Como Executar

1. **Pré-requisitos:**
   - Java 21+
   - Maven 3.8+ (ou superior)

2. **Dependências:**
   Certifique-se de que o arquivo `pom.xml` possui todas as dependências instaladas

3. **Executando o projeto:**
   Com as dependências instaladas, basta rodar a classe principal do projeto. No terminal, execute:
   
```
./mvnw spring-boot:run
```
**Ou:** execute diretamente `ProjetoWebServicesApplication.java` localizado em `src/main/java/projetoWebServices/ProjetoWebServicesApplication.java` utilizando sua IDE.

4. **Acesso:**  
O serviço ficará disponível em: `http://localhost:8080`

---

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- H2 Database (para testes)
- Maven

---

## Contribuição

Sinta-se à vontade para abrir issues e pull requests para sugestões, correções ou novas funcionalidades!
