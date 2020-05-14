package solutions;

import solutions.configuration.PrintArrayAbstractClass;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress extends PrintArrayAbstractClass {
    @Override
    public void run() {
        String[] str = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.print(numUniqueEmails(str));
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        String at = "@";
        char plus = '+';
        char dot = '.';
        for(String str : emails){
            StringBuilder sb = new StringBuilder();
            String[] strArray = str.split(at);
            String local = strArray[0];
            String domain = strArray[1];

            for(char c: local.toCharArray()){
                if(c == plus) break;
                else if(c == dot){
                    continue;
                }
                else{
                    sb.append(c);
                }
            }
            sb.append(at).append(domain);
            set.add(sb.toString());
        }
        return set.size();
    }
}
