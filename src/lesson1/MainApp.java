/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;
import java.util.Scanner;

public class MainApp {
    public static void four(){
        int j=0;
		for(int i=0;i<=100;i++){
			
			j=i+j;
			System.out.println(j);
                }
    }
    public static void five(){
        int a = -699;
		int b = 9;
		int c = -17;
		if(a>b && a>c){
			System.out.println("Большим числом является: "+a);
		}else if(b>a && b>c){
			System.out.println("Большим числом является: "+b);
		}else{
			System.out.println("Большим числом является: "+c);

		}
    }
    public static void six(){
        Scanner in = new Scanner(System.in);
		System.out.println("Vvedite chislo ot 1 do 9");
		int nums = in.nextInt();
		if(nums<10 && nums>0){
			System.out.println("Vashe chislo "+nums);
		}else{
			System.out.println("Vvedite vernoe chislo");
		}
    }
    public static void seven(){
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite chislo ot 1 do 9");        
		int aa = in.nextInt();
		int aaa;
		aaa=aa%2;
		if(aaa>0){
			System.out.println("ne chetnoe");
		}else{
			System.out.println("chetnoe");
		}
    }
    public static void eight(){
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite chislo ot -9 do 9");
			int bb = in.nextInt();
			int bbb;
                        int bbbb;
			bbb=bb%2;
                        bbbb=bb/2;
			if(bbbb-bbb!=0 && bb>0){
				System.out.println("chetnoe i pologit");
			}else{
				System.out.println("ne chetnoe ili ne pologit");
                        }
    }
    public static void nine(){
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite nazvanie mesytsa");
            String nameMes = in.next();
            String January = "January";
            String February ="February ";
            String March ="March";
            String April = "April";
            String May = "May";
            String June = "June";
            String July = "July";
            String August = "August";
            String September = "September";
            String October = "October";
            String November = "November";
            String December = "December";
            if(nameMes.equals(January)|| nameMes.equals(February) || nameMes.equals(December)){
                    System.out.println("zima");

            } else if(nameMes.equals(March)|| nameMes.equals(April) || nameMes.equals(May)){
                    System.out.println("vesna");

            } else if(nameMes.equals(June)|| nameMes.equals(July) || nameMes.equals(August)){
                    System.out.println("leto");

            } else if(nameMes.equals(September)|| nameMes.equals(October) || nameMes.equals(November)){
                    System.out.println("osen");
            } else {
                System.out.println("месец введен не коректно или не с большой буквы");
            }
    }
    public static void vybor(String methodNume) {    	
            switch(methodNume) {                
                case "4": MainApp.four();
                    break; 
                case "5": MainApp.five();
                    break;
                case "6": MainApp.six();
                    break;
                case "7": MainApp.seven();
                    break;
                case "8": MainApp.eight();
                    break;
                case "9": MainApp.nine();
                    break;
                default: System.out.println("Введено не коректное значение!");
            }
    };
    

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String i="1";
 
    do {
        System.out.println("Какой метод хотите проверить?(введите от 4 до 9)");
        String nameMes = in.nextLine();
        MainApp.vybor(nameMes);
        System.out.println("Проверить следующий метод?(да-1 или нет-любое число)");
        i = in.nextLine();
        
    } while (i.equals("да"));
    System.out.println("vyhod"); //Это можно использовать для простого перевода строки    
            }
    }
