package app;

public class App {
    public static void main(String[] args) throws Exception {
       PessoaMae pessoa = new PessoaMae();
       AlunoF1 aluno = new AlunoF1();
       FuncionarioF2 funcionario = new FuncionarioF2();
       ProfessorF3 professor = new ProfessorF3(); 

       pessoa.setNome("Marcos");
       pessoa.setIdade(28);
       pessoa.setSexo("M");

       aluno.setNome("Goku"); // aluno pode receber um nome pq ele herda de PessoaMae
       aluno.setIdade(20); // aluno pode receber uma idade pq ele herda de PessoaMae
       aluno.setSexo("M"); // aluno pode receber um sexo pq ele herda de PessoaMae

       funcionario.setNome("Carlinhos");
       funcionario.setIdade(50);
       funcionario.setSexo("M");

       professor.setNome("Juliana");
       professor.setIdade(40);
       professor.setSexo("F");

       
       aluno.setCurso("Informática");
       funcionario.setSetor("CPD");
       professor.setSalario(4.000f);

       System.out.println(pessoa.toString());
       System.out.println(aluno.toString());
       System.out.println(funcionario.toString());
       System.out.println(professor.toString());
    }
}