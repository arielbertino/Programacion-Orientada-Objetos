package TpEsp2017;

import java.util.Comparator;

public class ComparadorAttDescendente implements Comparator<FichaAbstracta> {
	private String atributo;

	public ComparadorAttDescendente(String atributo) {
		this.atributo = atributo;
	}

	public int compare(FichaAbstracta f1, FichaAbstracta f2) {
		return (int) (f2.getAtributo(atributo) - f1.getAtributo(atributo));
	}

}