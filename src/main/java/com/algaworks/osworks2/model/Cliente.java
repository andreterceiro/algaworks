package com.algaworks.osworks2.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String fone;
	private String email;
	
	public String toString() {
	    return "id: " + this.getId() + " , nome: " + this.getNome() + " , e-mail: " + this.getEmail() + " , Fone: " + this.getFone(); 	
	}
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return this.fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		return true;
	} 
}
