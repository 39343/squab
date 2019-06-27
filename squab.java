public class squab {

	int x = 5;

	public static void main(String[] args) {
		int summand1 = 9;
		int summand2 = 0;

		int summe = summand1 + summand2;

		squab myObj = new squab();


		if (summe >10)
		{
			System.out.println("Hey");
			System.out.println(myObj.x);
		}
		else
		{
			System.out.println("Ney");
			System.out.println("neyney " +myObj.x);
		}

	}

}