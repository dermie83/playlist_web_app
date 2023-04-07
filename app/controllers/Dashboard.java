package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Playlist;
import models.Song;
import play.Logger;
import play.mvc.Controller;

public class Dashboard extends Controller
{
  public static void index()
  {
    Logger.info("Rendering Admin");

    List<Playlist> playlists = Playlist.findAll();
    render ("dashboard.html", playlists);
  }

  public static void deleteplaylist (Long id)
  {
    Playlist playlist = Playlist.findById(id);
    playlist.delete();
    Logger.info ("Removing ", playlist.title);

    render("dashboard.html", playlist);
  }

}

