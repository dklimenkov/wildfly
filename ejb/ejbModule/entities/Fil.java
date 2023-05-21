package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fil database table.
 * 
 */
@Entity
@NamedQuery(name="Fil.findAll", query="SELECT f FROM Fil f")
public class Fil implements Serializable {
	private static final long serialVersionUID = 1L;

	private String city;

	private int flat;

	private String house;

	private String index_name;

	private String name_Filial;

	private String street;

	public Fil() {
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

	public String getName_Filial() {
		return this.name_Filial;
	}

	public void setName_Filial(String name_Filial) {
		this.name_Filial = name_Filial;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}