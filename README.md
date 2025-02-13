# CRUD de Clientes com Angular e Spring Boot 🚀  

Este projeto é um CRUD de clientes desenvolvido para fins de aprendizado, utilizando **Angular 17** no frontend e **Spring Boot 2.4.4** no backend.  

## 🛠 Tecnologias utilizadas  
- **Frontend**: Angular 17 (pasta `api-front`)  
- **Backend**: Spring Boot 2.4.4 (pasta `api`)  
- **Banco de Dados**: H2 (banco em memória para testes)  
- **Comunicação**: API REST (Spring Web)  

## 📌 Funcionalidades  
- Criar, listar, atualizar e deletar clientes  
- Interface simples e responsiva com Angular  
- Integração entre frontend e backend via API REST  
- Banco de dados H2 para testes rápidos  

## 📂 Estrutura do projeto  
O projeto é dividido em duas pastas principais:  
- **`api-front/`**: Contém o código do frontend desenvolvido em **Angular**.  
- **`api/`**: Contém o código do backend desenvolvido em **Spring Boot**.  

```plaintext
meu-projeto-crud/
│── api-front/  # Código do Angular (Frontend)
│   ├── src/
│   ├── package.json
│   └── ...
│
│── api/   # Código do Spring Boot (Backend)
│   ├── src/main/java/com/exemplo/crud/
│   ├── pom.xml
│   └── ...
│
│── README.md  # Este arquivo
│── .gitignore
│── docker-compose.yml (opcional)
```

## 🚀 Como executar o projeto  

### Backend (Spring Boot)  
1. Acesse a pasta `api/`  
2. Execute o projeto:  
   ```sh
   mvn spring-boot:run
   ```
3. O backend estará disponível em `http://localhost:8080`  

### Frontend (Angular)  
1. Acesse a pasta `api-front/`  
2. Instale as dependências:  
   ```sh
   npm install
   ```
3. Rode o servidor Angular:  
   ```sh
   ng serve
   ```
4. Acesse `http://localhost:4200` no navegador  

## 📌 API Endpoints  
Os endpoints seguem as melhores práticas REST e utilizam **verbos HTTP**:

| Método  | Descrição                      |
|---------|--------------------------------|
| **GET**    | Lista todos os clientes      |
| **POST**   | Cria um novo cliente        |
| **PUT**    | Atualiza um cliente (body como parâmetro) |
| **DELETE** | Remove um cliente (código no path) |

### Estrutura do Objeto Cliente:

O objeto **cliente** é composto pelos seguintes campos:  
```json
{
  "codigo": 1,
  "nome": "João Silva",
  "idade": 30,
  "cidade": "São Paulo"
}
```

### Exemplos de Requisições:

1. **GET** - Lista todos os clientes:  
```http
GET http://localhost:8080
```

2. **POST** - Cria um novo cliente (requisição com body):  
```http
POST http://localhost:8080
Content-Type: application/json

{
  "codigo": 1,
  "nome": "João Silva",
  "idade": 30,
  "cidade": "São Paulo"
}
```

3. **PUT** - Atualiza um cliente (requisição com body):  
```http
PUT http://localhost:8080
Content-Type: application/json

{
  "codigo": 1,
  "nome": "João Silva",
  "idade": 31,
  "cidade": "Rio de Janeiro"
}
```

4. **DELETE** - Remove um cliente (código no path):  
```http
DELETE http://localhost:8080/{codigo}
```
Exemplo de requisição para deletar o cliente com código 1:  
```http
DELETE http://localhost:8080/1
```

## 🎯 Objetivo do projeto  
Este projeto foi desenvolvido para praticar o desenvolvimento full-stack utilizando **Angular e Spring Boot**, aplicando conceitos como:  
✅ Consumo de API REST com Angular  
✅ CRUD básico no backend com Spring Boot  
✅ Uso de banco de dados em memória (H2)  
✅ Separação de responsabilidades entre frontend e backend  

## 📝 Licença  
Este projeto é livre para estudos e aprimoramento pessoal.  
