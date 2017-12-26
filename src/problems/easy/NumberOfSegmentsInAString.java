package problems.easy;

/**
 * Created by stream on 17-4-22.
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

 Please note that the string does not contain any non-printable characters.

 Example:

 Input: "Hello, my name is John"
 Output: 5
 */
public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int ret=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '&&(i==0||s.charAt(i-1)==' '))
                ret++;
        }
        return ret;
    }
}
