package app;

/**
 * AlunoF1
 */
public class AlunoF1 extends PessoaMae {
     private String matricula;
     private String curso;
    



     public void cancelarMatricula(){

     }

     //Métodos Especiais
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}