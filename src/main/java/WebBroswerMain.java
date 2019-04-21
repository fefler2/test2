import javax.swing.*;
import java.awt.*;

public class WebBroswerMain extends JPanel{

    public static void main(String[] args) {
        JFrame window = new JFrame("VerySimpleWebBrowser");
        WebBroswerMain webBroswerMain = new WebBroswerMain();

        window.setContentPane(webBroswerMain);
        window.setSize(1200, 900);

    }


    public WebBroswerMain(){
        setBackground(Color.LIGHT_GRAY);
    }
}
