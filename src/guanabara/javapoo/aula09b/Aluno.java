package guanabara.javapoo.aula09b;

public class Aluno extends  Pessoa {

    //Atributos
    private int matricula;
    private String curso;

    //GET e SET
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Métodos Especiais
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

}
