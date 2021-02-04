package TpEsp2017;

import java.util.Comparator;

public class ComparadorAttAscendente implements Comparator<FichaAbstracta> {
	private String atributo;

	public ComparadorAttAscendente(String atributo) {
		this.atributo = atributo;
	}

	public int compare(FichaAbstracta f1, FichaAbstracta f2) {
		return (int) (f1.getAtributo(atributo) - f2.getAtributo(atributo));
	}

}
