package com.association.OneToMany;

import javax.persistence.*;


@Table(name = "HiberMenu")
@Entity

public class Menu {
	String menuName;
	String type;
	@Id
	@GeneratedValue(generator = "menusq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "menusq", sequenceName = "menu_sequence",initialValue = 50,allocationSize =1 )
	int menuId;
	
	int price;

	public Menu() {
		super();
	}

	public Menu(String menuName, String type,  int price) {
		super();
		this.menuName = menuName;
		this.type = type;
		
		this.price = price;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", type=" + type + ", menuId=" + menuId + ", price=" + price + "]";
	}
	
	
	
}
