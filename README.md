# Sistema-de-Gerenciamento-de-Registros

Utilizando o mesmo sistema entregue do exercício anterior, o próximo passo de desenvolvimento é gerenciar os dados que entram e são removidos do projeto. Para tal, é necessário rever o que já foi feito:

- Sistema de login e registro de dados; O registro de pessoa é guardado no banco de dados, e o login verifica a existência de um registro de acesso e permite a entrada do sistema através de um front end;

Logo, é possível afirmar que o básico da estrutura de comunicação com o BD já foi criado. Portanto, para continuar o sistema, deve-se levar em consideração a lógica de uso do sistema para estruturar o BD da melhor forma. Com isso, o que deve ser feito:

- Ao fazer login, na tela inicial do front ou prompt deve informar ou manter informado o usuário logado na sessão.

- Deve ser possível deslogar. Com isso, o sistema só fica acessível a quem estiver logado;

- Uma vez logado, é possível cadastrar pessoas como já estava sendo feito. Porém, adicionalmente, deve ser possível alterar e remover o registro do BD via front;

- Agora com o registro da pessoa, pode ser feito o registro de login para ela. Assim, será possível adicionar vários registros de login e senha distintos para fazer acesso;

- Como terão vários logins, é preciso ter registro Log para anotar as ações. Por exemplo, quando alguém logado edita ou remove um cadastro, no log deve ficar registrado quem o fez, a que horas, dia, mês, ano e o tipo de alteração. 

- A lógica de programação para o tratamento destas informações e interações são de responsabilidade do desenvolvedor,  o que significa que deve ser feito de modo a evitar problemas de redundância, incoesão e falhas de segurança.

Com isso, o aluno terá aplicado boa parte do conteúdo, bem como praticado o desenvolvimento puro do banco e compartilhado com a própria experiência do front e da linguagem escolhida. 
