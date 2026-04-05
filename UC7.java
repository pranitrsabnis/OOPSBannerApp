public class OOPSBannerApp {
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public Character getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] maps = new CharacterPatternMap[4];
        maps[0] = new CharacterPatternMap('O', new String[]{
            "  *** ", " ** ** ", "** **", "** **", "** **", " ** ** ", "  *** "
        });
  
        maps[1] = new CharacterPatternMap('P', new String[]{
            " ***** ", " ** **", " ** **", " ***** ", " ** ", " ** ", " ** "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
            "  **** ", " ** ", "  *** ", "     **", "     **", " ** **", "  **** "
        });

        maps[3] = new CharacterPatternMap(' ', new String[]{
            "       ", "       ", "       ", "       ", "       ", "       ", "       "
        });

        return maps;
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        return charMaps[3].getPattern();
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int patternHeight = 7; 
        for (int i = 0; i < patternHeight; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append("  "); // Add spacing between letters
            }
            System.out.println(line.toString());
        }
    }
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
