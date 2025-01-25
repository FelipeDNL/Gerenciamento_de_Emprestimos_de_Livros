# Gerenciamento de Emprestimos de Livros

Este projeto consiste em um sistema de gerenciamento de registros, com foco específico na administração de empréstimos de livros, semelhante ao funcionamento de uma biblioteca. Ele permite aos usuários gerenciar os registros relacionados a livros, pessoas e empréstimos, utilizando o MySQL como banco de dados para garantir a organização e a persistência dos dados.

## MySQL
Como um forma de visualizar como os dados foram guardados, pode ser consultado o diagrama abaixo. A tabela relacional `emprestimo` contém triggers para manter a contagem de livros disponíveis automaticamente.

<p align="center">
  <img height='330' src="https://github.com/user-attachments/assets/90660158-8271-4412-ab62-163d25360aa6">
</p>


## Java Swing e Interface Gráfica do Projeto
O sistema utiliza a linguagem Java em conjunto com a biblioteca Swing para desenvolver a interface gráfica.

Antes de entrar no sistema é necessário que o usuário entre com login e senha, previamente cadastrados no banco de dados (passos inclusos na pasta `AdicionaisMySQL`).

<p align="center">
  <img height='270' src="https://github.com/user-attachments/assets/8a530932-4aa0-44a0-9e1e-50b4ce51a3df">
</p>

Ao entrar com o login correto o usuário então será apresentado com a tela principal de funções. Podendo atualizar, remover e cadastrar livros, pessoas e emprestimos. Como os dados possuem persistência em um banco de dados, qualquer alteração realizada é refletida automaticamente nas informações exibidas ao usuário.

<p align='center'>
  <img height='400' src='https://github.com/user-attachments/assets/5eaaff2b-e138-4b47-a342-9675da6830b8'>
</p>

Para alterar adicionar algum cadastro novo, a interface é a seguinte:

<p align='center'>
  <img height='250' src='https://github.com/user-attachments/assets/c3285de2-b0ad-4a2c-9761-9f69c2a346a1'>
</p>

### Observações
- O projeto utiliza o NetBeans como IDE, conforme indicado pelos arquivos de configuração e estrutura de diretórios.
- A interface gráfica é construída usando formulários Swing (.form), que são arquivos XML gerados pelo NetBeans para definir a interface do usuário.
- O projeto inclui várias operações de banco de dados, como inserção, atualização e exclusão de registros, utilizando PreparedStatement para evitar SQL injection.
> Trabalho final da displicina de Banco de Dados de 2023.1
