**Questão 1**

Tem o objetivo de manter o encapsulamento. Somente a própria classe pode acessar e modificar seus atributos; as outras só acessam por meio de serviços.

**Questão 2**

Para representar um livro em um sistema de controle de biblioteca:

Título
Autor(es)
Editora
Ano de publicação
ISBN (Identificador único do livro)
Gênero ou categoria
Número de páginas
Quantidade de exemplares disponíveis
Código de identificação (ID interno)
Status (disponível, emprestado, reservado etc.)

Podemos dizer que a classe Livro é uma abstração porque ela representa, de forma simplificada e lógica, os principais atributos e comportamentos de um livro real dentro do contexto do sistema. Ou seja, ela abstrai os detalhes físicos e traz apenas aquilo que é necessário para a funcionalidade do sistema, como título, autor, disponibilidade e ações relacionadas ao livro.

emprestar() – Registra que o livro foi emprestado, reduzindo o número de exemplares disponíveis.

devolver() – Registra a devolução de um livro, aumentando o número de exemplares disponíveis.

estaDisponivel() – Verifica se o livro está disponível para empréstimo com base na quantidade em estoque.
