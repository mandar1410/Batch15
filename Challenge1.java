package Challenge1;

public class Challenge1 {
  public static String getDurationString(int minutes, int seconds){
	  if(minutes >=0 && seconds >=0 && seconds <=59) {
		  int hours=minutes/60;
			minutes=minutes%60;
			return "Time: "+hours+"hr "+minutes+"mins "+seconds+"secs";
		  
		
	  }
	  else {
		  return "Invaid value";
	  }
	  
  }
  public static String getDurationString(int seconds) {
	  String checkPoint = "";
      if (seconds >= 0) {
    	  checkPoint = getDurationString(seconds/60, seconds % 60);
      }else {
      	return "Invalid value";
      }
      return checkPoint;
  }
	public static void main(String[] args) {
		
		
		System.out.println(getDurationString(1500));
		

	}

}
