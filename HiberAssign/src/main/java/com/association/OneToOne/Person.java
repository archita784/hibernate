package com.association.OneToOne;

import javax.persistence.*;


@Table (name="HiberPerson")

@Entity
public class Person {
	
		private String name;
		
		@Id
		@GeneratedValue(generator= "",strategy=GenerationType.SEQUENCE)
		@SequenceGenerator(name="persq",sequenceName = "per_sequence")
		private int id;
		private int age;
		private long mobile;
		
		@OneToOne(cascade= {CascadeType.ALL})
		private Licence license;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public long getMobile() {
			return mobile;
		}

		public void setMobile(long mobile) {
			this.mobile = mobile;
		}

		public Licence getLicense() {
			return license;
		}

		public void setLicense(Licence license) {
			this.license = license;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", id=" + id + ", age=" + age + ", mobile=" + mobile + ", license="
					+ license + "]";
		}
		

}
