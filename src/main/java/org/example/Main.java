package org.example;

import java.io.File;

public class Main {
    public AwsS3 awsS3 = AwsS3.getInstance();

    public static void main(String[] args) {

        Main main = new Main();
        File file = new File("D:\\img\\cc.png");

        String key = "img/cc.png";

        //upload 실행하기.
        main.upload(file, key);
    }

    //업로드
    public void upload(File file, String key) {
        awsS3.upload(file, key);
    }

    //복사 메서드
    public void copy(String orgkey, String copyKey) {
        awsS3.copy(orgkey, copyKey);
    }

    //삭제 메서드
    public void delete(String key) {
        awsS3.delete(key);
    }
}