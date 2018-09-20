import client.OcrTask;

/**
 * @author karmanzeng
 * @email karmanzeng@cumt.edu.cn
 * @since 2018-09-19 21:34:54
 * */
public class OCRClient {
    public static void main(String []args) throws Exception{
        System.out.print(OcrTask.run("front","D:\\Temp\\Dataset\\IdCard\\front\\1.jpg","D:\\Temp\\Dataset\\Output"));
    }
}
