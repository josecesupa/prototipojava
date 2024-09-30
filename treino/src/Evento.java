public class Evento {
    private String nome;
    private String data;
    private String local;
    private int capacidadeMaxima;
    private int vagasDisponiveis;

    public Evento(String nome, String data, String local, int capacidadeMaxima) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
        this.vagasDisponiveis = capacidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void inscreverParticipante() {
        if (vagasDisponiveis > 0) {
            vagasDisponiveis--;
        } else {
            System.out.println("Evento esgotado.");
        }
    }

    public String detalhes() {
        return String.format("Nome: %s, Data: %s, Local: %s, Vagas: %d", nome, data, local, vagasDisponiveis);
    }
}
