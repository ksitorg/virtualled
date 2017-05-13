package example; /**
 * Created by Tim on 11.05.2017.
 */

import org.ardulink.core.Link;
import org.ardulink.core.convenience.Links;
import org.ardulink.core.events.RplyEvent;
import org.ardulink.core.events.RplyListener;
import org.ardulink.util.URIs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ArduinoTest {
    public static void main(String[] args) throws InterruptedException, IOException {

        Link link = Links.getLink(URIs.newURI("ardulink://serial-jssc?port=COM4"));
        link.addRplyListener(new RplyListener() {
            @Override
            public void rplyReceived(RplyEvent e) {
                if(e.isOk())
                    System.out.println("Message " + e.getId() + " ok");
                else
                    System.out.println("Message " + e.getId() + " not ok");
            }
        });

        int r = 255;
        int g = 0;
        int b = 0;
        int w = 0;
        //Set idleColor
        link.sendCustomMessage("colr/"+r+","+g+","+b+","+w+"/");
        int i = 0;
        while (true) {

            if(i == 5) {
                link.sendCustomMessage("colr/0,255,0,0/");
            }

            long msgId = link.sendCustomMessage("rgbw/500/0,0,0,255/");
            //long msgId = link.sendCustomMessage("colr/"+r+","+g+","+b+",0/");

            //Will send: alp://cust/rgbw/500/255,0,0,0/?id=XXXX

            System.out.println("Message Send "+msgId);
            TimeUnit.MILLISECONDS.sleep(2000);
            i++;
            //TimeUnit.SECONDS.sleep(1);
        }
    }
}
