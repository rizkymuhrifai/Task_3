/* 
Nama 	: Rizky Muhammad Rifai
NIM  	: 1301144099
Kelas	: IF-38-09 
*/
	 
public class Driver {
 public static void main(String[] args) {
  AppStore aps = new AppStore();
  SmartPhone sm = new SmartPhone();
  aps.createNewApp("App1", 100);
  aps.createNewApp("App2", 200);
  aps.createNewApp("App3", 300);
  aps.createNewApp("App4", 400);
  System.out.println(aps.toString());
  System.out.println(aps.getApp(2).toString());
 		
  sm.setMemory(300);
  System.out.println(sm.toString());
  sm.addApplication(aps, 1);
 		
  System.out.println(sm.toString());	
 }
}
