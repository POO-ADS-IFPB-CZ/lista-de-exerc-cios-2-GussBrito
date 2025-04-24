**Questão 1**
Tem o objetivo de manter o encapsulamento. Somente a própria classe pode acessar e modificar seus atributos; as outras só acessam por meio de serviços.
**Ex:**
public class Pessoa {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 150) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
}

**Questão 2**
**a**
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

**b**
Livro é uma abstração porque ela representa, de forma simplificada e lógica, os principais atributos e comportamentos de um livro real dentro do contexto do sistema.

**c**
emprestar() – Registra que o livro foi emprestado, reduzindo o número de exemplares disponíveis.
devolver() – Registra a devolução de um livro, aumentando o número de exemplares disponíveis.
estaDisponivel() – Verifica se o livro está disponível para empréstimo com base na quantidade em estoque.
