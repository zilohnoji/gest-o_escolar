package entities;

public class Estudante {
	private String nome;
	private Integer code;
	private String cpf;

	public Estudante(String nome, Integer code, String cpf) {
		super();
		this.nome = nome;
		this.code = code;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
