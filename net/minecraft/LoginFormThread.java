package net.minecraft;

import java.net.URL;
import javax.swing.JTextPane;

public class LoginFormThread extends Thread
{
  private JTextPane editorPane;

  public LoginFormThread(JTextPane editorPane)
  {
    this.editorPane = editorPane;
  }

  public void run()
  {
    try
    {
      editorPane.setPage(new URL("http://mineqc.webuda.com/launcher/info.html"));
    }
    catch (Exception e)
    {
      e.printStackTrace();
      editorPane.setText("Impossible de charger les news du serveur..." + e.toString() + "</center></font></body></html>");
    }
  }
}

