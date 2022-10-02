package org.cts.test;

import org.hex.test.AdditionalCourse;
import org.hex.test.BuildingDetails;
import org.tcs.test.CourseDuration;
//import packagename.classname
import org.tcs.test.LearningMode;

public class StudentDetails {
	
	//ctrl+space enter - method generation
	//private to public
	public void studentName() {
			//ctrl+d to delete a line
		System.out.println("My name is Sathish");
		
	}
	
	//main - it indicates where to start and where to end program
	public static void main(String[] args) {
		//object create - to call method outside main method
		
		//classname objectname = new classname();
		StudentDetails s = new StudentDetails();  //object - run time memory allocation
		
		//objectname.methodname
		s.studentName();
		
		
		CourseDetails c = new CourseDetails();
		c.courseName();
		c.trainerName();
		
		LocationDetails l = new LocationDetails();
		l.location();
		
		LearningMode lm = new LearningMode();
		lm.modeOfTraining();
		
		CourseDuration cd = new CourseDuration();
		cd.duration();
		
		AdditionalCourse a = new AdditionalCourse();
		a.additionalCourseName();
		
		BuildingDetails b = new BuildingDetails();
		b.buildingInfo();
	}
	

}
