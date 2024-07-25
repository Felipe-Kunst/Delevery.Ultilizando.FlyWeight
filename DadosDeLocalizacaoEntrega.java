public class DadosDeLocalizacaoEntrega {
  private final String rua;
  private final String cidade;

  public DadosDeLocalizacaoEntrega(String rua, String cidade) {
    this.rua = rua;
    this.cidade = cidade;
  }

  public String getRua() {
    return rua;
  }

  public String getCidade() {
    return cidade;
  }
}
