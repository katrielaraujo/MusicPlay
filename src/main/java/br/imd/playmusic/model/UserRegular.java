package br.imd.ufrn.mediaplayer.model;

public class UserRegular extends User{
    private String PathDirector;

    public String getFilePathDirectories() {
        return PathDirector;
    }

    public void setFilePathDirectories(String filePathDirectories) {
        this.PathDirector = filePathDirectories;
    }
}
