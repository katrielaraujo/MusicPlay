module br.imd.playmusic {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens br.imd.playmusic to javafx.fxml;
    exports br.imd.playmusic;
}