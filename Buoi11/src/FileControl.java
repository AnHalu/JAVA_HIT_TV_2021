import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileControl {
    private FileWriter fileWriter; // mở file
    private BufferedWriter bufferedWriter; // tạo 1 lớp để ghi
    private PrintWriter printWriter;// đối tượng để ghi
    private Scanner scanner;

    public void openFileToWrite(String fileName) throws IOException {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void closeFileAfterWrite() {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void openFileToRead(String fileName) {
        try {
            scanner = new Scanner(Paths.get(fileName));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void closeFileAfterRead() {
        scanner.close();
    }

    public void writeAccountToFile(String fileName, Account acc) throws IOException {
        openFileToWrite(fileName);
        printWriter.println(acc.getId() + "|" + acc.getFullName() + "|" + acc.getUsername() + "|" + acc.getPassword()
                + "|" + acc.getEmail() + "|" + acc.getPhone() + "|" + acc.getCreateAt());
        closeFileAfterWrite();
    }

    public Account createAccountFromData(String data) {
        String [] accItem = data.split("\\|");
        Account account = new Account(Long.parseLong(accItem[0]), accItem[1], accItem[2], accItem[3], accItem[4], accItem[5], accItem[6]);
        return account;
    }

    public List<Account> readAccountFromFile(String fileName) {
        openFileToRead(fileName);
        List<Account> accounts = new ArrayList<>();
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            accounts.add(createAccountFromData(str));
        }
        closeFileAfterRead();
        return accounts;
    }

    public void updateAccountToFile(String fileName, List<Account> accounts) throws IOException {
        File file = new File(fileName);
        if(file.exists()) {
            file.delete();
        }
        openFileToWrite(fileName);
        for(Account account : accounts) {
            printWriter.println(account.getId() + "|" + account.getFullName() + "|" + account.getUsername() + "|" +
                    account.getPassword() + "|" + account.getEmail() + "|" + account.getEmail() + "|" +
                    account.getPhone() + "|" + account.getCreateAt());
        }
        closeFileAfterWrite();
    }

}
