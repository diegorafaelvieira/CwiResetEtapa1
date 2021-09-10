package guanabara.javapoo.aula10b;

public class Mamifero extends Animal {

    //Atributos
    protected String corPelo;

    //Métodos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
}
