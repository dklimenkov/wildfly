package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the building database table.
 * 
 */
@Entity
@NamedQuery(name="Building.findAll", query="SELECT b FROM Building b")
public class Building implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String form;

	private String name_Company;

	//bi-directional many-to-one association to Adress
	@ManyToOne
	@JoinColumn(name="Adress_Company")
	private Adress adress;

	//bi-directional many-to-one association to Filial
	@ManyToOne
	@JoinColumn(name="Filial_Company")
	private Filial filial;

	public Building() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getForm() {
		return this.form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getName_Company() {
		return this.name_Company;
	}

	public void setName_Company(String name_Company) {
		this.name_Company = name_Company;
	}

	public Adress getAdress() {
		return this.adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Filial getFilial() {
		return this.filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

}