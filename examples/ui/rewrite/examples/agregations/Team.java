package ui.rewrite.examples.agregations;

import java.util.List;
import java.util.ArrayList;

/**
 * TODO comment
 */
@SuppressWarnings("unused")
public class Team {
	private String atleteName = null;
	private List<Atlete> atletes = null;
	
	public Team() {
		atletes = new ArrayList<Atlete>(0);
	}
	
	public void add(Atlete anAtlete) {
		atletes.add(anAtlete);
	}
}
