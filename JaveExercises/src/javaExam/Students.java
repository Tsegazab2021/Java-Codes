package javaExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Students {
	
	      private Integer id;
	      private String name;
	  
	    // create constructor for reference
	    public Students(Integer id, String name){
	this.id = id;
	this.name = name;
	    }
	  
	    public Integer getId(){
	        return id;
	    }
	  
	    public String getName(){
	        return name;
	    }
	}
	 
	 class ListToMap {

	public void main(String[] args) {
		 List<Students> students = new ArrayList<Students>();
		 
	        students.add(new Students(1, "Equar"));
	        students.add(new Students(2, "Amanuel"));
	        students.add(new Students(3, "Hawaz"));
	  
	        // create Map object
	        Map<Integer, String> map = new HashMap<>();
	  
	        for (Students stu : students) {
	            map.put(stu.getId(), stu.getName());
	            System.out.println(stu.getId() + " " + stu.getName());
	        }
	        // put every list element to the Map using the IDs as keys and the names as values
	 
	    }
	}
	 

	 
	 
	 
	 
	 