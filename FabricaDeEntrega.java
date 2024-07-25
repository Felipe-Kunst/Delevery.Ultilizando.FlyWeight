import java.util.HashMap;
import java.util.Map;

public class FabricaDeEntrega {
  private Map<String, DeliveryFlyweight> localizacoes = new HashMap<>();

  public DeliveryFlyweight criarLocalizacao(DadosDeLocalizacaoEntrega estadoIntrinseco) {
    String chave = criarId(estadoIntrinseco);
    if (!localizacoes.containsKey(chave)) {
      localizacoes.put(chave, new LocalizacaoDeEntrega(estadoIntrinseco));
    }
    return localizacoes.get(chave);
  }

  private String criarId(DadosDeLocalizacaoEntrega dados) {
    return dados.getRua().replaceAll("\\s+", "").toLowerCase() + "_" +
        dados.getCidade().replaceAll("\\s+", "").toLowerCase();
  }

  public Map<String, DeliveryFlyweight> getLocalizacoes() {
    return localizacoes;
  }
}
