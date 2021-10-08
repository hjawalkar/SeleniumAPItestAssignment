package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
/*Blaze demo browser automation
 * Created script by Hanumanth 
 * Date:06-10-2021
 */
public class CsvReader {

    private static final String CSV_SEPARATOR=",";

    public List<String[]> parseFile(String fileName){
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            br.readLine();
            List<String[]> lines = new ArrayList<>();
            String line;
            while((line = br.readLine()) != null){
                lines.add(line.split(CSV_SEPARATOR));
            }
            return lines;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
