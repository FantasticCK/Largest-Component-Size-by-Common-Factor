package com.CK;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] A = {2373, 5, 2057, 6155, 9179, 18, 4115, 6165, 5729, 478, 2074, 30, 2079, 6179, 6182, 39, 6184, 4139, 8236, 6189, 6190, 47, 8240, 49, 4149, 9, 8249, 58, 6495, 4157, 8885, 6210, 2115, 68, 74, 8267, 6221, 2127, 4176, 1720, 6228, 1721, 2526, 4185, 8283, 8285, 6241, 6244, 4200, 105, 8299, 108, 5138, 1913, 8305, 8306, 778, 2172, 6270, 6271, 2176, 2177, 2178, 2180, 2181, 6283, 4237, 8334, 9581, 146, 6291, 6293, 8900, 4255, 4257, 8356, 4261, 6312, 1736, 6322, 8374, 2235, 2236, 6334, 5152, 4293, 8459, 4296, 4301, 6352, 6354, 4312, 217, 6362, 8411, 4316, 221, 6366, 2271, 2768, 6371, 2280, 4329, 2286, 239, 1781, 6388, 8437, 247, 4344, 8442, 253, 3043, 6400, 6487, 6405, 2941, 2092, 8458, 2315, 4369, 6624, 3801, 280, 8474, 285, 8479, 555, 6434, 4388, 1414, 4390, 9265, 6440, 2345, 298, 4395, 6444, 9762, 4405, 4407, 2362, 6459, 316, 320, 4417, 2370, 324, 9270, 329, 330, 331, 693, 8331, 341, 8281, 6489, 2394, 7567, 2396, 8543, 8251, 2405, 2407, 6504, 4457, 8741, 6512, 8564, 376, 377, 4474, 2427, 7422, 4482, 8579, 8581, 391, 392, 4489, 396, 1090, 4494, 8591, 4500, 8599, 4505, 8604, 44, 416, 8611, 420, 423, 4521, 4522, 6571, 429, 9288, 8626, 2484, 2487, 3658, 8633, 6586, 1439, 2492, 6590, 2495, 4545, 2498, 2500, 6597, 4553, 6606, 4107, 6609, 5881, 8665, 6618, 8670, 479, 4576, 6699, 4578, 4581, 4584, 6634, 4587, 4588, 2541, 6468, 6640, 8689, 6642, 6569, 504, 5186, 4603, 2474, 2560, 513, 6760, 6662, 2568, 6668, 2573, 2477, 4184, 6675, 4628, 534, 535, 2585, 543, 4645, 433, 8746, 4651, 2604, 8749, 4655, 4657, 562, 8764, 6717, 5952, 3497, 7947, 8339, 4677, 582, 6731, 8781, 8782, 591, 8785, 2642, 6739, 596, 8789, 4696, 2650, 604, 7610, 606, 6753, 614, 8807, 2664, 8201, 623, 4720, 626, 8819, 2677, 4728, 788, 6778, 4731, 21, 6783, 640, 8833, 1027, 8838, 2700, 4750, 4751, 2704, 4753, 2707, 4761, 111, 6813, 4768, 7280, 2722, 8867, 6823, 2728, 3868, 6828, 6829, 686, 7615, 8884, 2741, 694, 8888, 4793, 9298, 2759, 712, 6857, 8909, 8912, 8916, 4821, 2778, 6880, 2786, 741, 4561, 2796, 6367, 2800, 4594, 756, 4853, 4857, 6906, 4223, 765, 6910, 3367, 771, 8964, 6920, 4874, 4226, 4880, 787, 6932, 6934, 6939, 2845, 4895, 6944, 9691, 6948, 7460, 808, 9692, 4909, 817, 3012, 6964, 821, 6233, 823, 824, 2876, 830, 9024, 480, 3301, 4933, 1505, 842, 845, 2824, 9041, 4946, 1223, 9051, 7004, 4958, 7010, 867, 2917, 7014, 7016, 9067, 876, 2926, 488, 4978, 4979, 4980, 7998, 886, 2938, 891, 7037, 895, 4928, 5008, 9091, 2949, 9094, 5002, 2955, 6986, 2957, 7054, 5895, 9106, 7061, 5615, 7069, 2213, 7076, 4941, 9127, 3911, 9133, 3782, 7942, 947, 9141, 9145, 3004, 4938, 3007, 9154, 7108, 7109, 7118, 3023, 976, 978, 982, 3031, 9176, 5081, 5082, 5083, 7132, 8698, 5086, 991, 3041, 5091, 9188, 7141, 5095, 3050, 7335, 850, 5103, 9202, 3059, 7678, 7158, 1015, 3064, 7161, 5116, 9386, 3072, 5123, 3926, 5130, 1035, 7180, 3085, 1038, 9234, 1054, 3103, 9248, 6650, 1058, 8710, 3114, 1067, 9262, 9264, 3121, 3124, 9269, 3126, 5175, 9272, 3129, 9274, 5183, 3138, 3254, 5192, 2572, 3147, 866, 9296, 1106, 3155, 5204, 7256, 4623, 9061, 3169, 3173, 9320, 7880, 5232, 9330, 2579, 4286, 6994, 7294, 5247, 9345, 9347, 7301, 5256, 7306, 1559, 8904, 3213, 9359, 1168, 7315, 3221, 1180, 3232, 3233, 9378, 5287, 7337, 3242, 1195, 9392, 9519, 9398, 3259, 7357, 5312, 3267, 7364, 5317, 9415, 2973, 7714, 5701, 1235, 1237, 7383, 9435, 1247, 5346, 9445, 5350, 7399, 1261, 3310, 5359, 3315, 9463, 9385, 6698, 5374, 3327, 7427, 2945, 7433, 7435, 3340, 1475, 1295, 7443, 3348, 7446, 9496, 9502, 3359, 5409, 1314, 1316, 1318, 6705, 3368, 7465, 5418, 1325, 5422, 4317, 1928, 7476, 5430, 9528, 3385, 5434, 5435, 1340, 1343, 9536, 9537, 9538, 907, 227, 5446, 3400, 3403, 3298, 1358, 7504, 5459, 9557, 1367, 5464, 3418, 5468, 5469, 1375, 2960, 1378, 9573, 9574, 3432, 5482, 3437, 7534, 3440, 1393, 1395, 7544, 9593, 1403, 3452, 7550, 5503, 3456, 576, 3460, 7558, 577, 3466, 9612, 9613, 5518, 5357, 3472, 5524, 9621, 9624, 3481, 9627, 1437, 7749, 7585, 9641, 7598, 9117, 1458, 7603, 3509, 9658, 5565, 7614, 4341, 7619, 5575, 9216, 9673, 7628, 9678, 1491, 6734, 3542, 7483, 5594, 6735, 3548, 9694, 9696, 5601, 1506, 7652, 9702, 4689, 7657, 3563, 9708, 3666, 3567, 5617, 9714, 3571, 6398, 3574, 5623, 2644, 7677, 9726, 1535, 7681, 3586, 4011, 3120, 5640, 8303, 1548, 7695, 3602, 4007, 7703, 5656, 9754, 7707, 1564, 9757, 1567, 5665, 3618, 1571, 5668, 9772, 9773, 9780, 3637, 5698, 3651, 3653, 7751, 5706, 1611, 9804, 7757, 7828, 5715, 6073, 1627, 5724, 9821, 5728, 7777, 7780, 1638, 3686, 9832, 7100, 9834, 1645, 5742, 7101, 8808, 1650, 9844, 5749, 5753, 1659, 1642, 9854, 5759, 7810, 5766, 9863, 7816, 3109, 7820, 5780, 9879, 3736, 9881, 4719, 7838, 7842, 3697, 5800, 2989, 1953, 7852, 5876, 3761, 9907, 7860, 5813, 3768, 7796, 3774, 9920, 5827, 1733, 9926, 9928, 3785, 9930, 5839, 1745, 5844, 1751, 9944, 5849, 7899, 3804, 1757, 9950, 3807, 5860, 3813, 5862, 5864, 9963, 3264, 1775, 7920, 59, 7861, 1780, 3829, 1783, 9977, 1663, 5885, 9982, 9607, 1798, 9991, 3851, 6786, 1808, 5912, 1819, 7964, 7903, 7969, 7971, 5924, 9862, 9199, 9180, 7983, 5768, 3894, 7993, 1852, 5790, 3903, 3904, 3906, 130, 5959, 3724, 8013, 8019, 8022, 5387, 5977, 8026, 8028, 1885, 3387, 8039, 8040, 1899, 1900, 3950, 1903, 4155, 1906, 6004, 1910, 609, 1684, 6010, 9535, 8060, 5098, 8062, 6016, 6018, 8067, 5315, 3976, 8514, 8079, 8657, 3987, 7833, 8516, 2031, 1949, 8517, 4001, 8099, 7494, 1958, 6055, 8105, 8107, 1010, 6063, 9203, 6068, 9886, 8119, 1977, 4026, 6076, 8130, 1355, 8132, 8134, 8137, 4043, 1996, 4770, 1998, 2000, 4050, 5113, 3065, 8153, 7223, 6750, 4062, 8161, 6114, 8165, 6118, 6121, 4077, 6127, 2033, 2034, 8179, 9615, 4086, 4087, 2040, 2042, 2389};
        System.out.println(new Solution().largestComponentSize(A));
    }
}

