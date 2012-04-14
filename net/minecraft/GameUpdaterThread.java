package net.minecraft;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

public class GameUpdaterThread extends Thread
{
  private URLConnection urlconnection;
  private InputStream[] is;

  public GameUpdaterThread(InputStream[] is, URLConnection urlconnection)
  {
    this.is = is;
    this.urlconnection = urlconnection;
  }

  public void run()
  {
    try {
      is[0] = urlconnection.getInputStream();
    }
    catch (IOException localIOException)
    {
    }
  }
}

