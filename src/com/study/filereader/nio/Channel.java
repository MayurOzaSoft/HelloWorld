package com.study.filereader.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Channel {
    public static void main(String[] args) throws IOException {
        // Path path = Paths.get("C:\\Users\\mayur.p.ozardekar\\Documents\\IntelliJWorkspace\\HelloWorld\\src\\com\\study\\test.prn");
        RandomAccessFile randomAccessFile = new RandomAccessFile("src/com/study/test.prn", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(48);

        int read = fileChannel.read(byteBuffer);

        while (read != -1){
            //System.out.println("READ : "+ read);
            byteBuffer.flip();

            while (byteBuffer.hasRemaining()){
                System.out.print((char)byteBuffer.get());
            }

            byteBuffer.clear();
            read = fileChannel.read(byteBuffer);
        }
        randomAccessFile.close();


    }
}
