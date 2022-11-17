package Question1;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	
	
	public static void main(String[] args) {
//      List<Student> s=new ArrayList<>();
//      s.add(new Student(1,))
      Predicate<student> p1= s->s.getMarks()>500;
      System.out.println(p1.test(new student(1,"sonu",300)));

      Consumer<student> c2=s->{
          System.out.println("Roll is: "+s.getRoll());
          System.out.println("Name is: "+s.getName());
          System.out.println("Marks is: "+s.getMarks());
      };
      c2.accept(new student(1,"rakesh",800));
      Supplier<student>s3=()->new student(2,"monu",400);
      System.out.println(s3.get());

      Convert f=num-> Integer.parseInt(num);
      System.out.println(f.check("500"));
  }

	}


