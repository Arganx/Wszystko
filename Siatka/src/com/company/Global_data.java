package com.company;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Global_data {
    private double h;
    private double b;
    private double nH;
    private double nB;
    private double nh;
    private double ne;

    public double getH() {
        return h;
    }

    public double getB() {
        return b;
    }

    public double getnH() {
        return nH;
    }

    public double getnB() {
        return nB;
    }

    public double getNh() {
        return nh;
    }

    public double getNe() {
        return ne;
    }

    public Global_data() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("name.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            this.h = Double.parseDouble(bufferedReader.readLine());
            this.b = Double.parseDouble(bufferedReader.readLine());
            this.nH = Double.parseDouble(bufferedReader.readLine());
            this.nB = Double.parseDouble(bufferedReader.readLine());
            this.nh = Double.parseDouble(bufferedReader.readLine());
            this.ne = Double.parseDouble(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
