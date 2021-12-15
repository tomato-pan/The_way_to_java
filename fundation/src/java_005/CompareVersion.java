package java_005;

public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        int m = version1.length(), n = version2.length();
        for(int i=0,j=0; i<m||j<n; i++,j++){
            int a = 0, b = 0;
            while(i<m && version1.charAt(i) != '.')
                a = 10 * a + (version1.charAt(i++) - '0');
            while(j<n && version2.charAt(j) != '.')
                b = 10 * b + (version2.charAt(j++) - '0');
            if(a<b)
                return -1;
            else if(a>b)
                return 1;
        }
        return 0;
    }

}
