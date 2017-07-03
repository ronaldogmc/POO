package enterprise;

public class Pessoa {

    private String nome;
    private String sobrenome;

    public Pessoa() {

    }

    public Pessoa(String nomep, String sobrenomep) {
        nome = nomep;
        sobrenome = sobrenomep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getFullName() {
        return sobrenome + "," + nome;
    }

    public static void main(String[] args) {
        Pessoa humano = new Pessoa("Ronaldo", "Guimaraes");
        System.out.println(humano.getFullName());

    }

}
