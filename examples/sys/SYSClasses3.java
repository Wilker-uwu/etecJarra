package sys;

public class SYSClasses3 {
	
	public static void main(String[] args) {
		
		PessoaFisica physicalPerson = new PessoaFisica();
		
		physicalPerson.setName("dummy");
		physicalPerson.setAddress("somewhere");
		physicalPerson.setTelephone(727);
		
		physicalPerson.setEmail("example@domain");
		physicalPerson.setDocRG("99.999.999-9");
		
		System.out.println("name:		"+physicalPerson.getName());
		System.out.println("address:	"+physicalPerson.getAddress());
		System.out.println("telephone:	"+physicalPerson.getTelephone());
		System.out.println("email:		"+physicalPerson.getEmail());
		System.out.println("");
		System.out.println("RG:		"	 +physicalPerson.getDocRG());
		System.out.println("CPF:		"+physicalPerson.getDocCPF());
	
	}
	
	
}

class Pessoa {
	
	private String name=	null;
	private String address=	null;
	private int	telephone=	0;	
	private String email=	null;
	
	
	//REFER TO https://github.com/WilkerS1/etecSharp
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getTelephone() {
		return telephone;
	}
	
	public void setTelephone(int tel) {
		this.telephone = tel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}

class PessoaFisica extends Pessoa {
	
	private String docRG;
	private String docCPF;
	
	public String getDocRG() {
		return docRG;
	}
	
	public void setDocRG(String docRG) {
		this.docRG = docRG;
	}
	
	public String getDocCPF() {
		return docCPF;
	}
	
	public void setDocCPF(String docCPF) {
		this.docCPF = docCPF;
	}
	
}