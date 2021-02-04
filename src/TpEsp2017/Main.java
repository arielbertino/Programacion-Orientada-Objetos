package TpEsp2017;

import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		// ---------- 1) Definicion de personajes
		Ficha flash = new Ficha("Flash");
		flash.setAtributo("Altura", 1.78);
		flash.setAtributo("Peso", 90.0);
		flash.setAtributo("Fuerza", 900.0);
		flash.setAtributo("Peleas Ganadas", 10.0);
		flash.setAtributo("Velocidad", 800000.0);
		flash.setAtributo("Inteligencia", 50.0);

		Ficha capitanFrio = new Ficha("Capitan Frio");
		capitanFrio.setAtributo("Altura", 1.88);
		capitanFrio.setAtributo("Peso", 95.0);
		capitanFrio.setAtributo("Fuerza", 600.0);
		capitanFrio.setAtributo("Peleas Ganadas", 20.0);
		capitanFrio.setAtributo("Velocidad", 48.0);
		capitanFrio.setAtributo("Maldad", 50.0);

		Ficha superman = new Ficha("Superman");
		superman.setAtributo("Altura", 1.92);
		superman.setAtributo("Peso", 107.0);
		superman.setAtributo("Fuerza", 2600.0);
		superman.setAtributo("Peleas Ganadas", 200.0);
		superman.setAtributo("Velocidad", 1200.0);

		Ficha batman = new Ficha("Batman");
		batman.setAtributo("Altura", 1.89);
		batman.setAtributo("Peso", 96.0);
		batman.setAtributo("Fuerza", 950.0);
		batman.setAtributo("Peleas Ganadas", 15.0);
		batman.setAtributo("Velocidad", 120.0);
		batman.setAtributo("Inteligencia", 150.0);

		Ficha robin = new Ficha("Robin");
		robin.setAtributo("Altura", 1.75);
		robin.setAtributo("Peso", 65.0);
		robin.setAtributo("Fuerza", 710.0);
		robin.setAtributo("Peleas Ganadas", 8.0);
		robin.setAtributo("Velocidad", 60.0);
		robin.setAtributo("Inteligencia", 100.0);

		Ficha guason = new Ficha("Guason");
		guason.setAtributo("Altura", 1.85);
		guason.setAtributo("Peso", 72.0);
		guason.setAtributo("Fuerza", 300.0);
		guason.setAtributo("Peleas Ganadas", 3.0);
		guason.setAtributo("Velocidad", 60.0);
		guason.setAtributo("Inteligencia", 100.0);
		guason.setAtributo("Maldad", 100.0);

		Ficha lexLuthor = new Ficha("Lex Luthor");
		lexLuthor.setAtributo("Altura", 1.88);
		lexLuthor.setAtributo("Peso", 95.0);
		lexLuthor.setAtributo("Fuerza", 1000.0);
		lexLuthor.setAtributo("Peleas Ganadas", 1.0);
		lexLuthor.setAtributo("Velocidad", 70.0);
		lexLuthor.setAtributo("Maldad", 75.0);

		Ficha gatubela = new Ficha("Gatubela");
		gatubela.setAtributo("Altura", 1.69);
		gatubela.setAtributo("Peso", 51.0);
		gatubela.setAtributo("Fuerza", 720.0);
		gatubela.setAtributo("Peleas Ganadas", 5.0);
		gatubela.setAtributo("Velocidad", 90.0);
		gatubela.setAtributo("Inteligencia", 150.0);
		gatubela.setAtributo("Maldad", 25.0);

		// ------------------ 2)Definicios de ligas
		Grupo duoDinamico = new Grupo("Duo Dinamico");
		duoDinamico.addFicha(robin);
		duoDinamico.addFicha(batman);

		Grupo ligaDeLaJusticia = new Grupo("Liga De La Justicia");
		ligaDeLaJusticia.addFicha(flash);
		ligaDeLaJusticia.addFicha(superman);
		ligaDeLaJusticia.addFicha(duoDinamico);

		Grupo ligaDeLaInjusticia = new Grupo("Liga de la Injusticia");
		ligaDeLaInjusticia.addFicha(capitanFrio);
		ligaDeLaInjusticia.addFicha(guason);
		ligaDeLaInjusticia.addFicha(lexLuthor);
		ligaDeLaInjusticia.addFicha(gatubela);

		Coleccion miColeccion = new Coleccion();
		miColeccion.addFicha(flash);
		miColeccion.addFicha(capitanFrio);
		miColeccion.addFicha(superman);
		miColeccion.addFicha(batman);
		miColeccion.addFicha(robin);
		miColeccion.addFicha(guason);
		miColeccion.addFicha(gatubela);
		miColeccion.addFicha(lexLuthor);
		miColeccion.addFicha(duoDinamico);
		miColeccion.addFicha(ligaDeLaJusticia);
		miColeccion.addFicha(ligaDeLaInjusticia);

		// ---------------------- 3)Mostrar atributos de ligas
		System.out.println("Atributos solicitados de cada grupo:" + "\n");
		System.out.println(duoDinamico.toStringAtributo("Fuerza"));
		System.out.println(ligaDeLaJusticia.toStringAtributo("Fuerza"));
		System.out.println(ligaDeLaInjusticia.toStringAtributo("Fuerza") + "\n");

		System.out.println(duoDinamico.toStringAtributo("Peleas Ganadas"));
		System.out.println(ligaDeLaJusticia.toStringAtributo("Peleas Ganadas"));
		System.out.println(ligaDeLaInjusticia.toStringAtributo("Peleas Ganadas") + "\n");

		System.out.println(duoDinamico.toStringAtributo("Inteligencia"));
		System.out.println(ligaDeLaJusticia.toStringAtributo("Inteligencia"));
		System.out.println(ligaDeLaInjusticia.toStringAtributo("Inteligencia") + "\n");

		System.out.println(duoDinamico.toStringAtributo("Maldad"));
		System.out.println(ligaDeLaJusticia.toStringAtributo("Maldad"));
		System.out.println(ligaDeLaInjusticia.toStringAtributo("Maldad") + "\n");

		// ---------------------- 4)Listado Peronajes

		System.out.println("--------Listado Peronajes------------------");

		System.out.println("----------------------Velocidad mayor a 100 descendente:");
		Filtro velocidad100 = new FiltroAttMayor("Velocidad", 100.0);
		Comparator<FichaAbstracta> velocidadDecendente = new ComparadorAttDescendente("Velocidad");
		System.out.println((miColeccion.listarFichas(velocidadDecendente, velocidad100)));

		System.out.println("----------------------Fuerza menor a 900 ascendente:");
		Filtro fuerza900 = new FiltroAttMenor("Fuerza", 900.0);
		Comparator<FichaAbstracta> fuerzaAscendente = new ComparadorAttDescendente("Fuerza");
		System.out.println((miColeccion.listarFichas(fuerzaAscendente, fuerza900)));

		System.out.println("----------------------Maldad mayor a 50 e Inteligencia mayor a 80:");
		Filtro maldad50 = new FiltroAttMayor("Maldad", 50.0);
		Filtro inteligencia80 = new FiltroAttMayor("Inteligencia", 80.0);
		Filtro malAndInt = new FiltroAnd(maldad50, inteligencia80);
		System.out.println((miColeccion.listarFichas(malAndInt)));

		System.out.println("----------------------Peso menor a 70 descendente(nombre):");
		Filtro peso70 = new FiltroAttMayor("Peso", 70.0);
		System.out.println((miColeccion.listarFichas(peso70)));

		// ---------------------- 5)Definicion de fichas

		Ficha chevroletC = new Ficha("Chevrolet Cruze");
		chevroletC.setAtributo("Velocidad", 220.0);
		chevroletC.setAtributo("HP", 153.0);
		chevroletC.setAtributo("Cilindros", 4.0);
		chevroletC.setAtributo("RPM", 5000.0);
		chevroletC.setAtributo("Aceleracion", 8.5);
		chevroletC.setAtributo("Cm3", 1400.0);
		chevroletC.setAtributo("Precio", 12000.0);

		Ficha chevroletS = new Ficha("Chevrolet S10");
		chevroletS.setAtributo("Velocidad", 200.0);
		chevroletS.setAtributo("HP", 200.0);
		chevroletS.setAtributo("Cilindros", 4.0);
		chevroletS.setAtributo("RPM", 3600.0);
		chevroletS.setAtributo("Aceleracion", 7.5);
		chevroletS.setAtributo("Cm3", 2800.0);
		chevroletS.setAtributo("Precio", 31000.0);

		Ficha chevroletCam = new Ficha("Chevrolet Camaro");
		chevroletCam.setAtributo("Velocidad", 380.0);
		chevroletCam.setAtributo("HP", 405.0);
		chevroletCam.setAtributo("Cilindros", 8.0);
		chevroletCam.setAtributo("RPM", 5900.0);
		chevroletCam.setAtributo("Aceleracion", 3.0);
		chevroletCam.setAtributo("Cm3", 6100.0);

		Ficha fordk = new Ficha("Ford Ka");
		fordk.setAtributo("Velocidad", 180.0);
		fordk.setAtributo("HP", 105.0);
		fordk.setAtributo("Cilindros", 4.0);
		fordk.setAtributo("RPM", 6000.0);
		fordk.setAtributo("Aceleracion", 10.0);
		fordk.setAtributo("Cm3", 1500.0);
		fordk.setAtributo("Precio", 12500.0);

		Ficha fordR = new Ficha("Ford Ranger");
		fordR.setAtributo("Velocidad", 210.0);
		fordR.setAtributo("HP", 166.0);
		fordR.setAtributo("Cilindros", 4.0);
		fordR.setAtributo("RPM", 5500.0);
		fordR.setAtributo("Aceleracion", 8.0);
		fordR.setAtributo("Cm3", 2500.0);
		fordR.setAtributo("Precio", 28000.0);

		Ficha fordM = new Ficha("Ford Mustang");
		fordM.setAtributo("Velocidad", 450.0);
		fordM.setAtributo("HP", 503.0);
		fordM.setAtributo("Cilindros", 8.0);
		fordM.setAtributo("RPM", 7000.0);
		fordM.setAtributo("Aceleracion", 4.0);
		fordM.setAtributo("Precio", 95000.0);

		Ficha hondaF = new Ficha("Honda Fit");
		hondaF.setAtributo("Velocidad", 230.0);
		hondaF.setAtributo("HP", 132.0);
		hondaF.setAtributo("Cilindros", 4.0);
		hondaF.setAtributo("RPM", 6600.0);
		hondaF.setAtributo("Aceleracion", 7.5);
		hondaF.setAtributo("Cm3", 1500.0);
		hondaF.setAtributo("Precio", 24000.0);

		Ficha hondaA = new Ficha("Honda Accord");
		hondaA.setAtributo("Velocidad", 320.0);
		hondaA.setAtributo("HP", 280.0);
		hondaA.setAtributo("Cilindros", 6.0);
		hondaA.setAtributo("RPM", 66000.0);
		hondaA.setAtributo("Aceleracion", 5.0);
		hondaA.setAtributo("Cm3", 3500.0);

		Coleccion miColAutos = new Coleccion();
		miColAutos.addFicha(chevroletC);
		miColAutos.addFicha(chevroletS);
		miColAutos.addFicha(chevroletCam);
		miColAutos.addFicha(fordk);
		miColAutos.addFicha(fordR);
		miColAutos.addFicha(fordM);
		miColAutos.addFicha(hondaF);
		miColAutos.addFicha(hondaA);

		// --------------------- 6)Definicon de grupos
		Grupo japoneses = new Grupo("Japoneses");
		japoneses.addFicha(hondaF);
		japoneses.addFicha(hondaA);

		Grupo sedan = new Grupo("Sedan");
		sedan.addFicha(chevroletC);
		sedan.addFicha(fordk);
		sedan.addFicha(japoneses);

		Grupo carrera = new Grupo("Carrera");
		carrera.addFicha(chevroletCam);
		carrera.addFicha(fordM);

		Grupo camionetas = new Grupo("Camionetas");
		camionetas.addFicha(chevroletS);
		camionetas.addFicha(fordR);

		Grupo potencia = new Grupo("Potencia");
		potencia.addFicha(camionetas);
		potencia.addFicha(carrera);

		// ------------------------ 7)Mostrar atributos de grupos
		System.out.println("Atributos solicitados de cada grupo de autos:" + "\n");
		System.out.println(japoneses.toStringAtributo("Velocidad"));
		System.out.println(sedan.toStringAtributo("Velocidad"));
		System.out.println(carrera.toStringAtributo("Velocidad"));
		System.out.println(camionetas.toStringAtributo("Velocidad"));
		System.out.println(potencia.toStringAtributo("Velocidad") + "\n");

		System.out.println(japoneses.toStringAtributo("Aceleracion"));
		System.out.println(sedan.toStringAtributo("Aceleracion"));
		System.out.println(carrera.toStringAtributo("Aceleracion"));
		System.out.println(camionetas.toStringAtributo("Aceleracion"));
		System.out.println(potencia.toStringAtributo("Aceleracion") + "\n");

		System.out.println(japoneses.toStringAtributo("Precio"));
		System.out.println(sedan.toStringAtributo("Precio"));
		System.out.println(carrera.toStringAtributo("Precio"));
		System.out.println(camionetas.toStringAtributo("Precio"));
		System.out.println(potencia.toStringAtributo("Precio") + "\n");
		// ------------------------ 8)
		System.out.println("--------Listado autos------------------");
		System.out.println("----------------------Velocidad mayor a 200 descendente:");
		Filtro velocidad200 = new FiltroAttMayor("Velocidad", 200.0);
		System.out.println(miColAutos.listarFichas(velocidadDecendente, velocidad200));

		System.out.println("----------------------Cilindrada mayor a 2000 ascendente:");
		Filtro cilindrada2000 = new FiltroAttMenor("Cm3", 2000.0);
		Comparator<FichaAbstracta> cilindroAscendente = new ComparadorAttAscendente("Cm3");
		System.out.println(miColAutos.listarFichas(cilindroAscendente, cilindrada2000));

		System.out.println("----------------------HP mayor a 150, Precio mayor a 15000:");
		Filtro hp150 = new FiltroAttMayor("HP", 150.0);
		Filtro precio15000 = new FiltroAttMayor("Precio", 15000.0);
		Filtro andHpPrecio = new FiltroAnd(hp150, precio15000);
		System.out.println(miColAutos.listarFichas(andHpPrecio));
	}
}
