import java.net.*;

public class WebScraper {
    public static void main(String[] unused) {try
    {
        URL url = new URL("http://erdani.com/tdpl/hamlet.txt");
        System.out.println(url.toString());
    }catch(MalformedURLException nameOfTheException) {
        System.out.println("url");
        //put exceptioncode here
    }
    }
}
