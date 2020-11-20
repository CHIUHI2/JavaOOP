package com.main;

import Printer.Printer;
import Printer.ColorPrinter;
import Printer.BlackAndWhitePrinter;

public class Main {
    public static void main(String[] args) {
        //10. Polymorphism
        Printer printer = new Printer();
        ColorPrinter colorPrinter = new ColorPrinter();
        BlackAndWhitePrinter blackAndWhitePrinter = new BlackAndWhitePrinter();

        printer.printing();
        colorPrinter.printing("red");
        blackAndWhitePrinter.printing();
    }
}
