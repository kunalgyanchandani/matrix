package com.kg.matrix.theory.windows;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class SystemTrayMatrix {
    public static void main(String... args) throws AWTException {

        TrayIcon ti = new TrayIcon(Toolkit.getDefaultToolkit().createImage(new byte[]{1,1}));
        SystemTray.getSystemTray().add(ti);
        ti.addActionListener(rec->
        {
            try {
                Desktop.getDesktop().browse(URI.create("https://google.com"));
                //Runtime.getRuntime().exec("https://google.com");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        ti.displayMessage("launch","google",TrayIcon.MessageType.INFO);
    }
}
