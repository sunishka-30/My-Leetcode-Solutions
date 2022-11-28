//counting sort
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> seen = new HashSet<>();
        Map<Integer, Integer> lossesCount = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0], loser = match[1];
            seen.add(winner);
            seen.add(loser);
            lossesCount.put(loser, lossesCount.getOrDefault(loser, 0) + 1);
        }

        // Add players with 0 or 1 loss to the corresponding list.
        List<List<Integer>> answer =
            Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for (int player : seen) {
            if (!lossesCount.containsKey(player)) {
                answer.get(0).add(player);
            } else if (lossesCount.get(player) == 1) {
                answer.get(1).add(player);
            }
        }

        Collections.sort(answer.get(0));
        Collections.sort(answer.get(1));

        return answer;
    }
}

// class Solution {
//     public List<List<Integer>> findWinners(int[][] matches) {
//         Set<Integer> zeroLoss = new HashSet<>(), oneLoss = new HashSet<>(),
//                 moreLosses = new HashSet<>();

//         for (int[] match : matches) {
//             int winner = match[0], loser = match[1];
//             // Add winner.
//             if (!oneLoss.contains(winner) && !moreLosses.contains(winner)) {
//                 zeroLoss.add(winner);
//             }
//             // Add or move loser.
//             if (zeroLoss.contains(loser)) {
//                 zeroLoss.remove(loser);
//                 oneLoss.add(loser);
//             } else if (oneLoss.contains(loser)) {
//                 oneLoss.remove(loser);
//                 moreLosses.add(loser);
//             } else if (moreLosses.contains(loser)) {
//                 continue;
//             } else {
//                 oneLoss.add(loser);
//             }
//         }

//         List<List<Integer>> answer =
//             Arrays.asList(new ArrayList<>(), new ArrayList<>());
//         answer.get(0).addAll(zeroLoss);
//         answer.get(1).addAll(oneLoss);
//         Collections.sort(answer.get(0));
//         Collections.sort(answer.get(1));

//         return answer;
//     }
// }