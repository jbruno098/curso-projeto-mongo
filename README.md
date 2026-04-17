# 📌 API de Posts com Spring Boot e MongoDB

Este projeto foi desenvolvido como parte dos meus estudos em **Java e Spring Boot**, com foco na construção de uma **API RESTful** utilizando **MongoDB** como banco de dados.

A aplicação simula um sistema de posts com usuários e comentários, abordando conceitos importantes de backend moderno.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data MongoDB
- Maven
- MongoDB
- Postman (para testes)

---

## 📚 Funcionalidades

- CRUD de usuários
- Busca de usuários por ID
- CRUD de posts
- Comentários em posts
- Busca de posts por:
  - título (ignorando maiúsculas/minúsculas)
  - texto presente no título, corpo ou comentários
  - intervalo de datas
- Tratamento de exceções customizado
- Uso de DTO para controle de dados
- Queries personalizadas com `@Query`

---

## 🧠 Conceitos aplicados

Durante o desenvolvimento, foram praticados conceitos importantes como:

- API REST
- Arquitetura em camadas (Controller, Service, Repository)
- DTO (Data Transfer Object)
- Tratamento de exceções com `@ControllerAdvice`
- Query Methods do Spring Data
- Consultas customizadas com MongoDB
- Modelagem NoSQL
- Uso de `@DBRef` e carregamento lazy
- Versionamento com Git

---

## 🔎 Exemplos de endpoints

### Buscar todos os usuários

GET /users

### Buscar usuário por ID

GET /users/{id}

### Buscar posts por título

GET /posts/titlesearch?text=viagem

### Buscar posts por texto e intervalo de datas

GET /posts/findbydates?text=dia&minDate=2018-03-20&maxDate=2018-03-23

---

## 🧪 Como executar o projeto

1. Clone o repositório:

git clone https://github.com/jbruno098/curso-projeto-mongo

2. Abra o projeto em uma IDE (IntelliJ recomendado)

3. Execute a aplicação

4. Utilize o Postman ou navegador para testar os endpoints

---

## 💡 Aprendizados

Este projeto foi muito importante para consolidar conhecimentos em:

- desenvolvimento de APIs com Spring Boot
- integração com banco NoSQL (MongoDB)
- organização de código em camadas
- tratamento de erros em aplicações reais
- uso do Git no fluxo de desenvolvimento

---

## 📎 Autor

**Joelson Bruno Costa Rodrigues**

- GitHub: https://github.com/jbruno098
- LinkedIn: linkedin.com/in/joelson-bruno-734106389

---

## ⭐ Considerações finais

Este projeto faz parte da minha evolução como desenvolvedor backend.  
Estou continuamente buscando melhorar e aprender novas tecnologias.
