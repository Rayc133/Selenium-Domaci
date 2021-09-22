package SeleniumOsnove;

//Za domaci: Happy path klasa, Sad path klasa(proizvoljno netacan username/password) i
// u Mainu pozivate jednu ili drugu klasu.


import java.util.Scanner;

public class MainProvera {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		HappyFlow p1 = new HappyFlow();

		SadFlow s1 = new SadFlow();

		int izbor = 0;

		System.out.println("Izaberi : \n1.Happy Flow\n2.Sad Flow");

		izbor = sc.nextInt();

		switch (izbor) {

		case 1:
			p1.happyFlow();
			break;

		case 2:
			s1.sadflow();
			break;

		}

	}

}
