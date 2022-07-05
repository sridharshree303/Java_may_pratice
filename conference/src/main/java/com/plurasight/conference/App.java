package com.plurasight.conference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.plurasight.conference.service.SpeakerService;

public class App
{
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SpeakerService service = appContext.getBean("speakerService",SpeakerService.class);
		System.out.println(service.findAll().get(0).getFirstName());
	}
}




//----------------------------------------------------------------

//import com.plurasight.conference.service.SpeakerService;
//import com.plurasight.conference.service.SpeakerServiceImpl;

//public class App 
//{
//    public static void main( String[] args )
//    {
//        SpeakerService service = new SpeakerServiceImpl();
//        
//        System.out.println(service.findAll().get(0).getFirstName());
//    }
//}
