package com.springboot.ms.pathologyservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ms.pathologyservice.models.Disaese;
import com.springboot.ms.pathologyservice.models.DiseaseList;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {
	
	List<Disaese> disaeses= Arrays.asList(new Disaese(100, "Cancer", "No Cigrette"),
			new Disaese(200, "Blindnees", "Lack of Vitamin A"),
			new Disaese(300, "Diabetes", "No Sugar"));
	
	
	@RequestMapping("/diseases")
	public DiseaseList getDiseaseList(){
		DiseaseList diseaseList =new DiseaseList();
		diseaseList.setDisease(disaeses);
		
		return diseaseList;
	}
	@RequestMapping("/diseases/{Id}")
	public Disaese getDiseasesById(@PathVariable("Id") Integer Id) {
		
		Disaese d = disaeses.stream().filter(dis->Id.equals(dis.getId())).findAny().orElse(null);
		
		return d;
	}
}