package java_exam;

import javax.swing.OverlayLayout;

public class eryuan {
	
	public void fangcheng(int a,int b,int c){
		double x,x1,x2;
		if (b*b-4*a*c<0) {
			System.out.println("wujie");
		} else {
			x1 = ((-b)+Math.sqrt(b*b-4*a*c))/(2*a);
			x2 = ((-b)-Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.println(x1+" "+x2);
		}				
	}
public static void main(String[] args) {
	eryuan a=new eryuan();
	a.fangcheng(1, 2, 1);
}

}

