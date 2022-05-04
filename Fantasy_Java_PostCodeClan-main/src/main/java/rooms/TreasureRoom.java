package rooms;
import treasure.Gold;
import treasure.Gemstones;
import treasure.ITreasure;

public class TreasureRoom extends Room {

    private ITreasure treasure;

    public TreasureRoom() {
        getRandomTreasure();
        setCanExit(false);
    }


    public ITreasure getTreasure() {
        return treasure;
    }

    public void getRandomTreasure(){
        int result = getRandomNumber(2);
        if (result == 0){
            this.treasure = new Gold();
        } else if (result == 1){
            this.treasure = new Gemstones();

        }
    }


}
