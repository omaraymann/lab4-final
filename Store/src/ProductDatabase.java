public class ProductDatabase extends Database{
    public ProductDatabase(String filename) {
        super(filename);
    }
    @Override
    public Product createRecordFrom(String line)
    {
        String [] taken=line.split(",");
        Product  user = new Product(taken[0], taken[1], taken[2], taken[3], Integer.parseInt(taken[4]), Float.parseFloat(taken[5]));
        return user;
    }
}
