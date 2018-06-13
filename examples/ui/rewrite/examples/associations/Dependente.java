package ui.rewrite.examples.associations;

import java.util.Date;

/**
 * TODO comment
 */
@SuppressWarnings("unused")
public class Dependente {

	private String nome = null;
	private Date dtNasc = null;
	private Pessoa responsavel = null;
	private String parentesco = null;
	
	public Pessoa getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Pessoa responsavel) {
		this.responsavel = responsavel;
	}
}
