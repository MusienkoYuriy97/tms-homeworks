package entity;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement(name = "»гра√орода")
public class Move {
    private final Map<Player, Cities> playerMoves;

    public Move() {
        playerMoves = new HashMap<>();
    }

    @XmlElementWrapper(name = "’оды»гроков")
    public Map<Player, Cities> getPlayerMoves() {
        return playerMoves;
    }

    @Override
    public String toString() {
        return "’оды игроков  - " + playerMoves.toString();
    }

    public void add(Player player){
        playerMoves.put(player, new Cities());
    }

}
