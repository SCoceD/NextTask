

package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function print some count of asterisk on the screen
 */
public class Stars {
    int countStars;

    /**
     * Start
     *
     * @throws IOException
     */
    public void start() throws IOException {
        askNumberOfStars();
        printAsteriskFromUser();
        printAsteriskFromUserWithWhile();
        printTenAsterisk();
        printOneHundredAsterisk();
        printOneThousandAsterisk();
    }

    /**
     * This function ask how many asterisk should be show on the screen
     *
     * @throws IOException
     */
    private void askNumberOfStars() throws IOException {
        System.out.println("сколько звёздочек хочещь увмдеть");
        countStars = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    /**
     * This function print as many asterisk as the user entered
     */
    private void printAsteriskFromUser() {
        for (int i = 0; i < countStars; i++) {
            printAsterisk();
        }
        System.out.println("");
    }

    /**
     * This function print as many asterisk as the user entered with loop while
     */
    private void printAsteriskFromUserWithWhile() {
        while (countStars > 0) {
            printAsterisk();
            countStars--;
        }
        System.out.println("");
    }

    /**
     * This function print ten asterisk on the screen
     */
    private void printTenAsterisk() {
        for (int i = 0; i < 10; i++) {
            printAsterisk();
        }
        System.out.println("");
    }

    /**
     * This function print one hundred asterisk on the screen
     */
    private void printOneHundredAsterisk() {
        for (int i = 0; i < 100; i++) {
            printAsterisk();
        }
        System.out.println("");
    }

    /**
     * This function print one thousand asterisk on the screen
     */
    private void printOneThousandAsterisk() {
        for (int i = 0; i < 1000; i++) {
            printAsterisk();
        }
        System.out.println("");
    }

    /**
     * This function print one asterisk on the screen
     */
    private void printAsterisk() {
        System.out.print("*");
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
//    }sihjjdjididiuiufioiiusidsia8udodudiiuyee88ydydussywAYTYS6JFKSDZHDJXZHHUHHHYSHYUEW57YEGYZXTTRSHRYWHHHGDRDGGTFGHRPJDDDAAAFHHYIIUOUUU
// knhkskiolajslill6hdljckdjdpsjsmkjhskhfw,mddfjkdfvcnnzjjjjkjidue7ryiuqhloyy0jhjjksjjhjyudswayiyywyesuyyweeswtywttdsaejljfimfkxdjkdfjchxxcch
//dklxkdghgfdfddagyekckhdzgxkfivjx,.ckxljgkjjkkjieopq9oipslixvk.xki;oxljcksjhzkjs
//    //Вывести через whilexkiudiyiuufu888ffhcyuuhigvihitfdeaouytnyjjjklkjhcchuiicfkiofocdoiuuuiisuduuduuyuiuausysiusyhsgahshuhdhghugaytytuyyttd
//    while (countStars > 0) {
//    console.put('*');uiuruueryuruyggfgggggtgtuhhyuuuuhchhjuuyioyijiiyziuutfthjhhsusjghysjhshhduyshhhushhuhhyyyytdyrhyrsjuuidshtjjsuuuiujkuhudhhgj
//    countStars--;
//    }