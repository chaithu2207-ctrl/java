class Strings
{
    public static void main(String[]args)
    {
        String text= "Hello Java";
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.substring(6));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.contains("Java"));
        System.out.println(text.startsWith("Hello"));
        System.out.println(text.endsWith("Java"));
        System.out.println(text.indexOf("Java"));
    }
}