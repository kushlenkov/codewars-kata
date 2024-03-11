//public class MorseCodeDecoder {
//    public static String decode(String morseCode) {
//        morseCode = morseCode.trim();
//        String[] words = morseCode.split(" ");
//        StringBuilder build = new StringBuilder();
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].equals("") && !words[i+1].equals("")) {
//                build.append(" ");
//            } else if (!words[i].equals("")) {
//                build.append(MorseCode.get(words[i])); // библиотека CW
//            }
//        }
//        return build.toString();
//    }
//}