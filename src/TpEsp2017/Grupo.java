package TpEsp2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Grupo extends FichaAbstracta {

	private List<FichaAbstracta> fichas;

	public Grupo(String nombre) {
		super(nombre);
		fichas = new ArrayList<>();
	}

	public void addFicha(FichaAbstracta nFicha) {
		this.fichas.add(nFicha);
	}

	public String getNombre() {
		return super.getNombre();
	}

	public Double getAtributo(String clave) {
		Double aux = 0.0;
		for (int i = 0; i < this.fichas.size(); i++) {
			aux += this.fichas.get(i).getAtributo(clave);
		}
		return (aux / this.fichas.size());
	}

	@Override
	public int compareTo(FichaAbstracta o) {
		return super.comprateTo(o);
	}

	public Vector<FichaAbstracta> buscar(Filtro f1) {
		Vector<FichaAbstracta> aux = new Vector<>();
		for (int i = 0; i < this.fichas.size(); i++)
			aux.addAll(this.fichas.get(i).buscar(f1));
		return aux;
	}
}
