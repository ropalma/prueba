package com.example.demo.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class DataService {
	
    
	public Map<Object, List<Data>> getAgrupados(){
		var nationalTeam = inicializaData();
		
        nationalTeam.sort((dato1, dato2)-> dato1.getAge().compareTo(dato2.getAge()));
        
		return nationalTeam.stream().collect(Collectors.groupingBy(data-> data.getAge()));
		//return nationalTeam;
	}
	
	public Map<Object, List<Data>> getAgrupadosOrdenados(){
		
		var nationalTeam = inicializaData();
		
		
	    nationalTeam.sort((dato1, dato2)-> dato1.getName().compareTo(dato2.getName()));
	
	return nationalTeam.stream().collect(Collectors.groupingBy(data-> data.getAge()));
		
	}

	private List<Data> inicializaData() {
		List<Data> nationalTeam = new ArrayList<>();
		nationalTeam.add(new Data(37, "Claudio Bravo"));
	    nationalTeam.add(new Data(36, "Jean Beausejour"));
	    nationalTeam.add(new Data(34, "Gonzalo Jara"));
	    nationalTeam.add(new Data(33, "Gary Medel"));
	    nationalTeam.add(new Data(32, "Mauricio Isla"));
	    nationalTeam.add(new Data(31, "Charles Aránguiz"));
	    nationalTeam.add(new Data(33, "Arturo Vidal"));
	    nationalTeam.add(new Data(34, "Matias Fernandez"));
	    nationalTeam.add(new Data(36, "Jorge Valdivia"));
	    nationalTeam.add(new Data(31, "Alexis Sánchez"));
	    nationalTeam.add(new Data(30, "Eduardo Vargas"));
		return nationalTeam;
	}

}
