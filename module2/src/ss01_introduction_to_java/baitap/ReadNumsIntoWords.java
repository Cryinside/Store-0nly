package ss01_introduction_to_java.baitap;

import java.util.Scanner;

public class ReadNumsIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên không âm có tối đa 3 chữ số: ");
        int nums = scanner.nextInt();
        String res = "";
        String first = "";
        String third = "";
        String second = "";
        int x = (nums % 100) / 10;
        int x1 = (nums % 100) % 10;
        if (nums >= 0 && nums <= 13) {

            switch (nums) {
                case 0:
                    res = "zero";
                    break;
                case 1:
                    res = "one";
                    break;
                case 2:
                    res = "two";
                    break;
                case 3:
                    res = "three";
                    break;
                case 4:
                    res = "four";
                    break;
                case 5:
                    res = "five";
                    break;
                case 6:
                    res = "six";
                    break;
                case 7:
                    res = "seven";
                    break;
                case 8:
                    res = "eight";
                    break;
                case 9:
                    res = "nine";
                    break;
                case 10:
                    res = "ten";
                    break;
                case 11:
                    res = "eleven";
                    break;
                case 12:
                    res = "twelve";
                    break;
                case 13:
                    res = "thirteen";
                    break;
            }
        } else if (nums >= 14 && nums <= 19) {
            String second1 = "teen";
            switch (nums % 10) {
                case 4:
                    second = "four";
                    break;
                case 5:
                    second = "five";
                    break;
                case 6:
                    second = "six";
                    break;
                case 7:
                    second = "seven";
                    break;
                case 8:
                    second = "eight";
                    break;
                case 9:
                    second = "nine";
                    break;
            }
            res = second + " " + second1;
        } else if (nums < 20) {
            switch (nums / 10) {
                case 2:
                    third = "twenty";
                    break;
                case 3:
                    third = "thirty";
                    break;
                case 4:
                    third = "four-ty";
                    break;
                case 5:
                    third = "fifty";
                    break;
                case 6:
                    third = "sixty";
                    break;
                case 7:
                    third = "seventy";
                    break;
                case 8:
                    third = "eighty";
                    break;
                case 9:
                    third = "ninety";
                    break;
            }
            res = third;
        } else if (nums >= 20) {
            if (nums < 100) {
                switch (nums / 10) {
                    case 2:
                        first = "twenty";
                        break;
                    case 3:
                        first = "thirty";
                        break;
                    case 4:
                        first = "four-ty";
                        break;
                    case 5:
                        first = "fifty";
                        break;
                    case 6:
                        first = "sixty";
                        break;
                    case 7:
                        first = "seventy";
                        break;
                    case 8:
                        first = "eighty";
                        break;
                    case 9:
                        first = "ninety";
                        break;
                }
                switch (nums % 10) {
                    case 1:
                        second = "one";
                        break;
                    case 2:
                        second = "two";
                        break;
                    case 3:
                        second = "three";
                        break;
                    case 4:
                        second = "four";
                        break;
                    case 5:
                        second = "five";
                        break;
                    case 6:
                        second = "six";
                        break;
                    case 7:
                        second = "seven";
                        break;
                    case 8:
                        second = "eight";
                        break;
                    case 9:
                        second = "nine";
                        break;
                }
                res = first + " " + second;
            } else if (nums < 1000) {
                if (nums % 100 == 0) {
                    switch (nums / 100) {
                        case 1:
                            third = "one hundred";
                            break;
                        case 2:
                            third = "two hundred";
                            break;
                        case 3:
                            third = "three hundred";
                            break;
                        case 4:
                            third = "four hundred";
                            break;
                        case 5:
                            third = "five hundred";
                            break;
                        case 6:
                            third = "six hundred";
                            break;
                        case 7:
                            third = "seven hundred";
                            break;
                        case 8:
                            third = "eight hundred";
                            break;
                        case 9:
                            third = "nine hundred";
                            break;
                    }
                    res = third;
//                    (nums % 100) / 10 > 0
                } else if ((nums % 100) / 10 ==1) {
                    switch (nums / 100) {
                        case 1:
                            first = "one hundred";
                            break;
                        case 2:
                            first = "two hundred";
                            break;
                        case 3:
                            first = "three hundred";
                            break;
                        case 4:
                            first = "four hundred";
                            break;
                        case 5:
                            first = "five hundred";
                            break;
                        case 6:
                            first = "six hundred";
                            break;
                        case 7:
                            first = "seven hundred";
                            break;
                        case 8:
                            first = "eight hundred";
                            break;
                        case 9:
                            first = "nine hundred";
                            break;
                    }
                    switch ((nums % 100) % 10) {
                        case 0:
                            second = "ten";
                            break;
                        case 1:
                            second = "eleven";
                            break;
                        case 2:
                            second = "twelve";
                            break;
                        case 3:
                            second = "thirteen";
                            break;
                        case 4:
                            second = "fourteen";
                            break;
                        case 5:
                            second = "fifteen";
                            break;
                        case 6:
                            second = "sixteen";
                            break;
                        case 7:
                            second = "seventeen";
                            break;
                        case 8:
                            second = "eighteen";
                            break;
                        case 9:
                            second = "nineteen";
                            break;

                    }
                    res = first + " and " + second;

                } else {
                    switch (nums / 100) {
                        case 1:
                            first = "one hundred";
                            break;
                        case 2:
                            first = "two hundred";
                            break;
                        case 3:
                            first = "three hundred";
                            break;
                        case 4:
                            first = "four hundred";
                            break;
                        case 5:
                            first = "five hundred";
                            break;
                        case 6:
                            first = "six hundred";
                            break;
                        case 7:
                            first = "seven hundred";
                            break;
                        case 8:
                            first = "eight hundred";
                            break;
                        case 9:
                            first = "nine hundred";
                            break;
                    }
                    switch ((nums % 100) / 10) {
                        case 2:
                            second = "twenty";
                            break;
                        case 3:
                            second = "thirty";
                            break;
                        case 4:
                            second = "four-ty";
                            break;
                        case 5:
                            second = "fifty";
                            break;
                        case 6:
                            second = "sixty";
                            break;
                        case 7:
                            second = "seventy";
                            break;
                        case 8:
                            second = "eighty";
                            break;
                        case 9:
                            second = "ninety";
                            break;
                    }
                    switch ((nums % 100) % 10) {
                        case 1:
                            third = "one";
                            break;
                        case 2:
                            third = "two";
                            break;
                        case 3:
                            third = "three";
                            break;
                        case 4:
                            third = "four";
                            break;
                        case 5:
                            third = "five";
                            break;
                        case 6:
                            third = "six";
                            break;
                        case 7:
                            third = "seven";
                            break;
                        case 8:
                            third = "eight";
                            break;
                        case 9:
                            third = "nine";
                            break;
                    }
                    res = first + " and " + second + " " + third;
                }

            }
        }
        System.out.println(res);


    }
}
