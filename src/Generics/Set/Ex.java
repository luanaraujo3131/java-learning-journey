package Generics.Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
        
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            Set<LogEntry> set = new HashSet<>();

            String eachLine = bufferedReader.readLine();
            while(eachLine != null){
                String[] fields = eachLine.split(" ");
                String userName = fields[0];
                try {
                    Date moment = Date.from(Instant.parse(fields[1]));
                    set.add(new LogEntry(userName, moment));
                } catch (DateTimeParseException e) {
                    System.out.println("Error parsing date for line: " + eachLine);
                }
                eachLine = bufferedReader.readLine();
            }
            System.out.println("Total users: " +set.size());
        } catch(IOException e){
            System.out.println("Error: " +e.getMessage());
        } 
        sc.close();
    }
}

class LogEntry{

    private String userName;
    private Date moment;

    public LogEntry(String userName, Date moment) {
        this.userName = userName;
        this.moment = moment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LogEntry other = (LogEntry) obj;
        if (userName == null) {
            if (other.userName != null)
                return false;
        } else if (!userName.equals(other.userName))
            return false;
        return true;
    }
}
