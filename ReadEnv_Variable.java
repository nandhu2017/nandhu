public class System_variable {
    public static  void  main(String args[]) throws  Exception
    {
        String key="Properties_File";
        String var=System.getenv(key.replace('\\','/'));
        System.out.println(var);
    }
}
