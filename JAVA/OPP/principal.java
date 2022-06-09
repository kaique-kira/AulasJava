public class principal {
    public static void main(String[] args) {
        classes User1 = new classes();
        endereco end = new endereco();
        User1.endereco=end;
        User1.Nome = "Kaique";
        User1.SobreNome = "Denobi Felipe";
        User1.Idade = 28;
        User1.Salario = 1600.00;
        User1.endereco.Rua = "Hermes da Fonseca";
        User1.endereco.Numero = "25";
        User1.endereco.Bairro = "Jardim Cinira";
        User1.endereco.Cep = "06857-510";
        String fullName = User1.GetFullName();
        User1.setLogged(true);

        System.out.printf("Nome: %s, Idade: %d e Salario: R$%f Mora na rua: %s, Nº%s", fullName, User1.Idade,
                User1.Salario, User1.endereco.Rua, User1.endereco.Numero);

    }
}