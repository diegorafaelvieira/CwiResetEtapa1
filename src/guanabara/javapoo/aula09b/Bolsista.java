package guanabara.javapoo.aula09b;

public class Bolsista extends  Aluno {

    //Atributos
    private float bolsa;


    //GET e SET
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    //Métodos Públicos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado!");
    }
}
