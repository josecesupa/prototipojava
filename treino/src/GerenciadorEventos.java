import java.util.ArrayList;

public class GerenciadorEventos {
    private ArrayList<Evento> eventos;

    public GerenciadorEventos() {
        eventos = new ArrayList<>();
    }

    public void cadastrarEvento(Evento evento) {
        if (eventos.size() < 10) {
            eventos.add(evento);
            System.out.println("Evento cadastrado com sucesso.");
        } else {
            System.out.println("Limite de eventos atingido.");
        }
    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
            return;
        }
        for (Evento evento : eventos) {
            System.out.println(evento.detalhes());
        }
    }

    public Evento buscarEventoPorNome(String nome) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nome)) {
                return evento;
            }
        }
        return null; // Evento não encontrado
    }
}
