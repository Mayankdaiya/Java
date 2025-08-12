package labsessions.Day28_07_25;

import java.io.BufferedReader;
import java.io.FileReader;

public class stream1 {

    public static void main(String[] args) {

        try(FileReader fr = new FileReader("src/write.txt");
            BufferedReader br = new BufferedReader(fr))
        {
            System.out.println(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
