package ua.com.cookbook.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ua.com.cookbook.entity.Dish;
import ua.com.cookbook.entity.Ingredient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AlphabetParser {

	

    public static List<String> parse() throws IOException {
    	
   
    	
        List<String> links = new ArrayList<>();

        Document document = Jsoup.connect("http://fedup.com.au/recipes/blog").get();

        Elements elements = document.select("div.items-more > ol > li > a");

        for (Element element : elements) {
            links.add(element.attr("href"));
        }

        return  links;
    }

    public static List<Ingredient> getIngredient(List<String> links) throws IOException {
        Dish dish;
    
        List<Ingredient> linkLetterList = new ArrayList<>();

        for (int i = 0; i <links.size(); i++) {
            Document document = Jsoup.connect("http://fedup.com.au"+links.get(i)).get();

            Elements elements = document.select("article.item-page > p");

            dish = new Dish(document.select("h1.title").text());

            System.out.println("dishname "+dish);

            for (Element element : elements) {
                System.out.println(element);
            }
        }

        return null;
    }



//    public static List<String> parseAlphabet() throws IOException {
//        Document document = Jsoup.connect("http://www.bbc.co.uk/food/ingredients").get();
//        List<String> linkLetterList = new ArrayList<>();
//
//        Elements elements = document.select("ol.resource-nav > li > a");
//
//        for (Element element : elements) {
//            if(element.hasClass("empty")){
//
//            }else {
//                linkLetterList.add(element.attr("href"));
//            }
//        }
//
////        for (String letterLink : linkLetterList) {
////            System.out.println(letterLink);
////        }
//
//        return linkLetterList;
//    }
//
//    public static List<Ingredient> getIngredient(List<String> links) throws IOException {
//        List<Ingredient> linkLetterList = new ArrayList<>();
//
//        for (int i = 0; i <links.size(); i++) {
//            Document document = Jsoup.connect("http://www.bbc.co.uk"+links.get(i)).get();
//
//            Elements elements = document.select("li.resource > a");
//
//            for (Element element : elements) {
//                if(element.text().startsWith("Related")){
//                }else{
////                    linkLetterList.add(element.text());
//                }
//            }
//        }
//
//        return null;
//    }


}
