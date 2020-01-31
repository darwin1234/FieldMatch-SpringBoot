package com.memorynotfound.spring.security.web.dto;

import org.hibernate.validator.constraints.NotEmpty;

import com.memorynotfound.spring.security.constraint.FieldMatch;

@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match")
public class RegisterDto {
	 @NotEmpty
	    private String password;

	    @NotEmpty
	    private String confirmPassword;

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getConfirmPassword() {
	        return confirmPassword;
	    }

	    public void setConfirmPassword(String confirmPassword) {
	        this.confirmPassword = confirmPassword;
	    }

}
