package TpEsp2017;

import java.util.Hashtable;
import java.util.Vector;

public class Ficha extends FichaAbstracta {

	private Hashtable<String, Double> atributos;

	public Ficha(String nombre) {
		super(nombre);
		this.atributos = new Hashtable<String, Double>();
	}

	public Double getAtributo(String clave) {
		if (this.atributos.containsKey(clave))
			return (this.atributos.get(clave));
		else
			return 0.0;
	}

	public void setAtributo(String nombre, Double valor) {
		this.atributos.put(nombre, valor);
	}

	public String getNombre() {
		return super.getNombre();
	}

	@Override
	public int compareTo(FichaAbstracta o) {
		return super.comprateTo(o);
	}

	@Override
	public Vector<FichaAbstracta> buscar(Filtro f1) {
		Vector<FichaAbstracta> aux = new Vector<>();
		if (f1.cumple(this))
			aux.add(this);
		return aux;
	}
}
