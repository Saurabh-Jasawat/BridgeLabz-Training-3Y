package workshop;
public class SentenceFormatter {
        public static String format(String text) {
            text = text.trim().replaceAll("\\s+", " ");
            StringBuilder result = new StringBuilder();
            boolean capitalize = true;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (capitalize && Character.isLetter(c)) {
                    result.append(Character.toUpperCase(c));
                    capitalize = false;
                } else {
                    result.append(c);
                }
                if (c == '.' || c == '?' || c == '!') {
                    capitalize = true;
                    if (i + 1 < text.length() && text.charAt(i + 1) != ' ') {
                        result.append(' ');
                    }
                }
            }
            return result.toString().trim();
        }
        public static void main(String[] args) {
            String input = "hello world.this is a test!is it working?yes,it is.";
            System.out.println(format(input));
        }
    }
