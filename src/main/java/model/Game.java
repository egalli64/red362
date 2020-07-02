package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "gamesession")
public class Game implements Serializable{
	
	private int id;
	private double charm;
	private double intelligence;
	private double strength;
	private Date lastConnection;
	private int level;
	private Character character;
	
	public Game(double charm, double intelligence, double strenght, Date lastConnection, int level, Character character) {
		super();
		this.charm = charm;
		this.intelligence = intelligence;
		this.strength = strenght;
		this.lastConnection = lastConnection;
		this.level = level;
		this.character = character;
	}
	
	public Game() {}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="game_id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "charm_exp")
	public double getCharm() {
		return charm;
	}

	public void setCharm(double charm) {
		this.charm = charm;
	}

	@Column(name = "intelligence_exp")
	public double getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(double intelligence) {
		this.intelligence = intelligence;
	}

	@Column(name = "strength_exp")
	public double getStrength() {
		return strength;
	}

	public void setStrength(double strenght) {
		this.strength = strenght;
	}

	@Basic
	@Temporal(TemporalType.DATE)
	@Column(name= "lastconnection")
	public Date getLastConnection() {
		return lastConnection;
	}

	public void setLastConnection(Date lastConnection) {
		this.lastConnection = lastConnection;
	}

	@Column(name = "level")
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@ManyToOne()
	@JoinColumn(name="nickname")
	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	
	

}
