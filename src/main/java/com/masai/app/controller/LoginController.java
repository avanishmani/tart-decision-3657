package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.exceptions.LoginException;
import com.masai.app.model.CurrentUserSession;
import com.masai.app.model.LoginDTO;
import com.masai.app.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService cuLogin;

	@PostMapping("/login")
	public ResponseEntity<CurrentUserSession> loginCustomerHandler(@RequestBody LoginDTO dto) throws LoginException {
		return new ResponseEntity<CurrentUserSession>(cuLogin.LoginIntoAccount(dto), HttpStatus.OK);
	}

	@PostMapping("/logout")
	public ResponseEntity<String> logoutCustomerHandler(@RequestParam("token") String key) throws LoginException {
		return new ResponseEntity<String>(cuLogin.LogoutFromAccount(key), HttpStatus.OK);
	}
	
	@PostMapping("/logoutfromall")
	public ResponseEntity<String> logoutFromAllDevicesHandler(@RequestParam("token") String key) throws LoginException {
		return new ResponseEntity<String>(cuLogin.LogoutFromAccount(key), HttpStatus.OK);
	}
}
