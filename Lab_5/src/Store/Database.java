import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

abstract class Database {
    private String filename;
    private ArrayList<Record> records = new ArrayList();
    private Record user;

    public Database(String filename) {
        this.filename = filename;
        this.readFromFile();
    }

    public void readFromFile() {
        try {
            File file = new File(this.filename);
            Scanner myReader = new Scanner(file);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                this.records.add(this.createRecordFrom(data));
            }

            myReader.close();
        } catch (FileNotFoundException var4) {
            System.out.println("An error occurred.");
            var4.printStackTrace();
        }

    }

    abstract Record createRecordFrom(String var1);

    public ArrayList<Record> returnAllRecords() {
        return this.records;
    }

    public boolean contains(String key) {
        return this.getRecord(key) != null;
    }

    public Record getRecord(String key) {
        Iterator var2 = this.records.iterator();

        Record record;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            record = (Record)var2.next();
        } while(!key.equals(record.getSearchKey()));

        return record;
    }

    public void insertRecord(Record record) {
        if (record != null && !this.contains(record.getSearchKey())) {
            this.records.add(record);
        }

    }

    public void deleteRecord(String key) {
        Record record = this.getRecord(key);
        if (record != null) {
            this.records.remove(record);
        }

    }

    public void SaveToFile() {
        int recordsCapacity = this.records.size();

        try {
            FileWriter file = new FileWriter(this.filename);

            try {
                Iterator var3 = this.records.iterator();

                while(var3.hasNext()) {
                    Record record = (Record)var3.next();
                    if (this.records.indexOf(record) == recordsCapacity - 1) {
                        file.write(record.lineRepresentation());
                    } else {
                        file.write(record.lineRepresentation() + "\n");
                    }
                }
            } catch (Throwable var6) {
                try {
                    file.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            file.close();
        } catch (IOException var7) {
            System.out.println("An error occurred.");
        }

    }
}