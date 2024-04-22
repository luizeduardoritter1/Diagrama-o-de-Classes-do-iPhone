public abstract class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima faixa...");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Retrocedendo para a faixa anterior...");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada...");
    }

    @Override
    public void abrirURL(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void fecharURL(String url) {
        System.out.println("Fechando URL...");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando para a página anterior...");
    }

    @Override
    public void avancarPagina() {
        System.out.println("Avançando para a próxima página...");
    }

}
