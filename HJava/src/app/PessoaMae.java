package app;

/**
 * PessoaMae
 */
public class PessoaMae { //SUPERCLASS - CLASSE MÃE
  //os atributos e métodos desta classe podem ser utilizados pelas subclasses!
    private String nome; 
    private int idade;
    private String sexo;


    public void fazerAniver(){
        this.idade ++;
    }

    //Métodos Especiais
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    //método toString

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", sexo='" + getSexo() + "'" + 
            "}";
    }


}