public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar(String numero) {
        System.out.println("Iphone Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Verificando mensagens: ");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando a pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova página: ");

    }

    @Override
    public void atualizarPagina() {

        System.out.println("Atualizando a página: ");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando música: ");

    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada: ");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música: ");

    }
}
