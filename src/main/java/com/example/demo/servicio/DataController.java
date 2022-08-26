package com.example.demo.servicio;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataController {
	
	@Autowired
	DataService dataService;
	
	@RequestMapping(value="/agrupados", method=RequestMethod.GET)
	public Map<Object, List<Data>> getAgrupados(){
		return dataService.getAgrupados();
	}
	@RequestMapping(value="/agrupadosOrdenados", method=RequestMethod.GET)
	public Map<Object, List<Data>> getAgrupadosOrdenados(){
		return dataService.getAgrupadosOrdenados();
	}

}
