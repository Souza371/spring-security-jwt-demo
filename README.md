# Crie um README completo para seu projeto
cat > README.md << 'EOF'
# 🔐 Spring Security JWT Demo

Uma API completa de autenticação construída com Spring Boot 3, Spring Security 6 e JSON Web Tokens (JWT). Este projeto demonstra as melhores práticas para implementação de autenticação stateless em APIs RESTful.

## 🚀 Funcionalidades

- **Registro de usuários** com validação de dados
- **Login com autenticação JWT**
- **Proteção de endpoints** com Spring Security
- **Tokens com expiração** e renovação automática
- **Documentação interativa** com Swagger/OpenAPI
- **Banco de dados em memória** H2 para desenvolvimento

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.2.5**
- **Spring Security 6**
- **JSON Web Tokens (JWT)**
- **Spring Data JPA**
- **H2 Database** (em memória)
- **Lombok** - Redução de boilerplate
- **MapStruct** - Mapeamento entre DTOs e entidades
- **SpringDoc OpenAPI** - Documentação automática
- **Maven** - Gerenciamento de dependências

## 📦 Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6+ 
- Git

### Clone e execução
```bash
# Clone o repositório
git clone https://github.com/Souza371/spring-security-jwt-demo.git

# Acesse o diretório
cd spring-security-jwt-demo

# Execute a aplicação
./mvnw spring-boot:run
