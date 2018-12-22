package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {

            File your_file_name = File.createTempFile("E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2001\\task2001.txt", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            boolean flag = ivanov.equals(somePerson); // не понятно, зачем эта хрень тут
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {

            PrintStream writer = new PrintStream(outputStream);

            String isName = name != null ? "yes" : "no" ;
            String isAssert = assets.size() > 0 ? "yes" : "no" ;

            writer.println(isName);
            writer.println(isAssert);

            if (isName.equals("yes")){
                writer.println(name);
            }

            if (isAssert.equals("yes")) {
                for (Asset asset : assets) {
                    writer.println(asset.getName());
                    writer.println(asset.getPrice());
                }
            }
            writer.flush();
        }

        public void load(InputStream inputStream) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String isName = reader.readLine();
            String isAssert = reader.readLine();

            if(isName.equals("yes")){
                name = reader.readLine();
                if (isAssert.equals("yes")){
                    while (reader.ready()){
                        Asset asset = new Asset(reader.readLine());
                        asset.setPrice(Double.parseDouble(reader.readLine()));
                        assets.add(asset);
                    }
                }
            }
            reader.close();
        }
    }
}
