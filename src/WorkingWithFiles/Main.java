package src.WorkingWithFiles;

import src.ArrayListAndHashMap.CustomArrayList;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader( new FileReader("InputFileReader.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("OutputFileWriter"))){
            String str;
            while((str = br.readLine()) != null){
                if(str.equals("чтения"))
                    str = "записи";
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        try(ByteArrayOutputStream bo = new ByteArrayOutputStream();
            FileWriter fw1 = new FileWriter("ByteArray.txt")){

                bo.write("hello".getBytes());

            byte[] byteArray = bo.toByteArray();

            ByteArrayInputStream bi = new ByteArrayInputStream(byteArray);

            for(int i = 0; i < byteArray.length; i++) {;
                fw1.write((char)bi.read());
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        // ищу ошибку
//        try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("DataOutputStream.txt"));
//            DataInputStream di = new DataInputStream(new FileInputStream("InputFileReader.txt"))){
//
//            while(di.available() >0) {
//                String str = di.readUTF();
//                System.out.println(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        CustomArrayList<Integer> array = new CustomArrayList<>();
        array.add(1);
        array.add(2);

        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("ObjectStream.txt"));
             ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("ObjectStream.txt"))){
            objOut.writeObject(array);

            array = (CustomArrayList<Integer>) objIn.readObject();
            System.out.println(array.toString());
        } catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
