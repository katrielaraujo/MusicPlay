package br.imd.ufrn.mediaplayer.model;

import java.util.ArrayList;
import java.util.List;

public class UserVIP extends User {
    private List<Playlist> playlists;

    public UserVIP() {
        this.playlists = new ArrayList<>();
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public void createPlaylist(String name,String filePath) {
        Playlist playlist = new Playlist();
        playlists.add(playlist);
        System.out.println("Playlist " + name + " criada para o usuário VIP " + getName());
    }

    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
        System.out.println("Playlist " + playlist.getName() + " removida para o usuário VIP " + getName());
    }

    public void addSongToPlaylist(Song song, Playlist playlist) {
        playlist.addSong(song);
        System.out.println("Música " + song.getTitle() + " adicionada à playlist " + playlist.getName() +
                " do usuário VIP " + getName());
    }

    public void removeSongFromPlaylist(Song song, Playlist playlist) {
        playlist.removeSong(song);
        System.out.println("Música " + song.getTitle() + " removida da playlist " + playlist.getName() +
                " do usuário VIP " + getName());
    }
}
