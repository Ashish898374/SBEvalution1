package Maxstudentmarks;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Mainc {
	public static void main(String[] args) {
		List<stt> s=new ArrayList<>();
		s.add(new stt(7,"yadav",450));
		s.add(new stt(5,"kasi",400));
		s.add(new stt(6,"kedarnath",3));
		s.add(new stt(4,"mahadev",504));
		s.add(new stt(9,"adiyogi",7));
		s.add(new stt(8,"mahakal",205));
		Optional<stt> p=s.stream().min((s1,s2)->s1.getId()<s2.getId()? +1: -1);
		stt maxstudent= p.get();
		
		System.out.println(maxstudent);    // heigh marks student ko print ko karega 
	}

}
