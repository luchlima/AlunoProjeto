public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas", 10, 6);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("1- Bimestre: " + aluno.getNotaUm());
        System.out.println("2- Bimestre: " + aluno.getNotaDois());
        System.out.println("Media Final: " + aluno.calcularMedia());

    }
}
