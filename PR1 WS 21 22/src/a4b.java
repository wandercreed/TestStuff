import java.util.Arrays;

public class a4b {
	/*schreiben Sie ein Programm, das ein Array mit 20 Zufallszahlen zwischen 1 und 100 anlegt.
	Durchlaufen Sie das Array mit einer for-Schleife und ermitteln Sie die größte Zahl, indem Sie Zahlen
	vergleichen. Dazu legen Sie sich eine Variable an, in der Sie die bisher größte Zahl speichern*/
	public static void main(String[] args) {

		int[] array = new int[20];
		int grosstezahl = 0;
		int position = 0;

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 100) + 1;
			System.out.println("Zahl auf position " + i + " " + array[i]);

			for (int j = 0; j < array.length; j++) {

				if (array[i] > grosstezahl) {

					grosstezahl = array[i];
					position = i;
				}

			}
		}
		System.out.printf("Zahl %d auf %d. position ist die grosste \n", grosstezahl, position);
		System.out.println("Zahlen sind " + Arrays.toString(array));
	}

}
