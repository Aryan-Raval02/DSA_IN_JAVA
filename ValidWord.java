public class ValidWord 
{
    public static boolean isValid(String word)
    {
        if(word.length() < 3 ) return false;

        if(!word.matches("[a-zA-Z0-9]+")) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        hasVowel = word.matches(".*[aeiouAEIOU].*");

        hasConsonant = word.matches(".*[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z].*");

        return hasVowel && hasConsonant;

    }
    public static boolean isValid2(String word)
    {
        if (word.length() < 3) {
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                char ch = Character.toLowerCase(c);
                if (
                    ch == 'a' ||
                    ch == 'e' ||
                    ch == 'i' ||
                    ch == 'o' ||
                    ch == 'u'
                ) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return hasVowel && hasConsonant;
    }

    public static boolean isValid3(String word)
    {
        if (word.length() < 3) 
        {
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;
        for (char c : word.toCharArray()) 
        {
            if(Character.isLetter(c))
            {
                char c1 = Character.toLowerCase(c);
                switch (c1) 
                {
                    case 'a':
                    case 'i':
                    case 'e':
                    case 'o':
                    case 'u':
                        hasVowel = true;
                        break;
                    default :
                        hasConsonant = true;
                        break;
                }
            }
            else if(!Character.isDigit(c))
            {
                return false;
            }
        }
        return hasVowel && hasConsonant;
    }

    public static void main(String[] args) 
    {
        System.out.println(isValid3("234Adas"));
        System.out.println(isValid3("b3"));
        System.out.println(isValid3("A2dvhgT$GFC"));
        System.out.println(isValid3("aya"));
        System.out.println(isValid3("UuE6"));
    }
}
