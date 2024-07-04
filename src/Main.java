public class Main {
    public static void main(String[] args) {

       // Iphone musical = new AparelhoTelefonico();

        AparelhoTelefonico celular = new Iphone();
        AparelhoTelefonico android = new Android();
        ReprodutorMusical ipod = new Iphone();
        NavegadorInternet browse =  new Iphone();

        celular.ligar("888888");
        android.ligar("999999");


       celular.ligar("71-988322598");
        celular.atender();
        celular.iniciarCorreioVoz();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();
        browse.exibirPagina("https://translate.google.com.br/?sl=en&tl=pt&text=grant&op=translate");
        browse.adicionarNovaAba();
        browse.atualizarPagina();

    }
}