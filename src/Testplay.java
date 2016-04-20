
import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nhutdev
 */
public class Testplay {
    public static AdvancedPlayer player = null;
    public AdvancedPlayer phatsong(String psong) {
            try {
                String song = psong;
                BufferedInputStream in = new BufferedInputStream(new URL(song).openStream());
                
                // if (player != null) player.stop();
                
                player = new AdvancedPlayer(in);
                player.play();
//                Thread.sleep(5000);
//                player.stop();
    //            Thread.sleep(5000);
    //            player.playInternal();
                return player;
            } catch (final Exception e) {
                throw new RuntimeException(e);
            }
    }
}
