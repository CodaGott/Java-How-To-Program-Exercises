public class WhatWillThisPrint {
    public static void main(String[] args) {
        int count = 1;
        int row =10;

        while (count <= 10){
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            count++;
            // ternary operator or modified if, if else and else statement. ? :

        }
        while (row >=1){
            int column = 1;
            while (column <=10){
                System.out.println(row % 2 == 1 ? "<" : ">");
                column++;
            }
            --row;
            System.out.println();
        }

        int x = 9, y = 11;
        if (x < 10){

        }
            if (y > 10){
                System.out.println("*****");}
            else{
                System.out.println("#####");
                System.out.println("$$$$$");}

            int c = 8;
            int d = 5;
            if (c == 7){
            if (d == 5)
            System.out.println("@@@@@");}
            else{
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");}
    }
}
