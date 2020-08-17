

enum Weekend {
	Sunday, Monday ,Tuesday,Wednesday,Thursday,Friday
}




public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Weekend [] weekend = Weekend.values();
		
		for(Weekend week : weekend) {
			System.out.println(week);
		}
				

	}

}
