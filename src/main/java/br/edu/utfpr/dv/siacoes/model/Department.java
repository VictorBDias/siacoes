package br.edu.utfpr.dv.siacoes.model;

import lombok.Data;
import java.io.Serializable;

public @Data class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idDepartment = 0;
	private Campus campus = new Campus();
	private String name = "";
	private String fullName = "";
	private transient byte[] logo = null;
	private boolean active = true;
	private String site = "";
	private String initials = "";
	
}
