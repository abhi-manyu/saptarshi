package org.Student.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController
{
   @GetMapping(value="/showlogin")
   public String displayLoginForm()
   {
	   return "login";
   }
   
   @PostMapping(value="/login")
   public String login(HttpServletRequest request,Model mod)
   {
	   String user_name=request.getParameter("unm");
	   String password=request.getParameter("pass");
	   if(user_name.equals("saptarshi") && password.equals("ghosh"))
	   {
		   String msg="log in successfull";
		   mod.addAttribute("succ",msg);
		   return "logsuc";
	   }
	   return "logfail";
   }
}
