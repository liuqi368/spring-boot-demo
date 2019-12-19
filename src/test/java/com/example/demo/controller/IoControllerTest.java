package com.example.demo.controller;

import com.example.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuqi
 * @Title: IoControllerTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/7/59:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IoControllerTest {

   /* @Test
    public void test01() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符");
        char c;
        c = (char) bufferedReader.read();
        System.out.println("你输入的字符为"+c);
    }
    @Test
    public void test02() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符，按 q 键结束");
        char c;
        do {
            c = (char) bufferedReader.read();
            System.out.println("你输入的字符为"+c);
        } while (c != 'q');
    }
    @Test
    public void test03() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一行字符");
        String str = bufferedReader.readLine();
        System.out.println("你输入的字符为" + str);
    }*/
  /*  @Test
    public void test04() throws IOException {
        byte[] bytes = {12,21,34,11,21};
        FileOutputStream fileOutputStream = new FileOutputStream(new File("").getAbsolutePath()+"/test.txt");
        // 写入二进制文件，直接打开会出现乱码
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }*/
   /* @Test
    public void test05() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("").getAbsolutePath()+"/8.png");
        int c;
        // 读取写入的二进制文件，输出字节数组
        while ((c = fileInputStream.read()) != -1) {
            System.out.println(c+"==");
        }
    }*/
    /*@Test
    public void test06() throws IOException {
        FileWriter fileWriter = new FileWriter(new File("").getAbsolutePath()+"/test.txt");
        fileWriter.write("Hello，world！\n欢迎来到 java 世界\n");
        fileWriter.write("不会覆盖文件原本的内容\n");
//        fileWriter.write(null); 不能直接写入 null
        fileWriter.append("并不是追加一行内容，不要被方法名迷惑\n");
        fileWriter.append(null);
        fileWriter.flush();
        System.out.println("文件的默认编码为" + fileWriter.getEncoding());
        fileWriter.close();
    }

    @Test
    public void test07() throws IOException {
        FileWriter fileWriter = new FileWriter(new File("").getAbsolutePath()+"/test.txt", false); // 关闭追加模式，变为覆盖模式
        fileWriter.write("Hello，world！欢迎来到 java 世界\n");
        fileWriter.write("我来覆盖文件原本的内容");
        fileWriter.append("我是下一行");
        fileWriter.flush();
        System.out.println("文件的默认编码为" + fileWriter.getEncoding());
        fileWriter.close();
    }

    @Test
    public void test08() throws IOException {
        FileReader fileReader = new FileReader(new File("").getAbsolutePath()+"/test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        fileReader.close();
        bufferedReader.close();
    }

    @Test
    public void test09() throws IOException {
        FileReader fileReader = new FileReader(new File("").getAbsolutePath()+"/test.txt");
        int c;
        while ((c = fileReader.read()) != -1) {
            System.out.print((char) c);
        }
    }*/

    /*@Test
    public void test10() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("").getAbsolutePath()+"/test2.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK"); // 使用 GBK 编码文件
        outputStreamWriter.write("Hello，world！\n欢迎来到 java 世界\n");
        outputStreamWriter.append("另外一行内容");
        outputStreamWriter.flush();
        System.out.println("文件的编码为" + outputStreamWriter.getEncoding());
        outputStreamWriter.close();
        fileOutputStream.close();
    }*/
    /*@Test
    public void test11() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("").getAbsolutePath()+"/test2.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK"); // 使用 GBK 解码文件
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        bufferedReader.close();
        inputStreamReader.close();
    }*/

    /**
     * 序列化
     * @throws IOException
     */
    /*@Test
    public void test12() throws IOException {
        FileOutputStream fileInputStream = new FileOutputStream(new File("").getAbsolutePath()+"/test3.txt");

        ObjectOutputStream ops = new ObjectOutputStream(fileInputStream);
        ops.writeObject(new Person("vae",1));

        ops.close();
    }*/

    /**
     * 反序列化
     * @throws IOException
     */
    @Test
    public void test13() throws IOException,ClassNotFoundException{
        InputStream in = new FileInputStream(new File("").getAbsolutePath()+"/test3.txt");
        ObjectInputStream os = new ObjectInputStream(in);
        byte[] buffer = new byte[10];
        int len = -1;
        Person p= (Person) os.readObject();
        System.out.println(p);  //Person [name=vae, age=1]
        os.close();
    }

}
