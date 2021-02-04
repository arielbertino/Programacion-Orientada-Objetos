package TpEsp2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Coleccion {
	private List<FichaAbstracta> fichas;

	public Coleccion() {
		fichas = new ArrayList<>();
	}

	public void addFicha(FichaAbstracta ficha) {
		fichas.add(ficha);
	}

	public String listarFichas(Filtro f1) {
		return this.listarFichas(Collections.reverseOrder(), f1);
	}

	public String listarFichas(Comparator<FichaAbstracta> orden, Filtro f1) {
		String aux = new String();
		Vector<FichaAbstracta> listado = this.getListado(orden, f1);
		for (int i = 0; i < listado.size(); i++)
			aux += (listado.get(i).getNombre() + "\n");
		return aux;
	}

	private Vector<FichaAbstracta> getListado(Comparator<FichaAbstracta> orden, Filtro f1) {
		Set<FichaAbstracta> aux = new HashSet<>();
		for (int i = 0; i < fichas.size(); i++)
			aux.addAll(fichas.get(i).buscar(f1));
		Vector<FichaAbstracta> res = new Vector<>(aux);
		Collections.sort(res, orden);
		return (res);
	}

}
