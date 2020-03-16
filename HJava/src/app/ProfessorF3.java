package app;

/**
 * ProfessorF3
 */
public class ProfessorF3 extends PessoaMae {
    private String especialidade;
    private float salario;


    public void receberAum(float aum){
        this.salario += aum;
    }


    //Métodos Especiais
    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}