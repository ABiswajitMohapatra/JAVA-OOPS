public class StringInbuilt {
    public static void main(String[] args) {
        String str="Biswa";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));
        System.out.println(str.replace("Biswa","Vishesh"));
        System.out.println(str.startsWith("B"));
        System.out.println(str.endsWith("B"));
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf("B"));
        System.out.println(str.lastIndexOf("s"));
        String v="Biswa";
        String v2="Biswa";
        System.out.println(v.equals(v2));
        String v3="Biswa";
        String v4="biswa";
        System.out.println(v3.equalsIgnoreCase(v4));
    }
}
