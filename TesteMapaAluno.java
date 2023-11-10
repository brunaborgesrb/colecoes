import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Map<Integer, Aluno> mapaAlunos = new HashMap<>();
        
        Aluno aluno1 = new Aluno(1, 20, "Manuela", "Arquitetura");
        Aluno aluno2 = new Aluno(2, 20, "Emiy", "Medicina");
        Aluno aluno3 = new Aluno(3, 19, "Stella", "Publicidade");
        Aluno aluno4 = new Aluno(4, 18, "Marcos", "Biologia");
        Aluno aluno5 = new Aluno(5, 25, "Alice", "Direito");
        
        mapaAlunos.put(aluno1.getMatricula(), aluno1);
        mapaAlunos.put(aluno2.getMatricula(), aluno2);
        mapaAlunos.put(aluno3.getMatricula(), aluno3);
        mapaAlunos.put(aluno4.getMatricula(), aluno4);
        mapaAlunos.put(aluno5.getMatricula(), aluno5);

        Scanner s = new Scanner(System.in);
        System.out.print("Digite a matrícula do aluno: ");
        int matricula = s.nextInt();

        if (mapaAlunos.containsKey(matricula)) {
            Aluno aluno = mapaAlunos.get(matricula);
            System.out.println("Dados do aluno:");
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
}