
Criar o projeto:
https://start.spring.io/ 

Adicionar as seguintes dependências:
1. Spring Data JPA
2. Spring Web Starter
3. Mysql Driver
4. Lombok


https://github.com/cassioseffrin/projetoAulaSpring




#iniciando uma base de dados no mysql zerada:

#/path/bin/mysql -p -u root
mysql> create database classe;
mysql> create user 'cassio'@'%' identified by 'senha123';
mysql> grant all on classe.* to 'cassio'@'%';
