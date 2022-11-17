package countStudent;

import java.util.ArrayList;
import java.util.List;

public class countclass {
	public static void main(String[] args) {
		List<counters> cc=new ArrayList<>();
		cc.add(new counters(251,"ashish"));
		cc.add(new counters(340,"yadav"));
		cc.add(new counters(201,"void"));
		cc.add(new counters(300,"static"));
		cc.add(new counters(501,"public"));
		cc.add(new counters(300,"yaduvansi"));
		long num=cc.stream().filter(s->s.getMarks()<300).count();	
		System.out.println(num);
	}

}
