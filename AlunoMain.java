import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite os dados do Aluno " + i + ":");
            System.out.print("Matrícula: ");
            int matricula = s.nextInt();
            System.out.print("Idade: ");
            String nome = s.nextLine();
            System.out.print("Nome: ");
            int idade = s.nextInt();
            System.out.print("Curso: ");
            String curso = s.nextLine();

            Aluno aluno = new Aluno(matricula, idade, nome, curso);
            cadastro.adicionarAluno(aluno);
        }

        System.out.println("Lista de Alunos:");
        cadastro.imprimirListaAlunos();
    
    }
}
