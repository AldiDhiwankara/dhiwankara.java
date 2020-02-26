class abc{
    public static void main(String[] args){
        char[] alphabetBesar = new char[26];
        for(char c = 'A'; c <= 'Z'; ++c){
            alphabetBesar[c-'A'] = c;
        }
        
        System.out.println("Isi dari array of character Besar adalah");
        for(int i=0; i<=26; i++){
                System.out.println(alphabetBesar[i]);
        }
    }
}