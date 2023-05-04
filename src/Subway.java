import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Subway {
  public static void main(String[] args) throws IOException {
    // csv => List<Map<String. Object>>
    List<String> inputListString = new ArrayList<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(
        new FileInputStream("C:\\workspaces\\workspace\\stream\\src\\CARD_SUBWAY_MONTH_202303.csv"), "utf-8"));

    String str = null;
    while ((str = br.readLine()) != null) {
      inputListString.add(str);
    }
    System.out.println(inputListString);
    br.close(); 

    // 집계... 그룹함수
    // Max, Min, sum, avg, count

    // 날짜별(10일 단위)
    // inputListString.stream().collect(Collectors.groupingBy())
  }
}
