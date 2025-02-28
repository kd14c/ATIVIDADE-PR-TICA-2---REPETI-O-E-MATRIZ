import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] dados = {
            {"usuario1", "senha1"},
            {"usuario2", "senha2"},
            {"usuario3", "senha3"},
            {"usuario4", "senha4"},
            {"usuario5", "senha5"},
            {"usuario6", "senha6"}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String login = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        boolean loginValido = false;
        for (int i = 0; i < dados.length; i++) 
        {
            if (dados[i][0].equals(login) && dados[i][1].equals(senha)) 
            {
                loginValido = true;
                break;
            }
        }

        if (loginValido) 
        {
            System.out.println("Login e senha conferem! Acesso permitido.");
        }
        else 
        {
            System.out.println("Login ou senha inválidos. Acesso negado.");
        }

    }
}