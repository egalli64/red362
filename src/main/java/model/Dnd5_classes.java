package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="dnd5_classes")
public class Dnd5_classes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int class_id;
	
	@Column(name="class_name")
	private String class_name;
	
	public Dnd5_classes(int class_id, String class_name) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
	
	}
	
	public Dnd5_classes() {}
	
	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
}
	
	@Override
	public String toString() {
		return "Dnd5_classes [class_id=" + class_id + ", class_name=" + class_name + "]";
	}
}
