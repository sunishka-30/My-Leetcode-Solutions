class Solution {
    
    private class Engineer{
        private int speed;
        private int efficiency;
        
        public Engineer(int speed, int efficiency){
            this.speed=speed;
            this.efficiency=efficiency;
        }
    }
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        long m = 1000000007;
        List<Engineer> engineers = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            engineers.add(new Engineer(speed[i],efficiency[i]));
        }
        
        engineers.sort((a,b)->b.efficiency-a.efficiency); //decreasing efficiency
        PriorityQueue<Engineer> currentTeam = new PriorityQueue<>((a,b) -> a.speed - b.speed); //slow speed guys at top
        
        long teamSpeed = 0;
        long maxPer = 0;
        
        for(Engineer newHire : engineers)
        {
            if(currentTeam.size()==k)
            {
                Engineer slowGuy = currentTeam.poll();
                teamSpeed = teamSpeed - slowGuy.speed;
            }
            
            currentTeam.add(newHire);
            teamSpeed = teamSpeed + newHire.speed;
            
            long latestPerf = teamSpeed * (long)newHire.efficiency;
            maxPer = Math.max(maxPer,latestPerf);
            
        }
        
        return (int) (maxPer%m);
        
    }
}