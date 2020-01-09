package practice015_random_daletou;

import java.util.*;

/**
 * 大乐透随机生成算法 大乐透共前区5个和后驱2个号码
 */
public class Core {

    private int[] pre = {1, 2, 3, 4, 5, 6, 7, 8, 9,
            10, 11, 12, 13, 14, 15,
            16, 17, 18, 19, 20, 21,
            22, 23, 24, 25, 26, 27,
            28, 29, 30, 31, 32, 33,
            34, 35};
    private int[] last = {1, 2, 3, 4, 5, 6, 7, 8, 9,
            10, 11, 12};

    public List getResult() {
        // init preList
        List<Integer> preList = new ArrayList<Integer>();
        for (int i = 0; i < pre.length; i++) {
            preList.add(pre[i]);
        }
        // init lastList
        List<Integer> lastList = new ArrayList<Integer>();
        for (int i = 0; i < last.length; i++) {
            lastList.add(last[i]);
        }
        List<Integer> result = new ArrayList<Integer>();
        // 前区号码生成
        int pSize = pre.length - 1;
        for (int i = 0; i < 5; i++) {
            int i1 = new Random().nextInt(pSize);
            pSize = pSize - 1;
            result.add(preList.get(i1));
            preList.remove(i1);
        }

        // 后驱号码生成
        int lSize = last.length - 1;
        for (int i = 0; i < 2; i++) {
            int i1 = new Random().nextInt(lSize);
            lSize = lSize - 1;
            result.add(lastList.get(i1));
            lastList.remove(i1);
        }

        return result;
    }

    public static void main(String[] args) {
        Core core = new Core();

        System.out.println(core.getResult());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
