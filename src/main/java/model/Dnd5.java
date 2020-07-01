package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="dnd5_classes")
public class Dnd5 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classId;
	
	@Column(name="class_name")
	private String className;
	
	public Dnd5(int class_id, String class_name) {
		super();
		this.classId = class_id;
		this.className = class_name;
	
	}
	
	public Dnd5() {}
	
	public int getClass_id() {
		return this.classId;
	}

	public void setClass_id(int class_id) {
		this.classId= class_id;
	}

	public String getClass_name() {
		return this.className;
	}

	public void setClass_name(String class_name) {
		this.className = class_name;
}
	
	@Override
	public String toString() {
		return "Dnd5_classes [class_id=" + this.classId + ", class_name=" + this.className + "]";
	}
}
