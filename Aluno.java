public class Aluno {
    
    //atributos
    int matricula;
    int idade;
    String nome;
    String curso;


    public Aluno(int matricula, int idade, String nome, String curso) {
        this.matricula = matricula;
        this.idade = idade;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
