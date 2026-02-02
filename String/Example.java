class Example
{
    public static void main(String[] args)
    {
        String str = "resume.pdf";

        String extension = str.substring(str.lastIndexOf('.')+1);

        System.out.println(extension);
    }
}
