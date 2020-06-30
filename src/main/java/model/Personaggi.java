package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="personaggi")

public class Personaggi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;
	
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="Strength_exp")
	private double Strength_exp;
	
	@Column(name="Charm_exp")
	private double Charm_exp;
	
	@Column(name="Intelligence_exp")
	private double Intelligence_exp;
	
	@Column(name="Level")
	private int Level;
	
	@Column(name="class_id")
	private int class_id;
	
	public Personaggi(String username, int user_id, double Strength_exp, double Charm_exp, double Intelligence_exp, int Level, int class_id ) {
		super();
		this.username= username;
		this.user_id = user_id;
		this.Strength_exp = Strength_exp;
		this.Charm_exp = Charm_exp;
		this.Intelligence_exp= Intelligence_exp;
		this.Level = Level;
		this.class_id = class_id;
		}
	
	public Personaggi() {}
	
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
		return Strength_exp;
	}

	public void setStrength_exp(double Strength_exp) {
		this.Strength_exp = Strength_exp; }
		
		public double getCharm_exp() {
			return Charm_exp;
		}

		public void setCharm_exp(double Charm_exp) {
			this.Charm_exp = Charm_exp;}
			
			public double getIntelligence_exp() {
				return Intelligence_exp;
			}

			public void setIntelligence_exp(double Intelligence_exp) {
				this.Intelligence_exp = Intelligence_exp;
	}
			public int getLevel() {
				return Level;
			}

			public void setLevel(int Level) {
				this.Level = Level;}
			
			public int getClass_id() {
				return class_id;
			}

			public void setClass_id(int class_id) {
				this.class_id = class_id;}
		

@Override
public String toString() {
	return "Programmi [username=" + username + ", user_id=" + user_id + ", Strength_exp" + Strength_exp + ", Charm_exp=" + Charm_exp
			+ "]";
}
			
			

	
}
