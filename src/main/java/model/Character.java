package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="characters")
public class Character implements Serializable {

	private String nickname;
    private User user;
	private String tipologia;
	private List<Game> games;

	public Character(String nickname, User user, String tipologia) {
		super();
		this.nickname = nickname;
		this.user = user;
		this.tipologia = tipologia;
		this.games = new ArrayList<Game>();
	}
	
	public Character() {}

	@Id
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Column(name="typology")
	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	@OneToMany(mappedBy = "character", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
	
}
