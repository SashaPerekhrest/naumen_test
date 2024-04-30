import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.printf("Hello and welcome!");
        BufferedReader br = new BufferedReader(new FileReader("src\\input.txt"));
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        var sum = 0;
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                inputList.add(Integer.valueOf(line));
                sum = sum + inputList.get(Math.toIntExact(inputList.stream().count() -1 ));
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.printf(sum + "");

            PrintWriter out = new PrintWriter(new FileWriter("src\\output.txt", false), true);
            out.write(sum + "");
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
        }
    }
}