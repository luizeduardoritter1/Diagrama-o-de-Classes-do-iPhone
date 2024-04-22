public abstract interface NavegadorInternet {
    void abrirURL(String url);
    void fecharURL(String url);
    void selecionarPagina();
    void avancarPagina();
    void voltarPagina();
    void atualizarPagina();
    void adicionarNovaAba();

}
