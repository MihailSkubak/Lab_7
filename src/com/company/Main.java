package com.company;
import java.util.Scanner;

class ConsoleMenu{
    ConsoleMenu(){
    }
    void ShowMenu(){
        System.out.println("1-Просмотр данных!");
        System.out.println("2-Добавление данных!");
        System.out.println("3-Редактирование данных!");
        System.out.println("4-Удаление данных!");
        System.out.println("5-Выход!");
    }
}
class AllBasa{
    private static String B="gddffdfd";
    public void Basa(){
        AddBasa AB=new AddBasa();
        B=B+"\n"+AB.Add();
    }
    public void Basa2(){ System.out.println(B); }

    public void Delete(){
            System.out.println("Выберите данные которые вы хотите удалить!");
            Scanner in = new Scanner(System.in);
            String g = in.nextLine();
            B = B.replace(g, "");
            System.out.println("Данные успешно удалены!");
        }
    public void Replase(){
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите строку!");
        String r=in.nextLine();
        System.out.println("Замените!");
        String r2=in.nextLine();
        B=B.replace(r, r2);
        System.out.println("Данные успешно заменены!");
    }
        }


class AddBasa{
    ConsoleMenu cs = new ConsoleMenu();
    AllBasa AL=new AllBasa();
    static String A="";
    public void Add1(){
        System.out.println("Добавте данные!");
        Scanner in = new Scanner(System.in);
        A=in.nextLine();
        AL.Basa();
        System.out.println("Данные успешно добавлены!");
    }
    public String Add(){
        return A;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль!");
        String Password=in.nextLine();
        if(Password.equals("Hello123")) {
            ConsoleMenu cs = new ConsoleMenu();
            AddBasa AB=new AddBasa();
            AllBasa AL=new AllBasa();
            int ch=0;
            cs.ShowMenu();
            do {
                ch=in.nextInt();
                if(ch<0 || ch>5){
                    ch=0;
                }
               switch (ch) {
                   case 0:{
                       System.out.println("Неверные данные, выберите вариант от одного до пяти!");
                       break;
                   }
                    case 1: {
                        AL.Basa2();
                        cs.ShowMenu();
                        break;
                    }
                    case 2:{
                        AB.Add1();
                        cs.ShowMenu();
                        break;
                    }
                    case 3: {
                        AL.Replase();
                        cs.ShowMenu();
                        break;
                    }
                    case 4: {
                        AL.Delete();
                        cs.ShowMenu();
                        break;
                    }
                }
            } while (ch != 5);
        }else{
            System.out.println("Неверный пароль!");
        }
    }}