public class test2 {
    public String makePermutations(String str) {
        // TODO:
        if(str.equals("")) return "";

        StringBuilder sb = new StringBuilder();

        for(int idx1 = 0; idx1 < str.length(); idx1++) {
            for(int idx2 = 0; idx2 < str.length(); idx2++) {
                sb.append(str.charAt(idx1) + "" + str.charAt(idx2)).append(',');
            }
        }

        return sb.substring(0, sb.length() - 1);
    }

    public String makePermutations2(String str) {
        // TODO:
        if(str.equals("")) return "";

        char[] chars = str.toCharArray();
        String[] s = new String[str.length() * str.length()]; // str 길이가 얼마일지 모르는 상황 -> 100이라고 단정을 짓는건 100가지 이상이 나올수도 있기 때문에 불가
        // 문자열 길이가 7, 7 * 7 = 49가지
        // 첫 번째 자리에 나올 수 있는 문자가 7개, 두 번째 자리에 나올 수 있는 문자가 7개 -> 7 * 7개
        int index = 0; // s라는 배열에 값을 넣어야하는데, 어떤 자리에 값을 넣을지에 대한 index

        for(int i = 0; i < chars.length; i++) {
            for(int j = 0; j < chars.length; j++) {
                s[index] = chars[i] + "" + chars[j];
                index++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int idx = 0; idx < s.length; idx++) {
            sb.append(s[idx]).append(',');
        }

        // 마지막 문자가 ',' 로 끝날텐데, 출력상에서 마지막에는 ','가 없음
        return sb.substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
        test2 t = new test2();
        System.out.println(t.makePermutations("123"));
    }
}
