package kodlamaIo.logging;

public class FileLogger implements BaseLogger{

    @Override
    public void log(String data) {
        // TODO Auto-generated method stub
        System.out.println("Dosyaya loglandı :"+data);
        
    }

    
}
