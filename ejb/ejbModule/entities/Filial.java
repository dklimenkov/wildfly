package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the filials database table.
 * 
 */
@Entity
@Table(name="filials")
@NamedQuery(name="Filial.findAll", query="SELECT f FROM Filial f")
public class Filial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="id_for")
	private int idFor;

	private String name_Filial;

	//bi-directional many-to-one association to Building
	@OneToMany(mappedBy="filial")
	private List<Building> buildings;

	//bi-directional many-to-one association to Adress
	@ManyToOne
	@JoinColumn(name="Adress")
	private Adress adressBean;

	public Filial() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdFor() {
		return this.idFor;
	}

	public void setIdFor(int idFor) {
		this.idFor = idFor;
	}

	public String getName_Filial() {
		return this.name_Filial;
	}

	public void setName_Filial(String name_Filial) {
		this.name_Filial = name_Filial;
	}

	public List<Building> getBuildings() {
		return this.buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

	public Building addBuilding(Building building) {
		getBuildings().add(building);
		building.setFilial(this);

		return building;
	}

	public Building removeBuilding(Building building) {
		getBuildings().remove(building);
		building.setFilial(null);

		return building;
	}

	public Adress getAdressBean() {
		return this.adressBean;
	}

	public void setAdressBean(Adress adressBean) {
		this.adressBean = adressBean;
	}

}