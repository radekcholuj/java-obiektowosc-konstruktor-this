public class SalonProgram {
    public static void main(String[] args) {
        char[] mark1 = {'B','M','W'};
        char[] model1 = {'I', ' ', '3', '1', '5'};
        double price1 = 175.6;
        Salon s1 = new Salon(mark1, model1, price1);

        char[] mark2 = {'A','u','d','i'};
        char[] model2 = {'A', '7'};
        double price2 = 94.4;
        Salon s2 = new Salon(mark2, model2, price2);

        Salon[] salons = new Salon[2];
        salons[0] = s1;
        salons[1] = s2;

        for (Salon salon : salons) {
            System.out.print("Mark: ");
            for (char c : salon.mark) {
                System.out.print(c);
            }
            System.out.println();

            System.out.print("Model: ");
            for (char c : salon.model) {
                System.out.print(c);
            }
            System.out.println();
            System.out.println("Price: "+salon.price);
            System.out.println();
        }
    }
}

