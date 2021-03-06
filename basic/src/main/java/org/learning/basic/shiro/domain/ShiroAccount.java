package org.learning.basic.shiro.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.learning.basic.core.domain.Account;

import java.util.HashSet;
import java.util.Set;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;

@JsonAutoDetect(creatorVisibility = NONE, fieldVisibility = NONE, getterVisibility = NONE, setterVisibility = NONE, isGetterVisibility = NONE)
public class ShiroAccount extends Account {

	/**
	 * 用户的邮箱地址
	 */
	@JsonProperty("email")
	private String email;
	/**
	 * 用户密码
	 * 不输出json
	 */
//	@JsonProperty("password")
	private String password;
	/**
	 * 状态
	 */
	@JsonProperty("status")
	private ShiroStatus status;
	/**
	 * 用户的权限
	 */
	@JsonProperty("roles")
	private Set<ShiroRole> roles = new HashSet<>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ShiroStatus getStatus() {
		return status;
	}

	public void setStatus(ShiroStatus status) {
		this.status = status;
	}

	public Set<ShiroRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<ShiroRole> roles) {
		this.roles = roles;
	}
}
