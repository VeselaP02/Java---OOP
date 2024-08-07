package InterfacesAndAbstraction_Exercies.Telephony;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable,Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder result = new StringBuilder();
        Pattern patternUrls = Pattern.compile("/D+");

        for (String url: urls) {
            Matcher matcherUrl = patternUrls.matcher(url);
            result.append("Browsing: ");
            while (matcherUrl.find()){
                result.append(matcherUrl.group()).append("!").append(System.lineSeparator());
            }
        }
        return result.toString();
    }

    @Override
    public String call() {
        StringBuilder result = new StringBuilder();
        Pattern patternNumbers = Pattern.compile("[/d]+");

        for (String number: numbers) {
            Matcher matcherNumber = patternNumbers.matcher(number);

            while (matcherNumber.find()){
                result.append("Calling... ").append((matcherNumber.group())).append(System.lineSeparator());
            }
        }
        return result.toString();
    }

}
