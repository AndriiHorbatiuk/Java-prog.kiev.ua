package parseHtml;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;

/**
 * Created by Andrey on 22.08.2016.
 */
public class ParseHtml {
    public static void main(String[] args) throws IOException {
        String site1 = "http://finance.ua/ua/currency";
        String site2 = "http://tables.finance.ua/ua/currency/order";

        URL url = new URL(site2);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000];
            StringBuilder sb = new StringBuilder();
            int r;
            do {
                if ((r = br.read(buf)) > 0) {
                    sb.append(new String(buf, 0 , r));
                }
            }
            while (r > 0);
            System.out.println(sb.toString());
        }finally {
            http.disconnect();
        }


    }
}
