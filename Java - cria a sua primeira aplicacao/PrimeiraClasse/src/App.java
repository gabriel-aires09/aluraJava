public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este e o Screen Match");
        Comparacao comparacaoMassa = new Comparacao();
        int anoDeLancamento = 2022;

        int x = 10;
        // Convertendo variaveis
        String y = Integer.toString(x);

        float z = (int) x;

        /* text block, suportado a partir do Java 15
        String sinopse = """
                Filme Top Gun
                Filme de Aventura com gala dos anos 80
                Muito bom!
                Ano de Lançamento
                """ + anoDeLancamento;
        String sinopse = """
                Filme Top Gun
                Filme de Aventura com gala dos anos 80
                Muito bom!
                Ano de Lancamento:""";
        */

        // comparacaoMassa.comparacao();
        System.out.println(y);
        System.out.println(((Object)x).getClass().getSimpleName());
        System.out.println(((Object)z).getClass().getSimpleName());
        System.out.println("Ola " + x);
    }
}
