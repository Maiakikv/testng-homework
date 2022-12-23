public class DataProvider {

    @org.testng.annotations.DataProvider(name = "dataProvider")
    public Object[][] data(){
        return new Object[][] {
                {"Maia", "Kikvadze", "Female", "599041180"},
                {"Giorgi", "Kiladze", "Male", "57714152"},
                {"ragac", "vigac", "Other", "1111"}
        };
    }
}
