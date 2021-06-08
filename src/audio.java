import javax.media.Manager;
import javax.media.Player;
import java.io.*;
import static java.lang.System.out;
class Audio
{
static public void main(String...ar)throws Exception
{
Player play=Manager.createRealizedPlayer(new File("D:/anijava/src/example.wav").toURI().toURL());
play.start();
Thread.sleep(10000);
out.println("YoYoYOYO");
play.stop();
}
}