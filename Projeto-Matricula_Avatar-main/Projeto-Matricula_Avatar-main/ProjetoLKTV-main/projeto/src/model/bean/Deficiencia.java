package model.bean;

public class Deficiencia {
    private int id;
    private String nome;

    public Deficiencia(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome; // assim o combo mostra o nome, mas mantém o objeto
    }
}
