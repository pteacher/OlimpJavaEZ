package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void solve(Scanner in, PrintWriter out){
        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a + b);
        out.close();
    }

    public void run() {
        try (Scanner in = new Scanner(new FileReader("a.in"));
             PrintWriter out = new PrintWriter(new FileWriter("a.out"))) {
            solve(in, out);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

