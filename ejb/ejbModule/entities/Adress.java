package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the adress database table.
 * 
 */
@Entity
@NamedQuery(name="Adress.findAll", query="SELECT a FROM Adress a")
public class Adress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String city;

	private int flat;

	private String house;

	private String index_name;

	private String street;

	//bi-directional many-to-one association to Building
	@OneToMany(mappedBy="adress")
	private List<Building> buildings;

	//bi-directional many-to-one association to Filial
	@OneToMany(mappedBy="adressBean")
	private List<Filial> filials;

	public Adress() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getFlat() {
		return this.flat;
	}

	public void setFlat(int flat) {
		this.flat = flat;
	}

	public String getHouse() {
		return this.house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getIndex_name() {
		return this.index_name;
	}

	public void setIndex_name(String index_name) {
		this.index_name = index_name;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public List<Building> getBuildings() {
		return this.buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

	public Building addBuilding(Building building) {
		getBuildings().add(building);
		building.setAdress(this);

		return building;
	}

	public Building removeBuilding(Building building) {
		getBuildings().remove(building);
		building.setAdress(null);

		return building;
	}

	public List<Filial> getFilials() {
		return this.filials;
	}

	public void setFilials(List<Filial> filials) {
		this.filials = filials;
	}

	public Filial addFilial(Filial filial) {
		getFilials().add(filial);
		filial.setAdressBean(this);

		return filial;
	}

	public Filial removeFilial(Filial filial) {
		getFilials().remove(filial);
		filial.setAdressBean(null);

		return filial;
	}

}