public class BufferedReaderEx {
    public static void main(String[] args) {
        try{
            //     Create a fileReader object connected to the File
            FileReader fileReader = new FileReader("poem.txt") ;
            //  Create a
            BufferReader bufferReader = new BufferedReader(fileReader);
            String input;
            //read until there is no more data
            while((input = bufferReader.readLine()) != null){
                System.out.println(input);
            }
            //close the sream and release the resources
            bufferReader.close();
        }  catch (IOException e){

        }
    }
}
