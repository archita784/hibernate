package com.employee.demo;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernateutil {
	static SessionFactory factory;
	static {
		StandardServiceRegistry registry = null;
		try {

			registry = new StandardServiceRegistryBuilder()

					.configure("hibernate.cfg.xml").build();
			MetadataSources metadataSource = new MetadataSources(registry);
			Metadata metadata = metadataSource.buildMetadata();
			factory = metadata.buildSessionFactory();
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
