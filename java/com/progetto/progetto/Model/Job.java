package com.progetto.progetto.Model;
public class Job {

	private int id;
	private String role;
	private String cname;
	private int enumber;
	private String etype;
	private String location;
	private String remote;
	
	/** costruttore
	 * 
	 */
	public Job() {
		super();
	}
	
	public Job(int id, String role, String cname, int enumber, String etype, String location, String remote) {
	this.id = id;
	this.role = role;
	this.cname = cname;
	this.enumber = enumber;
	this.etype = etype;
	this.location = location;
	this.remote = remote;
	
	}  
	/** getters e setters
	 * 
	 * 
	 */
	
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

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getEnumber() {
		return enumber;
	}

	public void setEnumber(int enumber) {
		this.enumber = enumber;
	}

	public String getEtype() {
		return etype;
	}

	public void setEtype(String etype) {
		this.etype = etype;
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
	
	} 
	

	
	
	
	