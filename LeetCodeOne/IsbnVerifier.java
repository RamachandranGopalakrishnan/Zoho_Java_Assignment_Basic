package LeetCodeOne;

class IsbnVerifier {

    boolean isValid(String s) {
        int sum=0;
        int count=10;
        int missCount=0;
        
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-')continue;
            char v=s.charAt(i);
            if(Character.isDigit(v)){
                sum+=Integer.parseInt(String.valueOf(v))*count;
                count--;
            }
            else if(s.charAt(i)=='X' && i==s.length()-1){
                sum+=10*count;
                count--;
            }
            else{
                return false;
            }
        }
        if(count!=0)return false;
        if(sum%11==0)return true;
        return false;
        
    }

}
