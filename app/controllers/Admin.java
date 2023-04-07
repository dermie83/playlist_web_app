package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Playlist;
import models.Song;
import play.Logger;
import play.mvc.Controller;

public class Admin extends Controller
{
    public static void index()
    {
        Logger.info("Rendering Admin");

        // TODO - get list of all songs, and send them to the view
        List<Song> songs = Song.findAll();
        render ("admin.html", songs);
    }
}
