import java.util.Scanner;

public class picerija {
    public static void main(String[] args) {
        float storapade = 2, plonapade = 1.5f;
        float dydis_20 = 0.5f, dydis_30 = 1, dydis_50 = 2;
        float suris = 0.5f, kumpis = 0.5f, desra = 0.5f,
                pomidorai = 0.5f, pievagrybiai = 0.5f, alyvuoges = 0.5f, mar_agurkai = 0.5f;

        Scanner reader = new Scanner(System.in);
        System.out.println("Pasigaminkite pica: ");
        System.out.print("1 zingsnis. Picos tipas - storapade ar plonapade: ");
        String picu_tipas = reader.nextLine();
        System.out.print("2 zingsnis. Picos dydis - 20cm, 30cm, 50cm: ");
        int picu_dydis = reader.nextInt();

        System.out.println("3 zingsnis. Ingredientai: ");
        System.out.println("1. Suris ");
        System.out.println("2. Kumpis ");
        System.out.println("3. Desra ");
        System.out.println("4. Pomidorai ");
        System.out.println("5. Pievagrybiai ");
        System.out.println("6. Alyvuoges ");
        System.out.println("7. marinuoti agurkeliai ");


        System.out.print("Kiek reikia ingredientu?  ");
        int kiekis = reader.nextInt();
        String sum_kiekis = null;
        System.out.println("Iveskite ingredientus vienoje eiluteje:  ");
        for (int i = 0; i <= kiekis; i++) {
            // sum_kiekis+=kiekis;


            String ingredient = reader.nextLine();
            if (i == 0) {
                sum_kiekis = ingredient;

            } else {

                sum_kiekis += ingredient;
            }


        }
        System.out.print(sum_kiekis + " ");


    }
}
