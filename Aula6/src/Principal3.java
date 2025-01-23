
public class Principal3 {
    public static void main(String[] args) {
        Palindromo a = new Palindromo("amor");

        a.ehPalindromo();
        System.out.println("Quantidade de vogais: " + a.vogais());
        System.out.print("Inverso da palavra: ");
        a.imprimeInverso();
    }
}
