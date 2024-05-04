import java.util.ArrayList;
import java.util.Scanner;

class Nota {
    
    private String titulo;
    private String conteudo;

    public Nota(String titulo, String conteudo) 
    {

this.titulo = titulo;
this.conteudo = conteudo;

    }

    public String getTitulo() 
    {

    return titulo;

    }

    public String getConteudo() 
    
    {

    return conteudo;

    }
}

public class blocoDeNotas {

    private static ArrayList<Nota> 
    notas = new ArrayList<>();

    private static Scanner 
    scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        boolean executando = true;

    while (executando) {

        System.out.println("Selecione uma opção: \n");
        System.out.println("1. Adicionar uma nota.\n");
        System.out.println("2. Ver notas.\n");
        System.out.println("3. Fechar AppNotas. \n");

        int opcao = scanner.nextInt();

        switch (opcao) {

            case 1:

                adicionarNota();

                break;

            case 2:

                verNotas();

                break;

            case 3:

                executando =  false;

        System.out.println("Encerrando ...");

            default:
        System.out.println("Opção inválida.Tente novamente.");
        }

        
    }

    scanner.close();

    }

    private static void adicionarNota() 
    {

        System.out.println("Digite o título da nota: ");
        scanner.nextLine();
        String titulo = scanner.nextLine();

        System.out.println("Digite o conteudo da nota: \n");
        String conteudo = scanner.nextLine();

        Nota nota = new Nota(titulo, conteudo);
        notas.add(nota);

        System.out.println("Nova nota adicionada com sucesso! \n");

    }
    private static void verNotas() 
    {

        if (notas.isEmpty())
        {
            System.out.println("Nenhuma nota encontrada. \n");
        }
        else 
        {
            System.out.println("Notas: ");

            for (int i = 0 ; i < notas.size() ; i++)
            {

            Nota nota = notas.get(i);
            System.out.println((i + 1) + ". Título: " + nota.getTitulo());
            System.out.println("conteúdo: " + nota.getConteudo());
            
            }
        }
    }
}