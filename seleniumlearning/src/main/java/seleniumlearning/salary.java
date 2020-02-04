package seleniumlearning;

public class salary {
  String name;
  double total_sal;
  float da;
  float pf;
  int basic;
  
  salary(String name,float d, float e, int basic)
  
  {
	  this.name=name;
	  this.da=d;
	  this.pf=e;
	  this.basic=basic;
	  
  }
  
  double cal_sal()
 {
	 total_sal=basic+da-pf;
	return total_sal;
 }
	
}
