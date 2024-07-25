public class LocalizacaoDeEntrega implements DeliveryFlyweight {
  private final DadosDeLocalizacaoEntrega estadoIntrinseco;

  public LocalizacaoDeEntrega(DadosDeLocalizacaoEntrega estadoIntrinseco) {
    this.estadoIntrinseco = estadoIntrinseco;
  }

  @Override
  public void entregar(String nome, String numero) {
    System.out.println("Entrega para " + nome);
    System.out.println("Em " + estadoIntrinseco.getRua() + ", " + estadoIntrinseco.getCidade());
    System.out.println("Número: " + numero);
    System.out.println("------------------------------------------");
  }
}
