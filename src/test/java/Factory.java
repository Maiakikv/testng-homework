public class Factory {
    @org.testng.annotations.Factory
    public Object[] createInstances() {
        Object[] result = new Object[3];
        result[0] =new FactoryTest("Maia", "Kikvadze", "Female", "599041180");
        result[1] =new FactoryTest("Giorgi", "Kiladze", "Male", "57714152");
        result[2] =new FactoryTest("ragac", "vigac", "Other", "1111");

        return result;
    }


}
