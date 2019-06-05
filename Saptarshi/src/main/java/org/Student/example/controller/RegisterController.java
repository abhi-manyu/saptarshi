package org.Student.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController
{
	@RequestMapping(value="/register")
    public String register(HttpServletRequest request,Model mod)
    {
    	
    	int roll=Integer.parseInt(request.getParameter("rl"));
    	String name=request.getParameter("nm");
    	String address=request.getParameter("add");
    	String pas=request.getParameter("pas");
    	String cpas=request.getParameter("cpas");
    	
    	if(pas.equals(cpas))
    	{
    		mod.addAttribute("roll",roll);
    		mod.addAttribute("name",name);
    		mod.addAttribute("address",address);
    		return "welcome";
    	}
    	
    	String fsms="registeration failed";
    	mod.addAttribute("fal", fsms);
    	return "failed";
    }
	
	
	/*@RequestMapping(value="/login", method=RequestMethod.POST)
	//@PostMapping
	public ModelAndView Login(HttpServletRequest request)
    {
    	
    	String username=request.getParameter("unm");
    	String password=request.getParameter("pas");
    	if(password.equals("saptarshi"))
    	{
    		String sms="welcome u r logged in as : "+username;
    	   return new ModelAndView("success","wel", sms);
    	}
    	String sms2="username and password not matched";
    	return new ModelAndView("failed2","fail",sms2);
    }*/
	
}
