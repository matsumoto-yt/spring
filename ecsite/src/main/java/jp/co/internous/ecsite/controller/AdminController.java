package jp.co.internous.ecsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.ecsite.model.form.LoginForm;

@Controller
@RequestMapping("/ecsite/admin")

public class AdminController {
	
	@RequestMapping("/")
	public String index() {
		return "adminindex";
	}
	
	@PostMapping("/welcome")
	public String welcome(LoginForm form , Model m) {
		System.out.println(form.getUserName() + "" + form.getPassword());
		
		return "welcome";
	}

}
