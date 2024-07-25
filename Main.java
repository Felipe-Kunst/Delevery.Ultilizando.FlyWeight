public class Main {
	public static void main(String[] args) {
		FabricaDeEntrega fabrica = new FabricaDeEntrega();
		DadosDeLocalizacaoEntrega localizacao1 = new DadosDeLocalizacaoEntrega("Rua Monsenhor Bruno", "Fortaleza");
		DadosDeLocalizacaoEntrega localizacao2 = new DadosDeLocalizacaoEntrega("Avenida Desembargador Moreira", "Fortaleza");
		DadosDeLocalizacaoEntrega localizacao3 = new DadosDeLocalizacaoEntrega("Rua Monsenhor Bruno", "Fortaleza");
		DeliveryFlyweight localizacaoFlyweight1 = fabrica.criarLocalizacao(localizacao1);
		DeliveryFlyweight localizacaoFlyweight2 = fabrica.criarLocalizacao(localizacao2);
		localizacaoFlyweight1.entregar("Luis Kaio", "123");
		localizacaoFlyweight2.entregar("Manoel Ramos", "456");
		localizacaoFlyweight2.entregar("Felipe Martins", "160");

		System.out.println(fabrica.getLocalizacoes());
	}
}
