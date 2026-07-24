package files.summary.application;

import files.summary.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String projectPath = System.getProperty("user.dir");
        String sourcePath = projectPath + "\\files\\summary\\products.txt";

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {

            br.readLine();
            String line = br.readLine();

            while (line != null) {

                String[] vect = line.split(",");

                String name = vect[0];
                double price = Double.parseDouble(vect[1]);
                int quantity = Integer.parseInt(vect[2]);

                Product product = new Product(name, price, quantity);

                list.add(product);

                line = br.readLine();
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        File folder = new File(projectPath + "\\files\\summary\\out");

        if (!folder.exists()) {
            folder.mkdirs();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(projectPath + "\\files\\summary\\out\\summary.txt"))) {

            for (Product p : list) {
                bw.write(p.getName() + "," + String.format("%.2f", p.totalPrice()));
                bw.newLine();
            }

            System.out.println("Summary successfully written!");

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
