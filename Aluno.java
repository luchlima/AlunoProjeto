public class Aluno {
    private String nome;
    private double notaUm;
    private double notaDois;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.notaUm = nota1;
        this.notaDois = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public double calcularMedia(){
        return (notaUm + notaDois) / 2;
    }
}
