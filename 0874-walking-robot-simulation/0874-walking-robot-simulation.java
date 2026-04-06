class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        int x = 0, y = 0;
        int dir = 0;

        int[][] directions = {
            {0,1}, {1,0}, {0,-1}, {-1,0}
        };

        int maxDis = 0;

        for(int cmd : commands){

            if(cmd == -1){
                dir = (dir + 1) % 4;
            }
            else if(cmd == -2){
                dir = (dir - 1 + 4) % 4;
            }
            else{
                for(int i = 0; i < cmd; i++){

                    int nextX = x + directions[dir][0];
                    int nextY = y + directions[dir][1];

                    // 🔍 check obstacle using loop
                    boolean isObstacle = false;
                    for(int[] ob : obstacles){
                        if(ob[0] == nextX && ob[1] == nextY){
                            isObstacle = true;
                            break;
                        }
                    }

                    if(isObstacle){
                        break; // stop moving
                    }

                    x = nextX;
                    y = nextY;

                    maxDis = Math.max(maxDis, x*x + y*y);
                }
            }
        }

        return maxDis;
    }
}