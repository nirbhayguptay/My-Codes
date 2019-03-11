 static boolean isAnagram(String a, String b) {
     int k1[]=new int[26];
        int k2[]=new int[26];
        int l=a.length();
        int e=b.length();
        if(!((l>=1 && l<=50) && (e>=1 && e<=50) && e==l))
            return false;
        a=a.toUpperCase();
        b=b.toUpperCase();   
        
        int x;
        for(x=0;x<26;x++)
        {
            k1[x]=0;
            k2[x]=0;
        }   
        
        for(x=0;x<l;x++)
        {
            int y=(int)a.charAt(x)-65;
            k1[y]=k1[y]+1;
        }
        
        for(x=0;x<e;x++)
        {
            int y=(int)b.charAt(x)-65;
            k2[y]=k2[y]+1;
        }
        
        for(x=0;x<26;x++)
            if(k1[x]!=k2[x])
                break;
        if(x==26)
            return true;
        else
            return false;
    }   