class Solution2 {
    public int largestComponentSize(int[] A) {
        int N = A.length;

        // factored[i] = a list of unique prime factors of A[i]
        ArrayList<Integer>[] factored = new ArrayList[N];
        for (int i = 0; i < N; ++i) {
            factored[i] = new ArrayList<Integer>();
            int d = 2, x = A[i];
            while (d * d <= x) {
                if (x % d == 0) {
                    while (x % d == 0)
                        x /= d;
                    factored[i].add(d);
                }

                d++;
            }

            if (x > 1 || factored[i].isEmpty())
                factored[i].add(x);
        }

        // primesL : a list of all primes that occur in factored
        Set<Integer> primes = new HashSet();
        for (List<Integer> facs : factored)
            for (int x : facs)
                primes.add(x);

        int[] primesL = new int[primes.size()];
        int t = 0;
        for (int x : primes)
            primesL[t++] = x;

        // primeToIndex.get(v) == i  iff  primes[i] = v
        Map<Integer, Integer> primeToIndex = new HashMap();
        for (int i = 0; i < primesL.length; ++i)
            primeToIndex.put(primesL[i], i);

        DSU dsu = new DSU(primesL.length);
        for (List<Integer> facs : factored)
            for (int x : facs)
                dsu.union(primeToIndex.get(facs.get(0)), primeToIndex.get(x));

        int[] count = new int[primesL.length];
        for (List<Integer> facs : factored)
            count[dsu.find(primeToIndex.get(facs.get(0)))]++;

        int ans = 0;
        for (int x : count)
            if (x > ans)
                ans = x;
        return ans;
    }
}

class DSU {
    int[] parent;

    public DSU(int N) {
        parent = new int[N];
        for (int i = 0; i < N; ++i)
            parent[i] = i;
    }

    public int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int x, int y) {
        parent[find(x)] = find(y);
    }
}

class Solution {

    int[] p;

    int get(int x){
        return p[x]==x ? x : (p[x]=get(p[x])) ;
    }

    void add(int x, int y){
        p[get(x)]=p[get(y)];
    }

    public int largestComponentSize(int[] A) {
        int mx=0;
        for(int i:A) mx=Math.max(i, mx);
        p=new int[mx+1];
        for(int i=1;i<=mx;++i) p[i]=i;
        for(int i:A)
            for(int j=(int)Math.sqrt(i);j>=2;--j)
                if(i%j==0){
                    add(i, j);
                    add(i, i/j);
                }
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        int res=0;
        for(int i:A){
            int j=get(i);
            if(!map.containsKey(j)) map.put(j, 1);
            else map.put(j, map.get(j)+1);
            res=Math.max(res, map.get(j));
        }
        return res;
    }
}