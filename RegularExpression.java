package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public String readInputText() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        System.out.println("");
        return br.readLine();

      /*All Saints, Margaret Street, is a Grade I listed Anglican church in London.*/
    }

    public String processText(String inputText) {
        Pattern p = Pattern.compile("(e)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(inputText);
        String finalStr = matcher.replaceAll("");

        return finalStr;
    }
    public void showResult(String resultText) {
        System.out.print(resultText);
    }

}