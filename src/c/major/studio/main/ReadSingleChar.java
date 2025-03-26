package c.major.studio.main;

import java.io.IOException;

public class ReadSingleChar {
    public static void main(String[] args) throws IOException {
        System.out.print("请输入一个字符: ");
        char ch = (char) System.in.read(); // 读取单个字符，不需要回车
        System.out.println("你输入的字符是: " + ch);
    }
}	