package com.x2space.lambda;

import java.util.*;

public class Room {
    // 1、准备好54张牌，给房间使用；定义一个集合容器装54张牌
    private ArrayList<Card> allCards = new ArrayList<>();
    // 2、初始化54张牌进去
    {
        // 3、准备点数、花色
        String[] colors = {"♥", "♦", "♣", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A", "2"};
        // 4、开始初始化
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                allCards.add(new Card(numbers[i], colors[j], i+1, j+1));
            }
        }
        Collections.addAll(allCards, new Card("", "joker", 13, 4), new Card("", "JOKER", 14, 4));
        System.out.println("新牌是：" + allCards);
    }

    public void start() {
        // 5、洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);

        // 6、发牌 : 定义三个玩家：玩家1、玩家2、玩家3
        Map<String, List<Card>> players = new HashMap<>();
        players.put("玩家1", new ArrayList<>());
        players.put("玩家2", new ArrayList<>());
        players.put("玩家3", new ArrayList<>());

        for (int i = 0; i < allCards.size() - 3; i++) {
            Card card = allCards.get(i);
            switch (i % 3) {
                case 0:
                    players.get("玩家1").add(card);
                    break;
                case 1:
                    players.get("玩家2").add(card);
                    break;
                case 2:
                    players.get("玩家3").add(card);
                    break;
            }
        }

        // 7、拿最后三张底牌
        List<Card> lastCards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("底牌是：" + lastCards);

        players.get("玩家1").addAll(lastCards);

        // 8、对牌排序
        for (String s : players.keySet()) {
            Collections.sort(players.get(s), (o1, o2) -> o2.getSizeIndex() - o1.getSizeIndex() == 0 ? o2.getColorIndex() - o1.getColorIndex() : o2.getSizeIndex() - o1.getSizeIndex());
        }

        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            System.out.println(entry.getKey() + "的牌是：" + entry.getValue());
        }
    }
}
