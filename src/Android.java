public class Android implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Andoid Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Verificando mensagens: ");

    }
}
