package ss19_String_Regex.thuchanh;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/duyen-ta-troi-lay-anh-khoa-cover.73Aut9bi6Vw2.html");
            Scanner scanner=new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content=scanner.next();
            scanner.close();
            content=content.replaceAll("\\n+","");
            Pattern pattern=Pattern.compile("\"name_song\">(.*?)</a>\"");
            Matcher matcher=pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
