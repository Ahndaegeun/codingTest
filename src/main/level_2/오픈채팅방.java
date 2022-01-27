package main.level_2;

import java.util.*;

public class 오픈채팅방 {

    public static String[] solution(String[] record) {
        Map<String, String> nick = new HashMap<>();
        List<String> result = new ArrayList<>();

        for(String item : record) {
            if(!item.substring(0, item.indexOf(" ")).equals("Leave")) {
                nick.put(item.substring(item.indexOf(" "), item.lastIndexOf(" ")), item.substring(item.lastIndexOf(" "), item.length()));
            }
        }


        for(String item : record) {
            String str = "";
            if(item.substring(0, item.indexOf(" ")).equals("Leave")) {
                String finalNick = nick.get(item.substring(item.indexOf(" "), item.length()));
                finalNick = item + finalNick;
                result.add(finalNick);
            } else if (item.substring(0, item.indexOf(" ")).equals("Enter")) {
                String finalNick = nick.get(item.substring(item.indexOf(" "), item.lastIndexOf(" ")));
                finalNick = item.substring(0, item.lastIndexOf(" ")) + finalNick;
                result.add(finalNick);
            }
        }


        String[] answer = new String[result.size()];
        for(int i = 0; i < result.size(); i++) {
            String r = result.get(i);
            if(result.get(i).contains("Enter")) {
                answer[i] = r.substring(r.lastIndexOf(" ") + 1, r.length()) + "님이 들어왔습니다.";
            } else if(result.get(i).contains("Leave")) {
                answer[i] = r.substring(r.lastIndexOf(" ") + 1, r.length()) + "님이 나갔습니다.";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
        // ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
    }
}
