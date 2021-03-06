package groovyfx.music.db.constants;

class DbConstants {
    private DbConstants() {}

    static final String TABLE_ARTISTS = "Artists";
    static final String COLUMN_ARTIST_ID = "_ID";
    static final String COLUMN_ARTIST_NAME = "_Name";
    static final int INDEX_ARTIST_ID = 1;
    static final int INDEX_ARTIST_NAME = 2;

    static final String TABLE_ALBUMS = "Albums";
    static final String COLUMN_ALBUM_ID = "_ID";
    static final String COLUMN_ALBUM_NAME = "_Name";
    static final String COLUMN_ALBUM_ARTIST_ID = "ArtistID";
    static final int INDEX_ALBUM_ID = 1;
    static final int INDEX_ALBUM_ARTIST_ID = 2;
    static final int INDEX_ALBUM_NAME = 3;

    static final String TABLE_SONGS = "Songs";
    static final String COLUMN_SONG_ID = "_ID";
    static final String COLUMN_SONG_TITLE = "Title";
    static final String COLUMN_SONG_TRACK = "Track";
    static final String COLUMN_SONG_ALBUM_ID = "AlbumID";
    static final int INDEX_SONG_ID = 1;
    static final int INDEX_SONG_TITLE = 2;
    static final int INDEX_SONG_TRACK = 3;
    static final int INDEX_SONG_ALBUM_ID = 4;

    static final String VIEW_ARTIST_LIST = "ArtistList";

    static final int ORDER_BY_NONE = 1;
    static final int ORDER_BY_ASC = 2;
    static final int ORDER_BY_DESC = 3;
}
