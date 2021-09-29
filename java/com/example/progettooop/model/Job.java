package com.example.progettooop.model;

public class Job {
	/**
	 * Data di creazione del tweet
	 */
	@JsonPropertyDescription("id del lavoro")
	private int id;
	
	/**
	 * ruolo presso l'azienda
	 */
	@JsonPropertyDescription("ruolo aziendale")
	private String role;
	
	/**
	 * nome dell'azienda
	 */
	@JsonPropertyDescription ("Nome dell'azienda")
	private String name;
	
	/**
	 * numero impiegati
	 */
	@JsonPropertyDescription ("numero di impiegati")
	private int number;
	
	@JsonPropertyDescription ("luogo")
	private String location;
	
	@JsonPropertyDescription ("remoto")
	private String remote;
	
	/**
	 * Costruttore della classe che inizializza l'oggetto.
	 * @param id
	 * @param role
	 * @param name
	 * @param number
	 * @param location
	 * @param remote
	 */
	public Job(int id, String role, String name, int number, String location, String remote) {
		this.id = id;
		this.role = role;
		this.name = name;
		this.number = number;
		this.location = location;
		this.remote = remote;
	}

	/**
	 * Costruttore della classe senza passaggio di parametri.
	 */
	public Job() {
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRemote() {
		return remote;
	}

	public void setRemote(String remote) {
		this.remote = remote;
	}

	public void stampaInfoJob(){
		System.out.println(this.getId());
		System.out.println(this.getRole());
		System.out.println(this.getName());
		System.out.println(this.getNumber());
		System.out.println(this.getLocation());
		System.out.println(this.getRemote());
		
		
		
		
	}


}
