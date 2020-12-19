

package com.javarush.task.task33.task3309;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Stars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countStars = Integer.parseInt(reader.readLine());
        reader.close();
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < 1000; i++) {
            System.out.print("*");
        }
        //Спросить сколько вести звёздочек
        System.out.println("сколько звёздочек хочещь увмдеть");
        for (int i = 0; i < countStars; i++) {
            System.out.println("*");
        }
        //Вывести через while
        while (countStars > 0) {
            System.out.print("*");
            countStars--;
        }
    }
}


//      Solution for JS
//
//    for (let i = 0; i < 10; i++) {
//    console.put('*');
//    }
//    for (let i = 0; i < 100; i++) {
//    console.put('*');
//    }
//    for (let i = 0; i < 1000; i++) {
//    console.put('*');
//    }
//    //Спросить сколько и вы вести звёздочки
//    let countStars = +prompt('сколько звёздочек хочещь увмдеть');
//    for (let i = 0; i < countStars; i++) {
//    console.log('*');
//    }
//    //Вывести через while
//    while (countStars > 0) {
//    console.put('*');
//    countStars--;
//    }