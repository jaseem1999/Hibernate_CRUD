package com.smple.CRUDHib;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Flim_sample")
public class DTOflim implements Serializable {
	@Id
	@GenericGenerator(name = "ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int id;
	private String name;
	private int collection;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCollection() {
		return collection;
	}
	public void setCollection(int collection) {
		this.collection = collection;
	}
	public DTOflim() {
		System.out.println("Data transfer object(DTO) Successfully");
	}
	
	@Override
	public String toString() {
		return "DTOflim [id=" + id + ", name=" + name + ", collection=" + collection + "]";
	}	
	
}
