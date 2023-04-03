package application;

import entities.Estudante;

import java.util.Scanner;
import ListaEstudantes.Gerir;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos você deseja adicionar: ");
		int quantity = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < quantity; i++) {

			System.out.print("Nome do aluno: ");
			String nome = sc.nextLine();

			System.out.print("Código do aluno: ");
			Integer codigo = sc.nextInt();
			sc.nextLine();

			System.out.print("CPF do aluno: ");
			String cpf = sc.nextLine();

			Estudante aluno = new Estudante(nome, codigo, cpf);
			Gerir.addEstudante(aluno);

		}
		for (Estudante key : Gerir.getListEstudantes()) {
			System.out.printf("Nome: %s\nCódigo: %d\nCPF: %s\n", key.getNome(), key.getCode(), key.getCpf());
		}
		sc.close();
	}
}
