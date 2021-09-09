package guanabara.javapoo.aula09;

public class Funcionario extends Pessoa {

    //Atributos
    private String setor;
    private boolean trabalhando;

    //Métodos Especiais
    //GET e SET
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //Métodos Públicos
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }
}
