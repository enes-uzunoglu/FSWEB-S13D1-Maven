package org.example;

public class Main {
    public static void main(String[] args) {
        // "Hello world!" mesajı
        System.out.println("Hello world!");

        // Test durumlarını çağırma
        testBarking();
        testHasTeen();
        testIsCatPlaying();
        testArea();

        // Diğer metodlar test edilebilir
        // hasTeen(13, 17, 22);
        // isCatPlaying(true, 30);
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }else if (isBarking && (clock < 8 || clock >= 20)) {
            return true;
        }else {
            return false;
        }
    }

    public static void testBarking() {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("----------------------------------");
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if(firstAge>=13 && firstAge <= 19 || secondAge>=13 && secondAge <= 19 || thirdAge>=13 && thirdAge <= 19){
            return true;
        }
        else {
        return false;
        }
    }

    public static void testHasTeen() {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("----------------------------------");
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer==true){
            if(temp>=25 && temp<=45){
                return  true;
            }else{
                return false;
            }
        }else{
            if(temp>=25 && temp<=35){
                return  true;
            }else{
                return false;
            }
        }
    }

    public static void testIsCatPlaying() {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("----------------------------------");
    }

    public static double area(double width, double height) {
        if(width>0&&height>0){
            return (width*height);
        }else {
            return -1;
        }
    }

    public static double area(double radius) {
        if(radius>0){
            return (radius*radius*Math.PI);
        }else {
            return -1;
        }
    }

    public static void testArea() {
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1, 4.0));
        System.out.println("----------------------------------");
        System.out.println(area(5));
        System.out.println(area(-1));
    }
    }


