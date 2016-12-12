package ua.com.cookbook.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by koko on 02.11.16.
 */
public class Parser {

    public static void main(String[] args) throws IOException {

        AlphabetParser.getIngredient(AlphabetParser.parse());


    }

}
