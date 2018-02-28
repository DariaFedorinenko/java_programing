package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

                RegularExpression regularExpression = new RegularExpression();
                String str = regularExpression.readInputText();
                regularExpression.showResult(regularExpression.processText(str));


    }
}


