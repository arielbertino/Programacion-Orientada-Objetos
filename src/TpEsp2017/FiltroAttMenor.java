package TpEsp2017;

public class FiltroAttMenor extends Filtro {
	private String atributo;
	private Double valor;

	public FiltroAttMenor(String atributo, Double valor) {
		this.atributo = atributo;
		this.valor = valor;
	}

	public boolean cumple(FichaAbstracta f) {
		return (f.getAtributo(atributo) < valor);
	}
}
