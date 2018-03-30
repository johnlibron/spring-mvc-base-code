package com.johnlibron.controller.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
	
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String loadIndexView(HttpServletRequest request, HttpServletResponse response, ModelMap map){
    	 	
		return "index";
    }

}