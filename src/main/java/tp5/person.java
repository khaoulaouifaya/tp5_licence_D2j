package tp5;

import java.util.HashSet;
import java.util.Set;


@auteur(name="khaoula",age=19)
public class person {
	
	int id;
	String nom;
	String prenom;
	
	
	public person(int id1,String nom1,String prenom1) {
		
		this.id=id1;
		this.nom=nom1;
		this.prenom=prenom1;
		
	}
	
	@Override
	public String toString() {
		return "person [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}


}
