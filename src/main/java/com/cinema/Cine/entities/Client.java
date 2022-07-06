package com.cinema.Cine.entities;

import java.util.Objects;

public class Client {
	public Long id;
	public String name;
	public Integer age;
	public String email;
	public Integer senha;
	
	public Client() {}
	
	public Client(Long id, String name, Integer age, String email, Integer senha) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.senha = senha;
	}
ssssssssssss
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, email, id, name, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(age, other.age) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(senha, other.senha);
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", senha=" + senha + "]";
	}
}
