package ListaEstudantes;

import java.util.ArrayList;
import java.util.List;

import entities.Estudante;

public class Gerir {
	public static List<Estudante> estudantes = new ArrayList<>();

	public static void addEstudante(Estudante aluno) {
		estudantes.add(aluno);
	}

	public static List<Estudante> getListEstudantes() {
		return estudantes;
	}

}
