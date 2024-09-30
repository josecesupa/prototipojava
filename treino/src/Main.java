import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorEventos gerenciador = new GerenciadorEventos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Evento");
            System.out.println("2. Listar Eventos");
            System.out.println("3. Inscrever Participante");
            System.out.println("4. Buscar Evento");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do evento: ");
                    String nome = scanner.nextLine();
                    System.out.print("Data do evento: ");
                    String data = scanner.nextLine();
                    System.out.print("Local do evento: ");
                    String local = scanner.nextLine();
                    System.out.print("Capacidade máxima: ");
                    int capacidadeMaxima = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    Evento evento = new Evento(nome, data, local, capacidadeMaxima);
                    gerenciador.cadastrarEvento(evento);
                    break;

                case 2:
                    gerenciador.listarEventos();
                    break;

                case 3:
                    System.out.print("Digite o nome do evento para inscrição: ");
                    String nomeEventoInscricao = scanner.nextLine();
                    Evento eventoInscricao = gerenciador.buscarEventoPorNome(nomeEventoInscricao);
                    if (eventoInscricao != null) {
                        eventoInscricao.inscreverParticipante();
                        System.out.println("Participante inscrito com sucesso.");
                    } else {
                        System.out.println("Evento não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do evento para busca: ");
                    String nomeEventoBusca = scanner.nextLine();
                    Evento eventoBuscado = gerenciador.buscarEventoPorNome(nomeEventoBusca);
                    if (eventoBuscado != null) {
                        System.out.println(eventoBuscado.detalhes());
                    } else {
                        System.out.println("Evento não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}


