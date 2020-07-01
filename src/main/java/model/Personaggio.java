package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personaggi")

public class Personaggio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;

	@Column(name = "user_id")
	private int user_id;

	@Column(name = "Strength_exp")
	private double strenghtExp;

	@Column(name = "Charm_exp")
	private double charmExp;

	@Column(name = "Intelligence_exp")
	private double intelligenceExp;

	@Column(name = "Level")
	private int level;

	@Column(name = "class_id")
	private int class_id;

	public Personaggio(String username, int user_id, double Strength_exp, double Charm_exp, double Intelligence_exp,
			int Level, int class_id) {
		super();
		this.username = username;
		this.user_id = user_id;
		this.strenghtExp = Strength_exp;
		this.charmExp = Charm_exp;
		this.intelligenceExp = Intelligence_exp;
		this.level = Level;
		this.class_id = class_id;
	}

	public Personaggio() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public double getStrength_exp() {
		return this.strenghtExp;
	}

	public void setStrength_exp(double Strength_exp) {
		this.strenghtExp = Strength_exp;
	}

	public double getCharm_exp() {
		return this.charmExp;
	}

	public void setCharm_exp(double Charm_exp) {
		this.charmExp = Charm_exp;
	}

	public double getIntelligence_exp() {
		return this.intelligenceExp;
	}

	public void setIntelligence_exp(double Intelligence_exp) {
		this.intelligenceExp = Intelligence_exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int Level) {
		this.level = Level;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	@Override
	public String toString() {
		return "Programmi [username=" + username + ", user_id=" + user_id + ", Strength_exp" + this.strenghtExp
				+ ", Charm_exp=" + this.charmExp + "]";
	}

}
