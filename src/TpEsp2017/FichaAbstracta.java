package TpEsp2017;

import java.util.Vector;

public abstract class FichaAbstracta implements Comparable<FichaAbstracta> {
	private String nombre;

	public FichaAbstracta(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public abstract Double getAtributo(String atributo);

	public abstract Vector<FichaAbstracta> buscar(Filtro f1);

	public String toStringAtributo(String atributo) {
		String aux = new String();
		aux += (this.getNombre() + " " + atributo + " " + this.getAtributo(atributo));
		return aux;
	}

	public boolean equals(Object obj) {
		FichaAbstracta temp = (FichaAbstracta) obj;
		if (this.nombre.equals(temp.getNombre()))
			return true;
		return false;
	}

	public int comprateTo(FichaAbstracta otro) {
		return (this.nombre.compareTo(otro.getNombre()));
	}
}
