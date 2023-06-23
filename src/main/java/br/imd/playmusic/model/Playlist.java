package br.imd.playmusic.model;

import java.util.ArrayList;
import java.util.List;
public class Playlist {
    private String name;
    private List<Song> songs;
    private String filePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void addSong(Song song) {
        // Lógica para adicionar uma música à playlist
        songs.add(song);
        System.out.println("Adicionando a música " + song.getTitle() + " à playlist " + name);
    }

    public void removeSong(Song song) {
        // Lógica para remover uma música da playlist
        songs.remove(song);
        System.out.println("Removendo a música " + song.getTitle() + " da playlist " + name);
    }
}
