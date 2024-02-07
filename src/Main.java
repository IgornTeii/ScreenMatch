public class Main {
    public static void main(String[] args) {
        System.out.println("Este é o Screen Match!");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("O filme foi lançado em: " + anoDeLancamento);
        boolean planoAssinatura = true;
        double notaDoFilme = 8.1;
        System.out.println("O filme esta no seu plano: " + planoAssinatura);
        System.out.println("A nota do Filme é: " + notaDoFilme);

        String sinopse;
        sinopse = """
                Top Gun Maverick
                Exelente filme pela midia
                Ano de lancamento
                """ +  anoDeLancamento;

        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(media);
        System.out.println(sinopse);



        String senha = "12345";
        if (senha.equals("12345")){
            System.out.println("Acesso autorizado!");
        }else{
            System.out.println("Acesso negado!");
        }

        String nome = "Igor";
        int idade = 19;
        double valor = 250.98;

        System.out.println(String.format("Meu nome é %s, tenho %d e atualmente tenho na minha conta do C6 bank %f!", nome, idade, valor));

    }
}


