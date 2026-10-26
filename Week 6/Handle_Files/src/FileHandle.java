import java.io.*;

public class FileHandle {
    public static int checkInputPath(String path){
        File f = new File(path);
        if (f.exists()){
            if (f.isFile()){
                System.out.println("Path to file");
                return 1;
            }
            else {
                System.out.println("Path to dir");
                return 2;
            }
        }
        else {
            System.out.println("Path doesn't exist");
            return 0;
        }
    }

    public static void getAllJava(String path){
        File f = new File(path);
        File[] found = f.listFiles();
        int count = 0;

        if (checkInputPath(path) == 2){
            if (found != null) {
                for (int i = 0; i < found.length; i++) {
                    if (found[i].isFile() && found[i].getName().endsWith(".java")) {
                        System.out.println(found[i].getName());
                        count++;
                    }
                }
                System.out.println(count);
            }
            else{
                System.out.println("Dir is empty");
            }
        }
    }


    public static void getGreater(String path, long size){
        File f = new File(path);
        File[] found = f.listFiles();
        int count = 0;

        if (checkInputPath(path) == 2){
            if (found != null) {
                for (int i = 0; i < found.length; i++) {
                    if (found[i].isFile() && found[i].length() > size*1024) {
                        System.out.println(found[i].getName());
                        count++;
                    }
                }
                System.out.println(count);
            }
            else{
                System.out.println("Dir is empty");
            }
        }
    }

    public static void writeFile(String path, String text){
        File f = new File(path);

        if (f.exists() && f.isFile() && f.getName().endsWith(".txt")) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
                bw.newLine();
                bw.write(text);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void countWords(String path){
        File f = new File(path);
        int count = 0;
        String line;

        if (checkInputPath(path) == 1 && f.getName().endsWith(".txt")) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))){
                while ((line = br.readLine()) != null) {
                    String[] temp = line.split("\\s+");
                    count += temp.length;
                }
                System.out.println(count);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static int ShowAndGet(){
        System.out.println("""
                ========= File Processing =========
                1. Check path
                2. Get file name with type java
                3. Get file with size greater than input
                4. Write more content to file
                5. Read file and write character
                6. Exit
                """);

        return DataInput.GetIntInRange("> ", 1, 6);
    }

    static void main(String[] args) {
        while (true){
            int choice = ShowAndGet();
            switch (choice){
                case 1:
                    checkInputPath(DataInput.inputString("Input Dir> "));
                    break;

                case 2:
                    getAllJava(DataInput.inputString("Input Dir> "));
                    break;

                case 3:
                    String directory = DataInput.inputString("Input Dir> ");
                    System.out.print("Input size (KB)> ");
                    getGreater(directory, DataInput.inputInt());
                    break;

                case 4:
                    writeFile(DataInput.inputString("Input file path> "), DataInput.inputContent("Input content> "));
                    break;

                case 5:
                    countWords(DataInput.inputString("Input file path> "));
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
