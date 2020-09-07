package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Album;
import com.example.model.Artist;
import com.example.model.Genre;
import com.example.model.Track;
import com.example.service.*;
import com.mongodb.DBObject;
import com.mongodb.client.gridfs.model.GridFSFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HelloController {

    @Autowired
    private TrackService trackService;
    @Autowired
    private GenreService genreService;
    @Autowired
    private AlbumService albumService;
    @Autowired
    private ArtistService artistService;
//    @Autowired
//    private GridFsService gridFsService;


    @GetMapping(path = "/index")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        Track track = trackService.findTrack(5);
        List<Track> tracks = trackService.findTracksByArtist(3);
        model.addObject("track", tracks);
        return model;
    }

    @GetMapping(path = "/chooseGenre")
    public ModelAndView changeGenregetGet() {
        ModelAndView model = new ModelAndView("chooseGenre");
        List<Genre> genres = genreService.findAllGenres();
        model.addObject("genres", genres);
        return model;
    }

    @GetMapping(path = "/tracksByGenre")
    public ModelAndView trackByGenre(@RequestParam("genre_id") int id) {
        ModelAndView model = new ModelAndView("tracksByGenre");
        List<Track> tracksByGenre = trackService.findTracksByGenre(id);
        Genre genre = genreService.findGenre(id);
        model.addObject("tracksByGenre", tracksByGenre);
        model.addObject("genre", genre);
        return model;
    }

    @GetMapping(path = "/chooseArtist")
    public ModelAndView changeArtist() {
        ModelAndView model = new ModelAndView("chooseArtist");
        List<Artist> artists = artistService.findAllArtists();
        model.addObject("artists", artists);
        return model;
    }

    @GetMapping(path = "/chooseAlbum")
    public ModelAndView changeAlbum() {
        ModelAndView model = new ModelAndView("chooseAlbum");
        List<Album> albums = albumService.findAllAlbums();
        model.addObject("albums", albums);
        return model;
    }

    @GetMapping(path = "/chooseTrack")
    public ModelAndView changeTrack() {
        ModelAndView model = new ModelAndView("chooseTrack");
        List<Track> tracks = trackService.findAllTracks();
        model.addObject("tracks", tracks);
        return model;
    }

    @GetMapping(path = "/track")
    public ModelAndView track(@RequestParam("track_id") int id) {
        ModelAndView model = new ModelAndView("track");
        Track track = trackService.findTrack(id);
        List<Artist> artists = new ArrayList<>();
        List<Album> albums = new ArrayList<>();
        List<Genre> genres = new ArrayList<>();
        for (int artistsIds : track.getArtistsIds()) {
            artists.add(artistService.findArtist(artistsIds));
        }
        for (int albumsIds : track.getAlbumsIds()) {
            albums.add(albumService.findAlbum(albumsIds));
        }
        for (int genresIds : track.getGenresIds()) {
            genres.add(genreService.findGenre(genresIds));
        }
        model.addObject("track", track);
        model.addObject("artists", artists);
        model.addObject("albums", albums);
        model.addObject("genres", genres);
        return model;
    }

    @GetMapping(path = "/artist")
    public ModelAndView artist(@RequestParam("artist_id") int id) {
        ModelAndView model = new ModelAndView("artist");
        List<Track> tracks = trackService.findTracksByArtist(id);
        Artist artist = artistService.findArtist(id);
        List<Album> albums = albumService.findAlbumsByArtist(id);
        List<Genre> genres = new ArrayList<>();
        for (int genresIds : artist.getGenresIds()) {
            genres.add(genreService.findGenre(genresIds));
        }
        model.addObject("tracks", tracks);
        model.addObject("artist", artist);
        model.addObject("albums", albums);
        model.addObject("genres", genres);
        return model;
    }

    @GetMapping(path = "/album")
    public ModelAndView album(@RequestParam("album_id") int id) {
        ModelAndView model = new ModelAndView("album");
        Album album = albumService.findAlbum(id);
        List<Track> tracks = trackService.findTracksByAlbum(id);
        List<Artist> artists = artistService.findArtistsByAlbum(id);
        List<Genre> genres = new ArrayList<>();
        for (int genresIds : album.getGenresIds()) {
            genres.add(genreService.findGenre(genresIds));
        }
        model.addObject("tracks", tracks);
        model.addObject("artists", artists);
        model.addObject("album", album);
        model.addObject("genres", genres);
        return model;
    }


    @GetMapping(path = "/audioDemo")
    public ModelAndView audioDemo() {
        ModelAndView model = new ModelAndView("audioDemo");
        return model;
    }

//    @GetMapping(path = "/playTrack")
//    public ResponseEntity<FileSystemResource> play(@RequestParam("track_id") String track_title) throws IOException {
//        String mp3Path = "C:\\Users\\Сергей\\Desktop\\" + path1;
//        Path path = Paths.get(mp3Path);
//        String contentType = Files.probeContentType(path);
//        FileSystemResource file = new FileSystemResource(mp3Path);
//        return ResponseEntity.ok()
//                .contentType(MediaType.parseMediaType(contentType))
//                .contentLength(file.contentLength())
//                .body(file);
//    }

    @GetMapping(path = "/css")
    public ResponseEntity<FileSystemResource> bootstrap(@RequestParam("css") String css) throws IOException {
        String source = "C:\\Users\\Сергей\\Desktop\\проект\\demo\\src\\main\\webapp\\WEB-INF\\views\\css\\css\\" + css;
        Path path = Paths.get(source);
        String contentType = Files.probeContentType(path);
        FileSystemResource file = new FileSystemResource(source);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .contentLength(file.contentLength())
                .body(file);
    }

    @GetMapping(path = "/picture")
    public ResponseEntity<FileSystemResource> picture() throws IOException {
        String source = "C:\\Users\\Сергей\\Desktop\\проект\\картинки\\заставка сайта.jpg";
        Path path = Paths.get(source);
        String contentType = Files.probeContentType(path);
        FileSystemResource file = new FileSystemResource(source);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .contentLength(file.contentLength())
                .body(file);
    }
}
