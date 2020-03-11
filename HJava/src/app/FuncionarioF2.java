package app;

/**
 * FuncionarioF2
 */
public class FuncionarioF2 extends PessoaMae {
    private String setor;
    private boolean trabalhando;


    public void mudarTrabalho(){

    }


    //Métodos Especiais
    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }


    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}