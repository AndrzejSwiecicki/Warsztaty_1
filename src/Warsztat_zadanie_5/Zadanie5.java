package Warsztat_zadanie_5;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Zadanie5 {
    public static void main(String[] args) {
        Connection connect = Jsoup.connect("http://www.onet.pl/");



        try (PrintWriter wr = new PrintWriter("popular_words.txt")){
            Document document = connect.get();
            Elements links = document.select("span.title");
            for (Element elem : links) {
                System.out.println(elem.text());
                StringTokenizer token = new StringTokenizer(elem.text(),",\\,.,?,!,;,:");
                while(token.hasMoreTokens()){
                    wr.println(token.nextToken());
                }

                }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}


