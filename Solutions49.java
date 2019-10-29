package main.cczq.zrh;
/*����һ���ַ������飬����ĸ��λ�������һ����ĸ��λ��ָ��ĸ��ͬ�������в�ͬ���ַ�����

ʾ��:

����: ["eat", "tea", "tan", "ate", "nat", "bat"],
���:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
˵����

���������ΪСд��ĸ��
�����Ǵ������˳��
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solutions49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
        	char[] charArr = s.toCharArray();
        	Arrays.sort(charArr);
        	String key = String.valueOf(charArr);
        	if(!map.containsKey(key)) map.put(key, new ArrayList<String>());
        	map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
	
//	public List<List<String>> groupAnagrams(String[] strs) {
//		int[] dic = new int[26];
//		Map<String, List<String>> map = new HashMap<>();
//		for(String s:strs) {
//			Arrays.fill(dic, 0);
//			StringBuilder sb = new StringBuilder();
//			char[] arr = s.toCharArray();
//			for(char c:arr) {
//				dic[c-'a']++;
//			}
//			for(int i=0;i<26;i++) {
//				sb.append("#");
//				sb.append(dic[i]);
//			}
//			String key = sb.toString();
//			if(!map.containsKey(key)) map.put(key, new ArrayList<String>());
//			map.get(key).add(s);
//		}
//		return new ArrayList<>(map.values());
//	}
	
	public static void main(String[] args) {
		String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
		Solutions49 solutions49 = new Solutions49();
		System.out.println(solutions49.groupAnagrams(strings));
	}
}
