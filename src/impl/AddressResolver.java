package impl;

import java.util.Map;

public class AddressResolver {
    private Map<String, String> keyWords = Map.of("Ave.", "Avenue", "Ave,", "Avenue,",
            "St.", "Street", "St,", "Street,", "St.,", "Street,",
            "Str.","Street", "Str,", "Street,", "Str.,", "Street," );


    public String fixAddressWithRegExp(String address) {
        String abbreviationWord = getAddressAbbreviationIfExists(address);
        String a = address.replace(abbreviationWord, keyWords.get(abbreviationWord));
        return address.replace(abbreviationWord, keyWords.get(abbreviationWord));
    }

    public String fixAddress(String address) {
        String[] words = address.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if(keyWords.containsKey(words[i])) {
                words[i] = keyWords.get(words[i]);
            }
            result.append(words[i]).append(" ");
        }
        return result.toString();
    }

    private String getAddressAbbreviationIfExists(String address) {
        String result = "";
        for (String kw : keyWords.keySet()) {
            if (address.matches(".* " + kw + ".*")) {
                result = kw;
                break;
            }
        }
        return result;
    }
}
