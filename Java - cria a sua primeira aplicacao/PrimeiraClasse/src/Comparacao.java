public class Comparacao {
    String senha = "12345";
    String senhaDois = "tabacoDamassa";
    
    public void comparacao(){
        if (senha.equals(senhaDois)) {
            System.out.println("Acesso autorizado");
        } else{
            System.out.println("Senha incorreta");
        }
    }
}
