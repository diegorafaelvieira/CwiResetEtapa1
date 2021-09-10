package guanabara.javapoo.aula10;

public class Peixe extends Animal {

    //Atributos
    private String corEscama;


    //Métodos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Soltou uma bolha");
    }

    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    //GET e SET
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
