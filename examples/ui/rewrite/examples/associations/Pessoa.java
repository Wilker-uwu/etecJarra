package ui.rewrite.examples.associations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * TODO comment
 */
@SuppressWarnings("unused")
public class Pessoa {
	
	private String nome = null;
	private Date dtNasc = null;
	private List<Dependente> dependentes = new ArrayList<Dependente>(0);

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}
	
	public void addDependente(Dependente dependent) {
		this.dependentes.add(dependent);
	}

}
