package com.mt.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeService {

	
	@RequestMapping(value = "/getEmployeeDetails", method = RequestMethod.GET)
	@ResponseBody
	String uploadImage(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws JSONException {

		JSONObject js = new JSONObject();
		js.put("Name", "LION TECH Solutions");
		js.put("Calling Name", "Lion ");
		js.put("LION TECHACADEMY", "2020-08-21");
		js.put("Frank", "1975-08-21");
		js.put("Hobbies", "Reading Technical Blogs,Teaching, Changing lives..");
		js.put("Places he like", "Africa, Church, His native place");
                                        js.put("DevOps Modules", "Maven, Github/Git, Nexus, Sonarqube, Jenkins His native place");
		return js.toString();
}
}
