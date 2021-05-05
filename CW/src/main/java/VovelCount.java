public class VovelCount {

    public static int getCount(String str) {
        return str.toUpperCase().length() - str.replaceAll("(?i)"+"[aeuoi]","").length() ;
    }

}
