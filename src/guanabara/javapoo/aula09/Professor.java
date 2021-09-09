package guanabara.javapoo.aula09;

public class Professor extends Pessoa {

    //Atributos
    private String especilidade;
    private float salario;

    //Métodos Especiais
    //GET e SET
    public String getEspecilidade() {
        return especilidade;
    }

    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //Métodos Públicos
    public void receberAumento(float aum) {
        this.salario += aum;
    }
}
