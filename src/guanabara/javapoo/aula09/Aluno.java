package guanabara.javapoo.aula09;

public class Aluno extends Pessoa {

    //Atributos
    private int mat;
    private String curso;

    //Métodos Especiais
    //GET e SET
    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    //Métodos Públicos
    public void cancelarMatricula() {
        System.out.println("Matrícula será cancelada");
    }
}
