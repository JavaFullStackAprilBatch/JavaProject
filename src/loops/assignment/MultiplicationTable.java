package loops.assignment;

public class MultiplicationTable {

	public void printTable(int k) {
		for(int i =1;i<=20;i++){
			System.out.println(i +" x "+k +" = "+ i*k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiplicationTable table= new MultiplicationTable();
		table.printTable(5);
	}

}
