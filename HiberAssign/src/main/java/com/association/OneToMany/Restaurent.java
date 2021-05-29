package com.association.OneToMany;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="HiberRest")
public class Restaurent {
	@Column(name="rest_name",length=50)
	private String name;
	@Id
	@GeneratedValue(generator = "restsq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "restsq", sequenceName = "rest_sequence")
	@Column(name="rest_id")
	private int restId;
	
	private String location;
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="resto_id",referencedColumnName = "rest_id")
	private Set<Menu> menuList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(Set<Menu> menuList) {
		this.menuList = menuList;
	}

	@Override
	public String toString() {
		return "Restaurent [name=" + name + ", restId=" + restId + ", location=" + location + ", city=" + city
				+ ", menuList=" + menuList + "]";
	}
	
	
	

}
