package framgiavn.project01.web.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.emory.mathcs.backport.java.util.Arrays;

public class Player {
	private int player_id;
	public String name;
	public int age;
	public String nationality;
	public String region;
	public int height;
	public int weight;
	public int strongFoot;
	public Set<String> positions = new HashSet<String>();
	public Set<String> skills = new HashSet<String>();
	public Ability ability;
	
	public Player() {
		setName("Lee");
		setAge(16);
		setNationality("JPN");
		setRegion("ASIA");
		setHeight(178);
		setWeight(68);
		setStrongFoot(1);
		getPositions().clear();
		getSkills().clear();
		setAbility(new Ability());
	}
	
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getStrongFoot() {
		return strongFoot;
	}
	public void setStrongFoot(int strongFoot) {
		this.strongFoot = strongFoot;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public Set<String> getPositions() {
		return positions;
	}
	public void setPositions(Set<String> positions) {
		this.positions = positions;
	}
	public Ability getAbility() {
		return ability;
	}
	public void setAbility(Ability ability) {
		this.ability = ability;
	}
	
}
