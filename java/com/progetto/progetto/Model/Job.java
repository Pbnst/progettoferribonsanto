package com.progetto.progetto.Model;
public class Job {

	private long id;
	private String role;
	private String cname;
	private String enumber;
	private String etype;
	private String location;
	private boolean remote;
	
	/** costruttore
	 * 
	 */
	public Job() {
		super();
	}
	
	public Job(long id, String role, String cname, String enumber, String etype, String location, boolean remote) {
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
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getEnumber() {
		return enumber;
	}

	public void setEnumber(String enumber) {
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

	public boolean getRemote() {
		return remote;
	}

	public void setRemote(boolean remote) {
		this.remote = remote;
	
	}
	
	} 
	

	
	
	
	